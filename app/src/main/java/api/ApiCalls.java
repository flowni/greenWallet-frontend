package api;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import android.os.StrictMode;

import java.util.List;

import jsonParsing.Product;
import jsonParsing.Purchase;
import jsonParsing.User;

public class ApiCalls {

    public static User getUser(String user) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ANRequest request = AndroidNetworking.get("https://greenwallet.azurewebsites.net/user/{user}")
                .addPathParameter("user", user)
                .setPriority(Priority.LOW)
                .build();
        ANResponse<User> response = request.executeForObject(User.class);
        if (response.isSuccess()) {
            return response.getResult();
        } else {
            return null;
        }
    }

    public static List<Purchase> get_purchases_of_user(String user) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ANRequest request = AndroidNetworking.get("https://greenwallet.azurewebsites.net/purchases/{user}")
                .addPathParameter("user", user)
                .setPriority(Priority.LOW)
                .build();
        ANResponse<List<Purchase>> response = request.executeForObjectList(Purchase.class);
        if (response.isSuccess()) {
            return response.getResult();
        } else {
            return null;
        }
    }

    public static Purchase getPurchaseDetails(String purchaseId) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ANRequest request = AndroidNetworking.get("https://greenwallet.azurewebsites.net/purchase_details/{user}")
                .addPathParameter("user", purchaseId)
                .setPriority(Priority.LOW)
                .build();
        ANResponse<Purchase> response = request.executeForObject(Purchase.class);
        if (response.isSuccess()) {
            return response.getResult();
        } else {
            return null;
        }
    }

    public static Product getProductInfo(String purchaseId) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ANRequest request = AndroidNetworking.get("https://greenwallet.azurewebsites.net/product_info/{product_id}")
                .addPathParameter("product_id", purchaseId)
                .setPriority(Priority.LOW)
                .build();
        ANResponse<Product> response = request.executeForObject(Product.class);
        if (response.isSuccess()) {
            return response.getResult();
        } else {
            return null;
        }
    }
}
