package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import api.ApiCalls;
import jsonParsing.Purchase;

public class PurchaseHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[];
    double scores[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<String> stores = new ArrayList<>();
        ArrayList<String> score = new ArrayList<>();

        List<Purchase> listOfPurchases = ApiCalls.get_purchases_of_user("2");
        for(int i = 0;i < listOfPurchases.size();i++) {
            stores.add(listOfPurchases.get(i).getPartner_name());
            score.add(listOfPurchases.get(i).getPartner_id());
        }

        PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, stores, score);
        recyclerView.setAdapter(purchaseHistoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
}