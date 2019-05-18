package top.lc951.utils;

import android.content.Context;

import com.leo.gesturelibrary.util.ConfigUtil;

import static com.leo.gesturelibrary.util.ConfigUtil.PASS_KEY;

/**
 */
public class PasswordUtil {

    /**
     * 获取设置过的密码
     */
    public static String getPin(Context context) {
        String password = ConfigUtil.getInstance(context).getString(PASS_KEY);
        return password;
    }
}
