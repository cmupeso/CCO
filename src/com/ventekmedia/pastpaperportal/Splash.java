package com.ventekmedia.pastpaperportal;

import com.ventekmedia.pastpaperportal.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;

//Activity for Splash screen
public class Splash extends Activity 
{

  private boolean mIsBackButtonPressed;
  private static final int SPLASH_DURATION = 3000; //3 seconds
  private Handler myhandler;

  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      requestWindowFeature(Window.FEATURE_NO_TITLE);		
      setContentView(R.layout.splashscreen);

      myhandler = new Handler();

      // run a thread to start the home screen
      myhandler.postDelayed(new Runnable()
      {
          @Override
          public void run() 
          {

             finish();
               
             if (!mIsBackButtonPressed)
             {
                  // start the home activity 
                  Intent intent = new Intent(Splash.this, Splash2.class);
                  Splash.this.startActivity(intent);
             }
                
          }

      }, SPLASH_DURATION); 
  }
     
  //handle back button press
  @Override
  public void onBackPressed() 
  {
      mIsBackButtonPressed = true;
      super.onBackPressed();
  }
      
}