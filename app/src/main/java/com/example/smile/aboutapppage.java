package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class aboutapppage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapppage);
        View button10 = findViewById(R.id.button10);
//        View imageview = findViewById(R.id.imageView10);
//        View image = findViewById(R.id.imageView11);
        View button9 = findViewById(R.id.button9);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutapppage.this, "wait...", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://forms.gle/2EzQ7uazhnPTRVwK7");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }


        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutapppage.this, "about developer", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(aboutapppage.this, aboutdeveloperpage.class);
                startActivity(intent);
            }
        });

//        imageview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("mailto:cs20017@glbitm.ac.in");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("https://www.google.com");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
    }

    public void aboutRestHeal(View view) {
        Intent intent = new Intent(this,Aboutpage.class);
        startActivity(intent);
    }

    public void openSuggestionsForm(View view) {
        String formUrl = "https://docs.google.com/forms/your_form_url"; // Replace with your actual Google Form URL
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(formUrl));
        startActivity(browserIntent);
    }
}