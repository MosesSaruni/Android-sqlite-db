package com.example.databaseclass;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

//    TextView name1, name2, name3,name4, name5, contact1, contact2, contact3, contact4, contact5, dob1, dob2, dob3,dob4, dob5;
    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tableList();
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

//
//
//
//        res.moveToNext();
//        name2.setText(res.getString(0));
//        contact2.setText(res.getString(1));
//        dob2.setText(res.getString(2));
//
//        res.moveToNext();
//        name3.setText(res.getString(0));
//        contact3.setText(res.getString(1));
//        dob3.setText(res.getString(2));
//
//        res.moveToNext();
//        name4.setText(res.getString(0));
//        contact4.setText(res.getString(1));
//        dob4.setText(res.getString(2));
//
//        res.moveToNext();
//        name5.setText(res.getString(0));
//        contact5.setText(res.getString(1));
//        dob5.setText(res.getString(2));

    }

    public void tableList(){
        DB = new DatabaseHelper(this);
        Cursor res = DB.get_data();

        TableLayout table = (TableLayout) findViewById(R.id.table_main);

        TableRow tbrow0 = new TableRow(this);

        TextView tv0 = new TextView(this);
        tv0.setText(" Name ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);

        TextView tv1 = new TextView(this);
        tv1.setText(" Contact ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);

        TextView tv2 = new TextView(this);
        tv2.setText(" DOB ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);

        table.addView(tbrow0);

        while(res.moveToNext()){
            TableRow tbrow = new TableRow(this);

            TextView t1v = new TextView(this);
            t1v.setText(res.getString(0));
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);

            TextView t2v = new TextView(this);
            t2v.setText(res.getString(1));
            t2v.setTextColor(Color.WHITE);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);

            TextView t3v = new TextView(this);
            t3v.setText(res.getString(2));
            t3v.setTextColor(Color.WHITE);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);

            table.addView(tbrow);
        }
    }
}