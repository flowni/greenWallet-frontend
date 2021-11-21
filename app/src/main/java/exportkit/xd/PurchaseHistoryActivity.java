package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import api.ApiCalls;
import jsonParsing.Purchase;

public class PurchaseHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<String> imageUrls = new ArrayList<String>(Arrays.asList("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Logo_Edeka.svg/2000px-Logo_Edeka.svg.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Lidl-Logo.svg/2048px-Lidl-Logo.svg.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/H%26M-Logo.svg/1280px-H%26M-Logo.svg.png"));
        ArrayList<String> stores = new ArrayList<>();
        ArrayList<String> score = new ArrayList<>();

        List<Purchase> listOfPurchases = ApiCalls.get_purchases_of_user("2");
        for(int i = 0;i < listOfPurchases.size();i++) {
            stores.add(listOfPurchases.get(i).getPartner_name());
            score.add(listOfPurchases.get(i).getPartner_id());
        }

        PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, stores, score, imageUrls);
        recyclerView.setAdapter(purchaseHistoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }


}