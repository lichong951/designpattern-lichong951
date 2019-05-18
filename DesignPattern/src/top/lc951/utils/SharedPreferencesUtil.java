package top.lc951.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class SharedPreferencesUtil {
    public static final String SETTING_ANIM_STEP_VALUE = "setting_anim_step_value";
    public static final String AIR_TEMPE_MIN = "airTempeMin";
    public static final String AIR_TEMPE_MAX = "airTempeMax";
    public static final String FINGER_IS_USING = "fingIsUsing";
    public static final String AIR_HUM_MIN = "airHumMin";
    public static final String AIR_HUM_MAX = "airHumMax";
    public static final String AIR_ENABLE = "airEnable";
    private static SharedPreferencesUtil _instance = new SharedPreferencesUtil();
    public static SharedPreferencesUtil Instance(){
        return _instance;
    }
    private String KEY = "top.lc951.smartShelf";
    private SharedPreferences mSharedPreferences;

    public static final String IS_FOLLOW_DEVICE ="isFollowDevice";
    public static final String IS_VOICE_AUTH="isVoiceAuth";

    public static final String ARCHIVES_IP="ArchivesIp";
    public static final String ARCHIVES_PORT="ArchivesPort";
    public static final String MAIN_IP="mainIp";
    public static final String MAIN_PORT="mainPort";



    public void init(Context context){
        if(mSharedPreferences == null){
            mSharedPreferences= context.getApplicationContext().getSharedPreferences(KEY,0);
        }
    }

    /**
     * str: md5+isTracing
     */
    public void put(String id, String str){
        mSharedPreferences.edit().putString(id,str).commit();
    }

    public String get(String id){
        return mSharedPreferences.getString(id,"");
    }

    public String getMd5(String id){
        String str = mSharedPreferences.getString(id,"");
        if(!"".equals(str)){
            return str.substring(0,str.length()-1);
        }
        return "";
    }

    public int getIsTracing(String id){
        String str = mSharedPreferences.getString(id,"");
        if(str != null&&str.length()>0){
            return Integer.valueOf(str.substring(str.length()-1),str.length());
        }
        return 1;
    }

    public void remove(String id){
        mSharedPreferences.edit().remove(id).commit();
    }

    public Set<String> getIds(){
        return mSharedPreferences.getAll().keySet();
    }
    public void clear(){
        mSharedPreferences.edit().clear().commit();
    }

    public void putBoolean(String key, boolean b) {
        mSharedPreferences.edit().putBoolean(key,b).commit();
    }

    public boolean getBoolean(String key){
        return mSharedPreferences.getBoolean(key,false);
    }
    public boolean getBooleanDefaultFalse(String key){
        return mSharedPreferences.getBoolean(key,false);
    }

    public boolean putInt(String mainPort, int port) {
        return mSharedPreferences.edit().putInt(mainPort,port).commit();
    }

    public int getInt(String key) {
        return mSharedPreferences.getInt(key,0);
    }
    public boolean putFloat(String mainPort, float port) {
        return mSharedPreferences.edit().putFloat(mainPort,port).commit();
    }

    public float getFloat(String key) {
        return mSharedPreferences.getFloat(key,0);
    }
}
