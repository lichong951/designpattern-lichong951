package top.lc951.socket;

import sun.rmi.runtime.Log;

import java.io.*;
import java.net.Socket;

public class ClientSocket {
    static final String IP = "192.168.43.1";
//    static final String IP = "10.1.190.57";
    static final int PORT = 9966;

    public static void main(String[] args) {
        Socket socket;
        try {
            //这里进行连接服务器，
            socket = new Socket(IP, PORT);
            //获取输入流
            DataInputStream input = new DataInputStream(socket.getInputStream());
            String txt=receiveTxt(input);

            //获取输出流
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            sendTextMsg(out, "准备发送图片文件！");

            txt=receiveTxt(input);
            sendTextMsg(out, txt);
            FileInputStream inputStream = new FileInputStream(new File("F:/新工地宝/AppIcon512.png"));
            byte[] buf = new byte[1024];
            int len;
            //判断是否读到文件末尾
            while ((len = inputStream.read(buf)) != -1) {
                out.write(buf, 0, len);//将文件循环写入输出流
            }
            //告诉服务端，文件已传输完毕
            socket.shutdownOutput();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String receiveTxt(DataInputStream input) throws IOException {
        //读取长度，也即是消息头，
        long len = input.readLong();
        //创建这个长度的字节数组
        byte[] bytes = new byte[(int) len];
        //再读取这个长度的字节数，也就是真正的消息体
        input.read(bytes);
        //将字节数组转为String
        String s = new String(bytes);
        System.out.println("accept " + "msg: " + s);
        return s;
    }

    public static void sendTextMsg(DataOutputStream out, String msg) throws IOException {
        //先写长度，就是消息体的字节数，long刚好8个字节
        out.writeLong(msg.getBytes().length);
        //写入消息
        out.write(msg.getBytes());
    }
}
