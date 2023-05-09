package com.example.smile.data;

import static android.provider.BaseColumns._ID;

import static com.example.smile.Params.Params.KEY_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;
import android.util.Log;

//import androidx.annotation.nullable;

import androidx.annotation.Nullable;

import com.example.smile.model.Contact;
import com.example.smile.Params.Params;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MyHandler extends SQLiteOpenHelper {

        public  MyHandler(Context context){
            super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Params.TABLE_NAME + "(" + Params.KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT, " + Params.KEY_PHONE + " TEXT," + Params.KEY_FOODTYPE + " TEXT,"+ Params.KEY_EXPIRY + " TEXT"+")";
        Log.d("dbswapnil", "query being run is : "+ create);
        db.execSQL(create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addContact(Contact contact){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
//            values.put(Params.KEY_ID, contact.getId());
            values.put(KEY_NAME, contact.getName());
            values.put(Params.KEY_PHONE, contact.getPhoneNumber());
            values.put(Params.KEY_FOODTYPE, contact.getFoodtype());
            values.put(Params.KEY_EXPIRY, contact.getExpiry());

        db.insert(Params.TABLE_NAME, null, values);
        Log.d("dbswapnil", "sucessfully inserted");
        db.close();
    }
    public List<Contact> getAllContacts(){
            List<Contact> contactList = new ArrayList<>();
            SQLiteDatabase db = this.getReadableDatabase();

            String select = "SELECT * FROM " + Params.TABLE_NAME;
            Cursor cursor = db.rawQuery(select, null);

            if(cursor.moveToFirst()){
                do{
                    Contact contact = new Contact();
                    contact.setId(Integer.parseInt(cursor.getString( 0)));
                    contact.setName(cursor.getString(1));
                    contact.setPhoneNumber(cursor.getString(2));
                    contact.setFoodtype(cursor.getString(3));
                    contact.setExpiry(cursor.getString(4));
                    contactList.add(contact);
                }while (cursor.moveToNext());

            }
            return contactList;



    }
    public int updateContact(Contact contact){
          SQLiteDatabase db = this.getWritableDatabase();

          ContentValues values = new ContentValues();
          values.put(KEY_NAME, contact.getName());
          values.put(Params.KEY_PHONE, contact.getPhoneNumber());
          values.put(Params.KEY_FOODTYPE, contact.getFoodtype());
          values.put(Params.KEY_EXPIRY, contact.getExpiry());

          return db.update(Params.TABLE_NAME, values, Params.KEY_ID + "=?",
                  new String[]{String.valueOf(contact.getId())});
    }
    public void deleteContactBYid(String id){
          SQLiteDatabase db = this.getWritableDatabase();
          db.delete(Params.TABLE_NAME, Params.KEY_ID + "=?", new String[]{String.valueOf(id)});
          db.close();
    }





    public  int getCount(){
            String query = "SELECT * FROM " + Params.TABLE_NAME;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(query, null);
            return cursor.getCount();
    }


    public boolean addUser(int Phonenumber,String name) {
            SQLiteDatabase db = getWritableDatabase();
            ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(Params.KEY_PHONE, Phonenumber);

        long aid = db.insert(Params.TABLE_NAME, null,values);

        if (aid>0)
            return true;
        else
            return false;

    }

}
