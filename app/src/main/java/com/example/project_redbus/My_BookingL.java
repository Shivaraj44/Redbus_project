package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class My_BookingL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybooking1);
        TextView txt2=findViewById(R.id.text2);
    txt2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(My_BookingL.this,MainActivity.class);
            startActivity(intent);
        }
    });


        Intent intent=new Intent(My_BookingL.this,MainActivity.class);

    }
}