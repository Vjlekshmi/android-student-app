package com.example.studentapp19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardAcitivity extends AppCompatActivity {


    AppCompatButton b1,b2,b3,b4,b5;
    String getAddcourse,getAddfaculty,getAddexam,getViewwebsite,getLogout;
    SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_acitivity);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        b1 = (AppCompatButton) findViewById(R.id.adcourse);
        b2 = (AppCompatButton) findViewById(R.id.adfaculty);
        b3 = (AppCompatButton) findViewById(R.id.adexam);
        b4 = (AppCompatButton) findViewById(R.id.viewbtn);
        b5 = (AppCompatButton) findViewById(R.id.logoutbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), AddcourseActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), getAddcourse, Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), AddfacultyActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), getAddfaculty, Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), AddexamActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), getAddexam, Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ViewwebsiteActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), getViewwebsite, Toast.LENGTH_SHORT).show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit= mypreferences.edit();
                myedit.clear();
                myedit.commit();
                Toast.makeText(getApplicationContext(), "SUCCESSFULLY LOGOUT", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

                }



            });

        }


    }



































































