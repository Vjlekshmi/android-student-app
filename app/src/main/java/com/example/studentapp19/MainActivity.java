package com.example.studentapp19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText ed1,ed2;
  AppCompatButton b1,b2;
  String getusername,getpassword,prevalue;
  SharedPreferences mypreferenes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreferenes=getSharedPreferences("login",MODE_PRIVATE);
        prevalue=mypreferenes.getString("username","admin");
        if (prevalue.isEmpty()){

            Intent i=new Intent(getApplicationContext(),DashboardAcitivity.class);
            startActivity(i);
        }
        ed1=(EditText)findViewById(R.id.UNAME);
        ed2=(EditText) findViewById(R.id.PWD);
        b1=(AppCompatButton)findViewById(R.id.LOGINBTN);
        b2=(AppCompatButton) findViewById(R.id.REGISTERBTN);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getusername=ed1.getText().toString();
                getpassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getusername, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getpassword, Toast.LENGTH_SHORT).show();
                if(getusername.equals("admin")&&(getpassword.equals("1234"))) {
                    SharedPreferences.Editor myedit= mypreferenes.edit();
                    myedit.putString("username","admin");
                    myedit.commit();
                    Intent i = new Intent(getApplicationContext(), DashboardAcitivity.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"invalid credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });






    }
}