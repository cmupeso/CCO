package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class CopyOfPortal_Institutes_ZIALE_2016 extends Activity {

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.portal_institutes_ziale_2016);
		
			ImageButton home = (ImageButton) findViewById(R.id.home);
			home.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(CopyOfPortal_Institutes_ZIALE_2016.this, MainActivity.class)); }});
			
			ImageButton back = (ImageButton) findViewById(R.id.back);
			back.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(CopyOfPortal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE.class)); }});
			
			ImageButton institutes = (ImageButton) findViewById(R.id.institutes);
			institutes.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(CopyOfPortal_Institutes_ZIALE_2016.this, Portal_Institutes.class)); }});
			
			ImageButton read_p10 = (ImageButton) findViewById(R.id.read_p10);
			read_p10.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(CopyOfPortal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE_2016_H10.class)); }});
		
			ImageButton download_p10 = (ImageButton)findViewById(R.id.download_p10);
	        download_p10.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0) {
					startActivity(new Intent(CopyOfPortal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE_2016_DownP10.class)); }});

	    }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity_main, menu);
	return true;
	}

}