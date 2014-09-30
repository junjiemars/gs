/**
 * Created by junjie on 9/29/14.
 */
import com.google.gson.Gson;

import static java.lang.System.out;

public class Hello {
    public static void main(String[] args) {
        out.println("Hello");

        Gson gson = new Gson();
        String j = gson.toJson("{ name: John, age: 28 }");
        out.println(j);

    }
}
