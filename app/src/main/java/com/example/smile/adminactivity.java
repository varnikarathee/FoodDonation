package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class adminactivity extends AppCompatActivity {

    private View buttton;
    private View buttonlogi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminactivity);
        buttton = findViewById(R.id.button7);
        TextView username = (TextView) findViewById(R.id.editTextTextPersonName3);
        TextView password = (TextView) findViewById(R.id.editTextNumberPassword);
        buttonlogi = findViewById(R.id.button5);
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(adminactivity.this, "go to ABOUT_APP>developer>send_mail", Toast.LENGTH_SHORT).show();
            }
        });
        buttonlogi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(adminactivity.this, "log in", Toast.LENGTH_SHORT).show();
                if(username.getText().toString().equals("swapnil") && password.getText().toString().equals("1234")){
                    Toast.makeText(adminactivity.this, "logining...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(adminactivity.this,foodstatus.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(adminactivity.this, "ERROR:// SOMETHING WRONG", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}