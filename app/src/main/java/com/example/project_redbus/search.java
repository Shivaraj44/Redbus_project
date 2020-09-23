package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;





public class search extends AppCompatActivity {
private ImageView backbtn;
private TextView sourceglb,destinationbang,presentday;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;





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

        ArrayList<Example> exampleList = new ArrayList<>();
        exampleList.add(new Example("SRS", "Rs-700", "7AM to 7PM ","3-STAR"));
        exampleList.add(new Example("VRL", "Rs-1200", "11AM to 5PM","4-STAR"));
        exampleList.add(new Example("Pavit", "Rs-950", "1PM to 11:50PM ","3-STAR"));
        exampleList.add(new Example("Sugema", "Rs-800", "3PM to 2AM","5-SRAT"));
        exampleList.add(new Example("Krishna", "Rs-1500", "1PM to 5AM","5-STAR"));
        exampleList.add(new Example("Ram", "Rs-1800", "2PM to 5AM","1-STAR"));
        exampleList.add(new Example("Sangam", "Rs-1000", "3PM to 8AM","4-STAR"));
        mRecyclerView = findViewById(R.id.recycleview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);









   backbtn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent=new Intent(search.this,MainActivity.class);
           startActivity(intent);
       }
   });

    }
}