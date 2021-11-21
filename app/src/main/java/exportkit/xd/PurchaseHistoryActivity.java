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

public class PurchaseHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], imageUrls[];
    double scores[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = new String[]{"Rewe", "Aldi", "Edeka", "Rewe"};
        scores = new double[]{11.0, 32.3, 32.2, -23.2};
        imageUrls = new String[]{"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Logo_Edeka.svg/2000px-Logo_Edeka.svg.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Lidl-Logo.svg/2048px-Lidl-Logo.svg.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/H%26M-Logo.svg/1280px-H%26M-Logo.svg.png", "https://upload.wikimedia.org/wikipedia/commons/0/08/Rewe_Logo.png"};




        PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, s1, scores, imageUrls);
        recyclerView.setAdapter(purchaseHistoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }


}