package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Webview extends AppCompatActivity {

    //private WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        //to get the reference create an object of the class WebView
        WebView myWebView = (WebView) findViewById(R.id.webview);
        //setContentView(myWebView);
        myWebView.setWebViewClient(new WebViewClient());

        //loading online website
        //myWebView.loadUrl("https://kvttechlead.home.blog/");
        //myWebView.loadUrl("https://www.google.com/");

        //loading offline website
        myWebView.loadUrl("file:///android_asset/Kvttech.html");
    }

 /*   @Override
    public void onBackPressed() {
        if (WebView.canGoBack()){
            WebView.goBack();
        } else {
            super.onBackPressed();
        }

    }*/
}
