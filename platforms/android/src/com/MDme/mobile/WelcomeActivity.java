package com.MDme.mobile;

import android.app.Activity;
import android.os.Bundle;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;

/**
 * Created by Matt Hamada on 4/14/14.
 */
public class WelcomeActivity extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.setBooleanProperty("showTitle", true);
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html");
    }
}