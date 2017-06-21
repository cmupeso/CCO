package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Developers extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);			
		setContentView(R.layout.developers);
		
		ImageButton home = (ImageButton) findViewById(R.id.home);
		home.setOnClickListener(new OnClickListener() {					
		public void onClick(View arg0) {
		startActivity(new Intent(Developers.this, MainActivity.class)); }});
	
	}

}
