package exportkit.xd;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;

import api.ApiCalls;
import jsonParsing.User;
import util.BarcodeEncoderUtil;

public class Finance_tracker__community__activity extends Activity {

	
	private View _bg__homescreen;
	private View rectangle_7;
	private ImageView rectangle_8;
	private TextView title;
	private TextView date;
	private TextView date_ek1;
	private TextView name;
	private TextView name_ek1;
	private TextView amount;
	private ImageView background;
	private ImageView image_4;
	private ImageView image_5;
	private TextView name_ek2;
	private TextView name_ek3;
	private TextView amount_ek1;
	private ImageView background_ek1;
	private View ellipse_7;
	private ImageView image_5_ek1;
	private TextView name_ek4;
	private TextView name_ek5;
	private TextView amount_ek2;
	private View background_ek2;
	private ImageView curve;
	private TextView name_ek6;
	private TextView name_ek7;
	private TextView amount_ek3;
	private ImageView background_ek3;
	private ImageView union;
	private TextView name_ek8;
	private TextView name_ek9;
	private TextView amount_ek4;
	private ImageView background_ek4;
	private ImageView background_ek5;
	private TextView name_ek10;
	private TextView name_ek11;
	private TextView amount_ek5;
	private View background_ek6;
	private ImageView vector_132;
	private View rectangle_323;
	private View rectangle_324;
	private View rectangle_325;
	private View rectangle_327;
	private View rectangle_329;
	private View rectangle_326;
	private View rectangle_331;
	private View rectangle_328;
	private View rectangle_332;
	private View rectangle_330;
	private View rectangle_333;
	private ImageView header_ek1;
	private ImageView union_ek1;
	private TextView title_ek1;
	private View rectangle_353;
	private TextView title_ek2;
	private TextView amount_ek6;
	private ImageView union_ek2;
	private ImageView image_7;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.finance_tracker__community_);

		
		_bg__homescreen = (View) findViewById(R.id._bg__homescreen);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_8 = (ImageView) findViewById(R.id.rectangle_8);
		title = (TextView) findViewById(R.id.title);
		date = (TextView) findViewById(R.id.date);
		date_ek1 = (TextView) findViewById(R.id.date_ek1);
		name = (TextView) findViewById(R.id.name);
		name_ek1 = (TextView) findViewById(R.id.name_ek1);
		amount = (TextView) findViewById(R.id.amount);
		background = (ImageView) findViewById(R.id.background);
		image_4 = (ImageView) findViewById(R.id.image_4);
		image_5 = (ImageView) findViewById(R.id.image_5);
		name_ek2 = (TextView) findViewById(R.id.name_ek2);
		name_ek3 = (TextView) findViewById(R.id.name_ek3);
		amount_ek1 = (TextView) findViewById(R.id.amount_ek1);
		background_ek1 = (ImageView) findViewById(R.id.background_ek1);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		image_5_ek1 = (ImageView) findViewById(R.id.image_5_ek1);
		name_ek4 = (TextView) findViewById(R.id.name_ek4);
		name_ek5 = (TextView) findViewById(R.id.name_ek5);
		amount_ek2 = (TextView) findViewById(R.id.amount_ek2);
		background_ek2 = (View) findViewById(R.id.background_ek2);
		curve = (ImageView) findViewById(R.id.curve);
		name_ek6 = (TextView) findViewById(R.id.name_ek6);
		name_ek7 = (TextView) findViewById(R.id.name_ek7);
		amount_ek3 = (TextView) findViewById(R.id.amount_ek3);
		background_ek3 = (ImageView) findViewById(R.id.background_ek3);
		union = (ImageView) findViewById(R.id.union);
		name_ek8 = (TextView) findViewById(R.id.name_ek8);
		name_ek9 = (TextView) findViewById(R.id.name_ek9);
		amount_ek4 = (TextView) findViewById(R.id.amount_ek4);
		background_ek4 = (ImageView) findViewById(R.id.background_ek4);
		background_ek5 = (ImageView) findViewById(R.id.background_ek5);
		name_ek10 = (TextView) findViewById(R.id.name_ek10);
		name_ek11 = (TextView) findViewById(R.id.name_ek11);
		amount_ek5 = (TextView) findViewById(R.id.amount_ek5);
		background_ek6 = (View) findViewById(R.id.background_ek6);
		vector_132 = (ImageView) findViewById(R.id.vector_132);
		rectangle_323 = (View) findViewById(R.id.rectangle_323);
		rectangle_324 = (View) findViewById(R.id.rectangle_324);
		rectangle_325 = (View) findViewById(R.id.rectangle_325);
		rectangle_327 = (View) findViewById(R.id.rectangle_327);
		rectangle_329 = (View) findViewById(R.id.rectangle_329);
		rectangle_326 = (View) findViewById(R.id.rectangle_326);
		rectangle_331 = (View) findViewById(R.id.rectangle_331);
		rectangle_328 = (View) findViewById(R.id.rectangle_328);
		rectangle_332 = (View) findViewById(R.id.rectangle_332);
		rectangle_330 = (View) findViewById(R.id.rectangle_330);
		rectangle_333 = (View) findViewById(R.id.rectangle_333);
		header_ek1 = (ImageView) findViewById(R.id.header_ek1);
		union_ek1 = (ImageView) findViewById(R.id.union_ek1);
		title_ek1 = (TextView) findViewById(R.id.title_ek1);
		title_ek2 = (TextView) findViewById(R.id.title_ek2);
		amount_ek6 = (TextView) findViewById(R.id.amount_ek6);
		union_ek2 = (ImageView) findViewById(R.id.union_ek2);
		image_7 = (ImageView) findViewById(R.id.image_7);

		Bitmap barcodeEncoded = BarcodeEncoderUtil.createBarcode("test");

		image_7.setImageBitmap(barcodeEncoded);
		User user = ApiCalls.getUser("1");
		title_ek1.setText("Welcome to your wallet, "+user.getName()+"!");
		amount_ek6.setText(user.getBalance());

	}
}
	
	