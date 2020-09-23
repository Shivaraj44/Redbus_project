package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rpool extends AppCompatActivity {
WebView rpool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpool);
rpool=findViewById(R.id.rpoolweb);
        rpool.setWebViewClient(new WebViewClient());
rpool.loadUrl("https://www.redbus.in/rpool");



    }
}