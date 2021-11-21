package exportkit.xd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import jsonParsing.Product;

public class PurchaseDetailsAdapter extends BaseAdapter {

    private final Context mContext;
    private final Product[] products;

    public PurchaseDetailsAdapter(Context context, Product[] products) {
        this.mContext = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Product product = products[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.purchase_detail_grid_item, null);
        }

        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_product);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_product_name);

        // set dynamic data
        //imageView.setImageResource();
        nameTextView.setText(product.getProduct_name());

        return convertView;
    }

}
