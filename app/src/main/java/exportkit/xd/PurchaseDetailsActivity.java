package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import api.ApiCalls;
import jsonParsing.Product;
import jsonParsing.Purchase;

public class PurchaseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_details);
        String purchaseId = getIntent().getExtras().getString("purchase_id");

        Purchase purchase = ApiCalls.getPurchaseDetails(purchaseId);
        Product[] products = purchase.getProducts();

        GridView gridView = (GridView)findViewById(R.id.gridview);
        PurchaseDetailsAdapter booksAdapter = new PurchaseDetailsAdapter(this, products);
        gridView.setAdapter(booksAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Product product = products[position];
                System.out.println("product clicked: " + product.getProduct_name());

                // slide open details of product

                Intent intent = new Intent(PurchaseDetailsActivity.this, ItemDetailsActivity.class);
                //intent.putExtra("product", product.getId());
                intent.putExtra("product", "1");
                startActivity(intent);


                // This tells the GridView to redraw itself
                // in turn calling your BooksAdapter's getView method again for each cell
                booksAdapter.notifyDataSetChanged();
            }
        });


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(PurchaseDetailsActivity.this, ItemDetailsActivity.class);
        intent.putExtra("product","1");
        startActivity(intent);
    }
}