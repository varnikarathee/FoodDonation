package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.smile.data.MyHandler;
import com.example.smile.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class foodstatus extends AppCompatActivity {
    ListView listView;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodstatus);


        MyHandler db = new MyHandler(foodstatus.this);

//        // Creating a contact object for the db
//        Contact harry = new Contact();
//        harry.setPhoneNumber("9090909090");
//        harry.setName("Harry");
//
//        // Adding a contact to the db
//        db.addContact(harry);
//
//        // Creating a contact object for the db
//        Contact larry = new Contact();
//        larry.setPhoneNumber("9090459090");
//        larry.setName("Larry");
//
//        // Adding a contact to the db
//        db.addContact(larry);
//
//        // Creating a contact object for the db
//        Contact tehri = new Contact();
//        tehri.setPhoneNumber("9090675409");
//        tehri.setName("Tehri");
//
//        // Adding a contact to the db
//        db.addContact(tehri);
//        Log.d("dbharry", "Id for tehri and larry are successfully added to the db");
//
//        tehri.setId(46);
//        tehri.setName("Changed Tehri");
//        tehri.setPhoneNumber("0000000000");
//        int affectedRows = db.updateContact(tehri);
//
//        Log.d("dbharry", "No of affected rows are: " + affectedRows);
//        db.deleteContactById(1);
//        db.deleteContactById(12);
//        db.deleteContactById(5);

        ArrayList<String> contacts = new ArrayList<>();
        listView = findViewById(R.id.layout1);


        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){

            Log.d("dbswapnil", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getPhoneNumber() + "\n" + "Food Type: " + contact.getFoodtype() + "\n" + "Use Before: " + contact.getExpiry());

            contacts.add("Food Id: " +contact.getId()+ ", Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber() + ", Food Type: " + contact.getFoodtype() + ", Use Before: " + contact.getExpiry());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        listView.setAdapter(arrayAdapter);

//        Log.d("dbharry", "Bro you have "+ db.getCount()+ " contacts in your database");


    }

}