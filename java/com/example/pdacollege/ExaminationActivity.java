package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExaminationActivity extends AppCompatActivity {
    Button notification,results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examination);
        notification=findViewById(R.id.notification);
        results=findViewById(R.id.results);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent no=new Intent(ExaminationActivity.this,NotificationActivity.class);
                 startActivity(no);
            }
        });
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ub=new Intent(ExaminationActivity.this,ResultActivity.class);
                startActivity(ub);
            }
        });
    }
}
