package top.lc951.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static void main(String[] args) {

        String str = "A-123";
        System.out.println("Start txt="+str);
        Pattern r = Pattern.compile( "^[A-Z]-");
        Matcher m = r.matcher(str);
        System.out.println(m.find());
        System.out.println("group ="+m.group());
        System.out.println("end ="+m.end());
        String result=m.replaceAll("B-");
        System.out.println("result ="+result);
    }
}
