package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdmissionActivity extends AppCompatActivity {
    Button under,post,facilities,research;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
        under=findViewById(R.id.under);
        post=findViewById(R.id.post);
        facilities=findViewById(R.id.facilities);
        research=findViewById(R.id.research);
        under.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent ne =new Intent(AdmissionActivity.this,UndergActivity.class);
               startActivity(ne);
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nv =new Intent(AdmissionActivity.this,PostsActivity.class);
                startActivity(nv);
            }
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nr =new Intent(AdmissionActivity.this,FacilitiesActivity.class);
                startActivity(nr);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nr =new Intent(AdmissionActivity.this,ResearchsActivity.class);
                startActivity(nr);
            }
        });
    }
}
