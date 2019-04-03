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
                Intent itr=new Intent(Intent.ACTION_VIEW);
                itr.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m06&page=notifications"));
                startActivity(itr);
            }
        });
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vt=new Intent(Intent.ACTION_VIEW);
                vt.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m06&page=results"));
                startActivity(vt);
            }
        });
    }
}
