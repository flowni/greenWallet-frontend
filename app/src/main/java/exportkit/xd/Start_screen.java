package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Start_screen extends Activity {

	
	private View _bg__start_screen;
	private ImageView rectangle_8;
	private ImageView greenwallet_1;
	private TextView company_name;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_screen);
		startActivity(new Intent(Start_screen.this, Finance_tracker__community__activity.class));
		finish();

		
		_bg__start_screen = (View) findViewById(R.id._bg__start_screen);
		rectangle_8 = (ImageView) findViewById(R.id.rectangle_8);
		greenwallet_1 = (ImageView) findViewById(R.id.greenwallet_1);
		company_name = (TextView) findViewById(R.id.title);
	
		
		//custom code goes here
	
	}
}
	
	