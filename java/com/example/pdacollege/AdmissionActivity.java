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
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m03&page=under-graduate"));
                startActivity(i);
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u=new Intent(Intent.ACTION_VIEW);
                u.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m03&page=post-graduate"));
                startActivity(u);
            }
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k =new Intent(Intent.ACTION_VIEW);
                k.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m03&page=facilities"));
                startActivity(k);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z=new Intent(Intent.ACTION_VIEW);
                z.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m03&page=research-centers"));
                startActivity(z);
            }
        });
    }
}
