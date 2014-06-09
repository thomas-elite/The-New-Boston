package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle TravisLoveBacon) {
		// TODO Auto-generated method stub
		super.onCreate(TravisLoveBacon);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.thenewboston.travis.STARTINGPOINT");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

}