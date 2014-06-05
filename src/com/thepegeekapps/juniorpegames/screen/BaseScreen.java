package com.thepegeekapps.juniorpegames.screen;

import com.thepegeekapps.juniorpegames.database.DatabaseManager;

import android.app.Activity;
import android.os.Bundle;

public class BaseScreen extends Activity {
	
	DatabaseManager dbManager;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dbManager = DatabaseManager.getInstance(this);
	}

}
