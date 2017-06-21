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

public class MainActivity extends Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.activity_main);
		
			Button pastpaper = (Button) findViewById(R.id.PastPapers);
			pastpaper.setOnClickListener(new OnClickListener() {					
			public void onClick(View arg0) {
			startActivity(new Intent(MainActivity.this, Portal_Institutes.class)); }});
			
			Button blogportal = (Button) findViewById(R.id.BlogPortal);
			blogportal.setOnClickListener(new OnClickListener() {				
			public void onClick(View arg0) {
			startActivity(new Intent(MainActivity.this, Portal_Blog.class)); }});
		
			Button socialportal = (Button) findViewById(R.id.SocialPortal);
			socialportal.setOnClickListener(new OnClickListener() {			
			public void onClick(View arg0) {
			startActivity(new Intent(MainActivity.this, Portal_Social.class)); }});

			Button tutorportal = (Button) findViewById(R.id.TutorPortal);
			tutorportal.setOnClickListener(new OnClickListener() {			
			public void onClick(View arg0) {
			startActivity(new Intent(MainActivity.this, Portal_Tutor.class)); }});
			
			ImageButton developers = (ImageButton) findViewById(R.id.developers);
			developers.setOnClickListener(new OnClickListener() {			
			public void onClick(View arg0) {
			startActivity(new Intent(MainActivity.this, Developers.class)); }});
			
		}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
