package com.example.studentapp19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddfacultyActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getFacultyname,getDepartment,getDesignation,getMobileno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfaculty);
        ed1=(EditText)findViewById(R.id.facname);
        ed2=(EditText)findViewById(R.id.dept);
        ed3=(EditText)findViewById(R.id.desgtn);
        ed4=(EditText)findViewById(R.id.mob);
        b1=(AppCompatButton)findViewById(R.id.fucsub);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyname=ed1.getText().toString();
                getDepartment=ed2.getText().toString();
                getDesignation=ed3.getText().toString();
                getMobileno=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getFacultyname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDepartment, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDesignation, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMobileno, Toast.LENGTH_SHORT).show();
            }
        });


        b2=(AppCompatButton)findViewById(R.id.bkdashboard);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardAcitivity.class);
                startActivity(i);
            }
        });







    }
        }