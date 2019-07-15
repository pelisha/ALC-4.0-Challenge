package com.example.praiseelisha.alc40challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView webView= (WebView) findViewById(R.id.WebView_B);
        webView.loadUrl("https://andela.com/alc/");
         webView.getSettings().setJavaScriptEnabled(true);
         webView.setWebViewClient(new WebViewClient());
         webView.getSettings().setLoadsImagesAutomatically(true);
          webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            }

    }


