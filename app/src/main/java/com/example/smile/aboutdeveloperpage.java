package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class aboutdeveloperpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutdeveloperpage);
        View ram = findViewById(R.id.imageView14);
        View ram2 = findViewById(R.id.imageView16);
        View ram3 = findViewById(R.id.imageView15);
        View ram4 = findViewById(R.id.imageView114);
        View ram5 = findViewById(R.id.imageView116);
        View ram6 = findViewById(R.id.imageView115);
//
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://api.whatsapp.com/send/?phone=%2B919140942798&text&app_absent=0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        ram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://www.instagram.com/swapn_ilverma/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        ram3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://www.linkedin.com/in/swapnil-verma-041364220/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        ram4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://api.whatsapp.com/send/?phone=%2B919305974452&text&app_absent=0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        ram5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://www.instagram.com/tiwariswapnil100/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        ram6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutdeveloperpage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://www.linkedin.com/in/swapnil-tiwari-43aa8521b/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
    }
}