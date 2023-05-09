package com.example.smile;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smile.Params.Params;
import com.example.smile.data.MyHandler;
import com.example.smile.model.Contact;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;


public class donerpage extends AppCompatActivity {

EditText edittext,edittext2, edittext3, edittext4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donerpage);

        MyHandler db = new MyHandler(donerpage.this);
        View ram = findViewById(R.id.shyam);

        edittext = findViewById(R.id.editTextTextPersonName);
        edittext2 = findViewById(R.id.editTextTextPersonName2);
        edittext3 =  findViewById(R.id.editTextTextPersonName6);
        edittext4 = findViewById(R.id.editTextTextPersonName5);





//        Contact swapnil = new Contact();
//        swapnil.setPhoneNumber("999999999");
//        swapnil.setName("swww");
//
//        db.addContact(swapnil);
//
//
//        Contact Tiwari = new Contact();
//        Tiwari.setPhoneNumber("999999999");
//       Tiwari.setName("tiwari");
//
//        db.addContact(Tiwari);
//
//        Tiwari.setName("dfndsjnjks");
//        Tiwari.setId(19);
//        Tiwari.setPhoneNumber("4545456465");
//        int affectedRows = db.updateContact(Tiwari);


//        Log.d("dbswapnil","id added");




        
//        ArrayList<String> contacts = new ArrayList<>();
//        db.deleteContact("Tiwari");

//        List<Contact> allContacts = db.getAllContacts();
//        for (Contact contact : allContacts){
//
//            Log.d("dbswapnil", "ID" + contact.getId() + "\n" +  "Name : " + contact.getName() + "\n"  + "Phone Number: " + contact.getPhoneNumber() + "\n" );
//
//
//
//            contacts.add(contact.getName() + "(" + contact.getPhoneNumber() +")" );
//
//
//        }
        Log.d("dbswapnil", "BRO YOU HAVE "+ db.getCount()+ " contacts in your database");



        ram.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Contact newEntry = new Contact();
//
//                String name1 =et11.getText().toString();
//                String username1 =et2.getText().toString();
//                String  password1 =et3.getText().toString();


                newEntry.setName(edittext.getText().toString());
//                newEntry.setName(edittext.getTooltipText());
                newEntry.setPhoneNumber(edittext2.getText().toString());
                newEntry.setFoodtype(edittext3.getText().toString());
                newEntry.setExpiry(edittext4.getText().toString());
                AddData(newEntry);
//                db.addContact(newEntry);


                Toast.makeText(donerpage.this, "thanks for donating food ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(donerpage.this, MainActivity.class);
                startActivity(intent);

            }


        });
       
        
    }
    public  void  AddData(Contact newEntry){
        MyHandler db = new MyHandler(donerpage.this);
        db.addContact(newEntry);

    }
   
}
