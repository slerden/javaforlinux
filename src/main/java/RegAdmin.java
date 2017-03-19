import com.squareup.okhttp.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Itword on 19.03.2017.
 */
public class RegAdmin {
    public static void main(String[] args) throws IOException {
        String username = "";
        String password = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Input username: ");
        username = in.nextLine();
        System.out.println("Input password: ");
        password = in.nextLine();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://popolnyalka.hopto.org:8080/popolnyalka/regAdmin?username="+username+"&password="+password)
                .build();
        System.out.println(request.toString());
        Response response = null;
        try {
            response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }


    }
}
