package com.example.phonegapdemo02;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity02 extends DroidGap {

//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		super.loadUrl("file:///android_asset/www/newfile2.html");
//		
//	}
	
	
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
//	        super.loadUrl("file:///android_asset/www/backbuttonmultipage/index.html");
//	        super.loadUrl("file:///android_asset/www/wei/amyindex2.html");
	        super.loadUrl("file:///android_asset/www/aa/newfile2.html");
	    }
	

}
