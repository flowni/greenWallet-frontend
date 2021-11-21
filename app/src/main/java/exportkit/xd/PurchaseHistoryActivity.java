package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        ArrayList<String> imageUrls = new ArrayList<>(Arrays.asList());
        ArrayList<String> stores = new ArrayList<>();
        ArrayList<String> score = new ArrayList<>();

        List<Purchase> listOfPurchases = ApiCalls.get_purchases_of_user("2");
        for(int i = 0;i < listOfPurchases.size();i++) {
            stores.add(listOfPurchases.get(i).getPartner_name());
            score.add(listOfPurchases.get(i).getTotal_coins());
            imageUrls.add(listOfPurchases.get(i).getPartner_icon_url());
        }

        PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, stores, score, imageUrls);
        recyclerView.setAdapter(purchaseHistoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
    public void sendMessage(View view) {
        Intent intent = new Intent(PurchaseHistoryActivity.this, SplashScreenActivity.class);
        startActivity(intent);
    }
}