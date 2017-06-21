package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Portal_Institutes_ZIALE_2016_H9 extends Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.portal_institutes_ziale_2016);
		
			ImageButton home = (ImageButton) findViewById(R.id.home);
			home.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016_H9.this, MainActivity.class)); }});
			
			ImageButton back = (ImageButton) findViewById(R.id.back);
			back.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016_H9.this, Portal_Institutes_ZIALE_2016.class)); }});
			
	}	

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity_main, menu);
	return true;
	}

}