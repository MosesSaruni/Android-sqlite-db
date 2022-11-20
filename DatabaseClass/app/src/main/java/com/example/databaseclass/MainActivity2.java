package com.example.databaseclass;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name1, name2, name3,name4, name5, contact1, contact2, contact3, contact4, contact5, dob1, dob2, dob3,dob4, dob5;
    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        name1 = findViewById(R.id.name1);
//        name2 = findViewById(R.id.name2);
//        name3 = findViewById(R.id.name3);
//        name4 = findViewById(R.id.name4);
//        name5 = findViewById(R.id.name5);
////        name
//
//        contact1 = findViewById(R.id.contact1);
//        contact2 = findViewById(R.id.contact2);
//        contact3 = findViewById(R.id.contact3);
//        contact4 = findViewById(R.id.contact4);
//        contact4 = findViewById(R.id.contact5);
//
//        dob1 = findViewById(R.id.dob1);
//        dob2 = findViewById(R.id.dob2);
//        dob3 = findViewById(R.id.dob3);
//        dob4 = findViewById(R.id.dob4);
//        dob5 = findViewById(R.id.dob5);
//
//        DB = new DatabaseHelper(this);
//        Cursor res = DB.get_data();
//
//
//        res.moveToFirst();
//        name1.setText(res.getString(0));
//        contact1.setText(res.getString(1));
//        dob1.setText(res.getString(2));

//        while(res.moveToNext()){
//
//        }

//        Dynamically add data to table




        res.moveToNext();
        name2.setText(res.getString(0));
        contact2.setText(res.getString(1));
        dob2.setText(res.getString(2));

        res.moveToNext();
        name3.setText(res.getString(0));
        contact3.setText(res.getString(1));
        dob3.setText(res.getString(2));

        res.moveToNext();
        name4.setText(res.getString(0));
        contact4.setText(res.getString(1));
        dob4.setText(res.getString(2));

        res.moveToNext();
        name5.setText(res.getString(0));
        contact5.setText(res.getString(1));
        dob5.setText(res.getString(2));

    }
}