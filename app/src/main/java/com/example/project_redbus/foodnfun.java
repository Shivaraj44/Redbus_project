package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class foodnfun extends AppCompatActivity {
WebView foodnfun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodnfun);
        WebView foodnfun=findViewById(R.id.foodfun);
        foodnfun.setWebViewClient(new WebViewClient());
        foodnfun.loadUrl("https://www.coupondunia.in/funnfood");
    }
}