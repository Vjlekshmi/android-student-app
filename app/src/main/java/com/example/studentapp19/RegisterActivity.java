package com.example.studentapp19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getName,getRollno,getAdmisssionno,getUsername,getPassword,getConfirmpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.rno);
        ed3=(EditText)findViewById(R.id.adno);
        ed4=(EditText)findViewById(R.id.usname);
        ed5=(EditText)findViewById(R.id.pwd);
        ed6=(EditText)findViewById(R.id.conpwd);
        b1=(AppCompatButton)findViewById(R.id.rgbtn);
        b2=(AppCompatButton)findViewById(R.id.logbtn);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getRollno=ed2.getText().toString();
                getAdmisssionno=ed3.getText().toString();
                getUsername=ed4.getText().toString();
                getPassword=ed5.getText().toString();
                getConfirmpassword=ed6.getText().toString();

                if(getPassword.equals(getConfirmpassword)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getRollno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getAdmisssionno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getUsername, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getConfirmpassword, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "password and confirm password doesnt'match ", Toast.LENGTH_SHORT).show();


                }


                b2=(AppCompatButton) findViewById(R.id.logbtn);
            }
        });

    }
}