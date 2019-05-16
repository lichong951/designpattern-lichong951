package top.lc951.utils;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileUtils {
    /**
     * 追加文件：使用FileOutputStream，在构造FileOutputStream时，把第二个参数设为true
     *
     * @param filePath
     * @param content
     */
    public static void writeFile1(String filePath, String content) {
        BufferedWriter out = null;
        try {
            createFile(filePath);
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(filePath, true)));
            out.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 追加文件：使用FileWriter
     *
     * @param fileName
     * @param content
     */
    public static void writeFileDefault(String fileName, String content) {

        try {
            createFile(fileName);
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.exists())
            return;
        if (filePath.endsWith(File.separator)) {
            System.out.println("创建单个文件" + filePath + "失败，目标文件不能为目录！");
            return ;
        }
        //判断目标文件所在的目录是否存在
        if(!file.getParentFile().exists()) {
            //如果目标文件所在的目录不存在，则创建父目录
            System.out.println("目标文件所在目录不存在，准备创建它！");
            if(!file.getParentFile().mkdirs()) {
                System.out.println("创建目标文件所在目录失败！");
                return ;
            }
        }

        if (file.createNewFile()) {
            System.out.println("创建单个文件" + filePath + "成功！");
            return ;
        } else {
            System.out.println("创建单个文件" + filePath + "失败！");
            return ;
        }

    }

    /**
     * 追加文件：使用RandomAccessFile
     *
     * @param fileName 文件名
     * @param content  追加的内容
     */
    public static void writeFile3(String fileName, String content) {
        try {
            createFile(fileName);
            // 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
            // 文件长度，字节数
            long fileLength = randomFile.length();
            // 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.writeBytes(content);
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件或文件夹
     *
     * @param filePath
     */
    public static void deleFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleFile(file1.getAbsolutePath());
            }
        } else if (file.isFile()) {
            file.delete();
            return;
        }

    }

    public static void main(String[] args) {
        final String filePath = "d:/log/test.txt";
        ExecutorService mExecutorService = Executors.newCachedThreadPool();
        writeFileDefault(filePath, "===========分隔线============ \n");

        for (int i = 0; i < 50; i++) {
            final int id = i;

            mExecutorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    writeFileDefault(filePath, "【id = " + id + "】" + System.currentTimeMillis() + " \n");
                    System.out.println("【id = " + id + "】");
                }
            });
        }


    }
}
