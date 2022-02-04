package com.example.studentapp19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddexamActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    String getSemester,getExamname,getExamdate,getRemark;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexam);

        ed1=(EditText)findViewById(R.id.sem);
        ed2=(EditText)findViewById(R.id.ename);
        ed3=(EditText)findViewById(R.id.edate);
        ed4=(EditText)findViewById(R.id.remark);
        b1=(AppCompatButton)findViewById(R.id.exmsub);
        b2=(AppCompatButton)findViewById(R.id.bkdashboard);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSemester=ed1.getText().toString();
                getExamname=ed2.getText().toString();
                getExamdate=ed3.getText().toString();
                getRemark=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getSemester, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getExamname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getExamdate, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRemark, Toast.LENGTH_SHORT).show();




            }
        });

       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),DashboardAcitivity.class);
               startActivity(i);
           }
       });




    }
}