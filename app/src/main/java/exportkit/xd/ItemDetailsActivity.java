package exportkit.xd;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import api.ApiCalls;
import jsonParsing.Product;

public class ItemDetailsActivity extends AppCompatActivity {

    private TextView productNameTextView;
    private ImageView productImageView;
    private TextView mainCategory;
    private TextView ingrediants;
    private TextView manufacturePlace;
    private TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        productNameTextView = findViewById(R.id.textView4);
        productImageView = findViewById(R.id.imageView3);
        mainCategory = findViewById(R.id.textView6);
        ingrediants = findViewById(R.id.textView9);
        manufacturePlace = findViewById(R.id.textView12);
        score = findViewById(R.id.textView14);


        String productId = getIntent().getExtras().getString("product");
        Product productDetails = ApiCalls.getProductInfo(productId);
        productNameTextView.setText(productDetails.getProduct_name());
        // productImageView.setImageBitmap(productDetails.getImage());
        // mainCategory.setText(??);
        // ingrediants.setText();
        manufacturePlace.setText(productDetails.getManufacturing_places());
        //which score?
        score.setText(productDetails.getNova_score());

    }
}
