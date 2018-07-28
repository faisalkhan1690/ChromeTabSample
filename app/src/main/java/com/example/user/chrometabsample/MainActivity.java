package com.example.user.chrometabsample;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity class for show how to open png,xls and pdf in google chrome tab in android
 * @author  Faisal Khan
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Open png in chrome tab
     * @param view view
     */
    public void OpenPng(View view){
        String url="https://livekonnect.s3.amazonaws.com/documents/employee/3723/picture.png";
        startChromeTab(url);

    }

    /**
     * Open pdf in chrome tab
     * @param view view
     */
    public void OpenPdf(View view){
        String url="https://livekonnect.s3.amazonaws.com/documents/employee/3723/ATutorial.pdf";
        startChromeTab(url);

    }

    /**
     * Open xls in chrome tab
     * @param view view
     */
    public void OpenXls(View view){
        String url="https://livekonnect.s3.amazonaws.com/documents/employee/3723/tests-example.xls";
        startChromeTab(url);
    }


    /**
     * To start chrome tab
     * @param url url of file
     */
    private void startChromeTab(String url){

        Uri uri = Uri.parse(url);
        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
        intentBuilder.setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        intentBuilder.setSecondaryToolbarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        CustomTabsIntent customTabsIntent = intentBuilder.build();
        customTabsIntent.launchUrl(this, uri);
    }
}