package com.example.project_redbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private ImageView helpImg,rpool,foodandfun,bushire,foodf;
private ImageView bookingImg,reverseimg;
private TextView todayText,printtomorow,offersr;
EditText source,destination,maindate;
Button searchbutton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1=findViewById(R.id.textMyBooking);
ImageView bookingImg =findViewById(R.id.my_booking);
      ImageView  helpImg =findViewById(R.id.help);
      final TextView todayText =findViewById(R.id.today);
 final EditText maindate=findViewById(R.id.date);
        TextView printtomorow =findViewById(R.id.tomorow);
ImageView rpool =findViewById(R.id.rpool1);
bushire=findViewById(R.id.busweb);
foodf= findViewById(R.id.foodnfun);
searchbutton=findViewById(R.id.search);
source=findViewById(R.id.enter_source);
destination=findViewById(R.id.destination);
reverseimg=findViewById(R.id.reverse);






TextView offers=findViewById(R.id.offers);
offers.setMovementMethod(LinkMovementMethod.getInstance());



        helpImg.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Helpredbus.class);
                startActivity(intent);

            }
        });
        bookingImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte =new Intent(MainActivity.this,My_BookingL.class);
                startActivity(inte);
            }
        });

        todayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date ="23-sept-2020";
              maindate.setText(date);

            }
        });
printtomorow.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String tomodate="24-sept-2020";
        maindate.setText(tomodate);
    }
});
offers.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

rpool.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,rpool.class);
        startActivity(intent);
    }
});



bushire.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this, com.example.project_redbus.bushire.class);
        startActivity(intent);
    }
});

foodf.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,foodnfun.class);
        startActivity(intent);
    }
});

searchbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,search.class);
String d=maindate.getText().toString();
        String source1=source.getText().toString();
        String destination1=destination.getText().toString();
intent.putExtra("source",source1);
intent.putExtra("destination",destination1);
intent.putExtra("persentdate",d);
        startActivity(intent);
    }
});

reverseimg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String a=source.getText().toString();
        String b=destination.getText().toString();
        source.setText(b);
        destination.setText(a);
    }
});





    }
}