package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepartmentActivity extends AppCompatActivity {
    Button post,research;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        post=findViewById(R.id.post);
        research=findViewById(R.id.research);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(DepartmentActivity.this,UnderActivity.class);
                startActivity(in);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent po=new Intent(DepartmentActivity.this,PostActivity.class);
                startActivity(po);
            }
        });
    }
}
