package api;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import android.os.StrictMode;

import java.util.List;

import jsonParsing.User;

public class ApiCalls {

    public static String getUser(String user) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ANRequest request = AndroidNetworking.get("https://greenwallet.azurewebsites.net/user/{user}")
                .addPathParameter("user", user)
                .setPriority(Priority.LOW)
                .build();
        ANResponse<User> response = request.executeForObject(User.class);
        if (response.isSuccess()) {
            return response.getResult().getName();
            // List<User> users = responseTwo.getResult();
        } else {
            // handle error
            return "1";
        }
    }
}
