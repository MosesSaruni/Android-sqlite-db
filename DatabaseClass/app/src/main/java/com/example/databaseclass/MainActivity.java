package com.example.databaseclass;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button update, insert, delete, view , test;
    EditText name, tel_no, dob;

    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.text_1);
        tel_no = findViewById(R.id.text_2);
        dob = findViewById(R.id.text_3);

//        TEST button
//        test = findViewById(R.id.testButton);

        insert = findViewById(R.id.button);
        update = findViewById(R.id.button2);
        delete = findViewById(R.id.button3);
        view = findViewById(R.id.button4);

        DB = new DatabaseHelper(this);

//        Test on click listener
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
////                myIntent.putExtra("key", value); //Optional parameters
//                MainActivity.this.startActivity(myIntent);
//            }
//        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_txt = name.getText().toString();
                String tel_txt = tel_no.getText().toString();
                String dob_txt = dob.getText().toString();

                Boolean check_insert_data = DB.insert_user_data(name_txt, tel_txt, dob_txt);
                if(check_insert_data == true){
                    Toast.makeText(MainActivity.this, "New entry inserted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "New entry not inserted!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_txt = name.getText().toString();
                String tel_txt = tel_no.getText().toString();
                String dob_txt = dob.getText().toString();

                Boolean check_update_data =  DB.update_user_data(name_txt, tel_txt, dob_txt);
                if(check_update_data == true){
                    Toast.makeText(MainActivity.this, "Entry updated", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Entry not updated!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_txt = name.getText().toString();

                Boolean check_delete_data =  DB.delete_user_data(name_txt);

                if(check_delete_data == true){
                    Toast.makeText(MainActivity.this, "Entry deleted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Entry not deleted!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                MainActivity.this.startActivity(myIntent);


//                Cursor res = DB.get_data();
//
//                if(res.getCount() == 0 ){
//                    Toast.makeText(MainActivity.this, "Entry does not exist", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                StringBuffer buffer = new StringBuffer();
//                while(res.moveToNext()){
//                    buffer.append("Name : "+res.getString(0)+"\n");
//                    buffer.append("Contact : "+res.getString(1)+"\n");
//                    buffer.append("Date of Birth : "+res.getString(2)+"\n\n");
//                }
//
//                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
//                builder.setCancelable(true);
//                builder.setTitle("User Entries");
//                builder.setMessage(buffer.toString());
//                builder.show();
            }
        });
    }
}