package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bushire extends AppCompatActivity {
WebView bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bushire);
bus =findViewById(R.id.bushireweb);
bus.setWebViewClient(new WebViewClient());
    bus.loadUrl("https://www.redbus.in/bushire/?utm_source=website&utm_medium=referral&utm_campaign=Homepage_bushire_banner");
    }
}