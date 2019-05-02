package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {
    Button aboutcollege,society,vission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutcollege=findViewById(R.id.aboutcollege);
        society=findViewById(R.id.society);
        vission=findViewById(R.id.vission);
        aboutcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic=new Intent(AboutActivity.this,AboutaActivity.class);
                startActivity(ic);
            }
        });
        society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jjh=new Intent(Intent.ACTION_VIEW);
                jjh.setData(Uri.parse("http://hkes.edu.in/"));
                startActivity(jjh);
            }
        });
        vission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(AboutActivity.this,VisionActivity.class);
                startActivity(ia);
            }
        });
    }
}
