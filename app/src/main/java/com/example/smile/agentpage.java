package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smile.Params.Params;
import com.example.smile.data.MyHandler;
import com.example.smile.model.Contact;



public class agentpage extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agentpage);
        MyHandler db = new MyHandler(agentpage.this);

        View ram = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextTextPersonName13);
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editText.getText().toString();
                db.deleteContactBYid(editText.getText().toString());
                Toast.makeText(agentpage.this,"thanks for delivering food ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(agentpage.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}