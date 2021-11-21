package exportkit.xd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import api.ApiCalls;
import jsonParsing.Product;

public class ItemDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);
        String productId = getIntent().getExtras().getString("product");
        Product productDetails = ApiCalls.getProductInfo(productId);
    }
}
