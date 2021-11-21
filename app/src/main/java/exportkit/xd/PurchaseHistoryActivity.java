package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PurchaseHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[];
    double scores[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = new String[]{"Rewe", "Aldi", "Edeka", "Rewe"};
        scores = new double[]{11.0, 32.3, 32.2, -23.2};


        PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, s1, scores);
        recyclerView.setAdapter(purchaseHistoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
}