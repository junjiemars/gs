/**
 * Created by junjie on 9/29/14.
 */
import com.google.gson.Gson;

import java.util.regex.Pattern;

import static java.lang.System.out;

public class Hello {
    public static void main(String[] args) {
        final String s = "新夜话无眠：4G^10.0，， ，  漫游^20.1。闲时^19.2|省钱^1.5";
        final Pattern p = Pattern.compile("\\s*[ \\u3002:\\uff1a,\\uff0c|]\\s*");
        final String[] a = p.split(s);
        for (String i : a) {
            out.println(i);
        }
    }

    public static final String S_HELLO="Hello,world";
}
