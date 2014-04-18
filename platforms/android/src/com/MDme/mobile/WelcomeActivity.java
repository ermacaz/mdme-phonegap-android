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
        //set user agent to mobile
        super.appView.getSettings().setUserAgentString("mobile");
        // Set by <content src="index.html" /> in config.xml
        //super.loadUrl(Config.getStartUrl());
        super.loadUrl("http://10.0.2.2:3000/signin");
//        super.loadUrl("http://www.mdme.us/signin");

        //super.loadUrl("file:///www/index.html");
        //super.loadUrl("file:///android_asset/www/index.html");
    }
}