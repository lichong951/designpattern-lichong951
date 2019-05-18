package top.lc951.utils;

/**
 * Created by lichong on 2018/7/24.
 *
 * @ Email lichongmac@163.com
 * 说明
 * 1）异常输出工具
 */
public class ExceptionUtil {

    public static void print(Exception e){
        try {
            throw e;
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static  void throwIllegalArgumentException(String msg) {
        throw new IllegalArgumentException(msg);
    }

}
