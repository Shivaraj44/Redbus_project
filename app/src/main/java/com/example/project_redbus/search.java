package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class search extends AppCompatActivity {
private ImageView backbtn;
private TextView sourceglb,destinationbang,presentday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    backbtn=findViewById(R.id.backhome);
   sourceglb=findViewById(R.id.gulbarga);
   destinationbang=findViewById(R.id.banhalore);
   presentday=findViewById(R.id.seatchdate);
Intent intent=getIntent();
String s=intent.getStringExtra("source");
String  d=intent.getStringExtra("destination");
String pd=intent.getStringExtra("persentdate");
sourceglb.setText(s);
destinationbang.setText(d);
presentday.setText(pd);
   backbtn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent=new Intent(search.this,MainActivity.class);
           startActivity(intent);
       }
   });

    }
}