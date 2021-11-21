package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import api.ApiCalls;
import jsonParsing.Purchase;
import jsonParsing.User;
import util.BarcodeEncoderUtil;

public class Finance_tracker__community__activity extends Activity {

	
	private View _bg__homescreen;
	private View rectangle_7;
	private TextView title;
	private ImageView header_ek1;
	private ImageView union_ek1;
	private TextView title_ek1;
	private TextView title_ek2;
	private TextView amount_ek6;
	private ImageView image_7;
	private Button gotoPurchaseHistoryBtn;
	private RecyclerView recyclerViewDashboard;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.finance_tracker__community_);

		
		_bg__homescreen = (View) findViewById(R.id._bg__homescreen);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		title = (TextView) findViewById(R.id.title);
		header_ek1 = (ImageView) findViewById(R.id.header_ek1);
		union_ek1 = (ImageView) findViewById(R.id.union_ek1);
		title_ek1 = (TextView) findViewById(R.id.title_ek1);
		title_ek2 = (TextView) findViewById(R.id.title_ek2);
		amount_ek6 = (TextView) findViewById(R.id.amount_ek6);
		image_7 = (ImageView) findViewById(R.id.image_7);
		gotoPurchaseHistoryBtn = (Button) findViewById(R.id.button);
		recyclerViewDashboard = (RecyclerView) findViewById(R.id.recyclerViewDashboard);

		User user = ApiCalls.getUser("1");
		Bitmap barcodeEncoded = BarcodeEncoderUtil.createBarcode(user.getBarcode());
		title_ek1.setText("Welcome to your wallet, "+user.getName()+"!");
		image_7.setImageBitmap(barcodeEncoded);
		amount_ek6.setText(user.getBalance());


		ArrayList<String> imageUrls = new ArrayList<>(Arrays.asList());
		ArrayList<String> stores = new ArrayList<>();
		ArrayList<String> score = new ArrayList<>();

		List<Purchase> listOfPurchases = ApiCalls.get_purchases_of_user("2");
		for(int i = 0;i < listOfPurchases.size() || i > 4;i++) {
			stores.add(listOfPurchases.get(i).getPartner_name());
			score.add(listOfPurchases.get(i).getTotal_coins());
			imageUrls.add(listOfPurchases.get(i).getPartner_icon_url());
		}

		PurchaseHistoryAdapter purchaseHistoryAdapter = new PurchaseHistoryAdapter(this, stores, score, imageUrls);
		recyclerViewDashboard.setAdapter(purchaseHistoryAdapter);
		recyclerViewDashboard.setLayoutManager(new LinearLayoutManager(this));

		gotoPurchaseHistoryBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(view.getContext(), PurchaseDetailsActivity.class);
				startActivity(intent);
			}
		});
	}
}
	
	