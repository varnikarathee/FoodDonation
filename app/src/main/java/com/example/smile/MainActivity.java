package com.example.smile;

import static com.example.smile.R.id.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smile.data.MyHandler;
import com.example.smile.model.Contact;

import java.net.HttpCookie;

public class MainActivity<uri> extends AppCompatActivity {

    private View button;
    private View buttona;
    private view buttonaa;
    private View buttonaaa;
    private View button6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        buttona = findViewById(button4);
        View ram = findViewById(R.id.ram);
        buttonaaa = findViewById(R.id.button3);
        button6 = findViewById(R.id.button6);
//        MyHandler db = new MyHandler(MainActivity.this);
//        Contact swapnil = new Contact();
//        swapnil.setPhoneNumber("999999999");
//        swapnil.setName("swww");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ADMIN", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(MainActivity.this,adminactivity.class);
                 startActivity(intent);

            }
        });
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "food status is opening...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,foodstatus.class);
                startActivity(intent);
            }
        });
       ram.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Donar page is opening...", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(MainActivity.this,donerpage.class);
               startActivity(intent);
           }
       });
       buttonaaa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "agent page is opening...", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(MainActivity.this,agentpage.class);
               startActivity(intent);
           }
       });
       button6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "about app", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(MainActivity.this, aboutapppage.class);
               startActivity(intent);
           }

       });


       }



}