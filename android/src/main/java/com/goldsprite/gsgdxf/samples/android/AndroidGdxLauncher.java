package com.goldsprite.gsgdxf.samples.android;

import com.badlogic.gdx.backends.android.*;

import android.content.Intent;
import android.os.Bundle;
import com.goldsprite.gsgdxf.samples.MainGame;

public class AndroidGdxLauncher extends AndroidApplication {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initLaunchOptions();
		UncaughtExceptionActivity.setUncaughtExceptionHandler(this, AndroidGdxLauncher.class);

		AndroidApplicationConfiguration configuration = new AndroidApplicationConfiguration();
		configuration.useImmersiveMode = true;
		initialize(new MainGame(), configuration);
	}

	private void initLaunchOptions() {
		createShortCuts();
		Intent launchIntent = getIntent();
		boolean isHideBlackBar = launchIntent.getBooleanExtra("isHideBlackBar", false);
		if(isHideBlackBar) ScreenUtils.hideBlackBar(this);
	}

	private void createShortCuts() {
		AppShortCutUtils.createShortcut(this);
	}
}
