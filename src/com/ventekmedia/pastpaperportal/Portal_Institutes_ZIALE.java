package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Portal_Institutes_ZIALE extends Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.portal_institutes_ziale);
		
			ImageButton home = (ImageButton) findViewById(R.id.home);
			home.setOnClickListener(new OnClickListener() {					
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE.this, MainActivity.class)); }});
		
			ImageButton institutes = (ImageButton) findViewById(R.id.institutes);
			institutes.setOnClickListener(new OnClickListener() {					
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE.this, Portal_Institutes.class)); }});

			Button yr2016 = (Button) findViewById(R.id.yr2016);
			yr2016.setOnClickListener(new OnClickListener() {					
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE.this, Portal_Institutes_ZIALE_2016.class)); }});
		
	}	

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity_main, menu);
	return true;
}

}