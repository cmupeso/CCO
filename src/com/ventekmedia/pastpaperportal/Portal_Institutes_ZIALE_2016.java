package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.app.DownloadManager.Request;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Button;

@SuppressLint("NewApi")
public class Portal_Institutes_ZIALE_2016 extends Activity {
	private ImageButton download_p1;

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.portal_institutes_ziale_2016);
		
		download_p1 = (ImageButton) findViewById(R.id.download_p1);
		download_p1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				String Path = Environment.getExternalStorageDirectory() + "/PastPaperPortal/";
				String servicestring = Context.DOWNLOAD_SERVICE;
				DownloadManager downloadmanager;
				downloadmanager = (DownloadManager) getSystemService(servicestring);
				Uri uri = Uri.parse("https://www.google.co.zm/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
				DownloadManager.Request request = new Request(uri);
				Long reference = downloadmanager.enqueue(request);
			}
		});
	

		
			ImageButton home = (ImageButton) findViewById(R.id.home);
			home.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016.this, MainActivity.class)); }});
			
			ImageButton back = (ImageButton) findViewById(R.id.back);
			back.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE.class)); }});
			
			ImageButton institutes = (ImageButton) findViewById(R.id.institutes);
			institutes.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016.this, Portal_Institutes.class)); }});
			
			ImageButton read_p10 = (ImageButton) findViewById(R.id.read_p10);
			read_p10.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE_2016_H10.class)); }});
			
			ImageButton download_p10 = (ImageButton) findViewById(R.id.download_p10);
			download_p10.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
			startActivity(new Intent(Portal_Institutes_ZIALE_2016.this, Portal_Institutes_ZIALE_2016_DownP10.class)); }});
		
		}	
	
}