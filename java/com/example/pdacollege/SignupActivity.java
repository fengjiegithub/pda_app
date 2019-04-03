package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    EditText first,last,mobile,roll,gender,email;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        first=findViewById(R.id.first);
        last=findViewById(R.id.last);
        mobile=findViewById(R.id.mobile);
        roll=findViewById(R.id.roll);
        gender=findViewById(R.id.gender);
        email=findViewById(R.id.email);
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
