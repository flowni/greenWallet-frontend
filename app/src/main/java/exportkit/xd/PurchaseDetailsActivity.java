package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import jsonParsing.Product;

public class PurchaseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_details);

        // mock data
        Product product = new Product();
        product.setProduct_name("test product");
        Product products[] = new Product[]{product, product, product, product, product,product,product, product,product};

        GridView gridView = (GridView)findViewById(R.id.gridview);
        PurchaseDetailsAdapter booksAdapter = new PurchaseDetailsAdapter(this, products);
        gridView.setAdapter(booksAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Product product = products[position];
                System.out.println("product clicked: " + product.getProduct_name());

                // slide open details of product


                // This tells the GridView to redraw itself
                // in turn calling your BooksAdapter's getView method again for each cell
                booksAdapter.notifyDataSetChanged();
            }
        });


    }
}