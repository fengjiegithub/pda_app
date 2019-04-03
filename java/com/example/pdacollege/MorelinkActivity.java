package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MorelinkActivity extends AppCompatActivity {
    Button circulars,mandatory,research,itbt,industrial,instrumentation,library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morelink);
        circulars=findViewById(R.id.circulars);
        mandatory=findViewById(R.id.mandatory);
        research=findViewById(R.id.research);
        itbt=findViewById(R.id.itbt);
        industrial=findViewById(R.id.industrial);
        instrumentation=findViewById(R.id.instrumentation);
        library=findViewById(R.id.library);
        circulars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jh=new Intent(Intent.ACTION_VIEW);
                jh.setData(Uri.parse("http://pda.hkes.edu.in/circulars-notices"));
                startActivity(jh);
            }
        });
        mandatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kh=new Intent(Intent.ACTION_VIEW);
                kh.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m09&page=mandatory-disclosures"));
                startActivity(kh);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kl=new Intent(Intent.ACTION_VIEW);
                kl.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m09&page=research"));
                startActivity(kl);
            }
        });
        itbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fg=new Intent(Intent.ACTION_VIEW);
                fg.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m09&page=itbt"));
                startActivity(fg);
            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hy=new Intent(Intent.ACTION_VIEW);
                hy.setData(Uri.parse("http://pda.hkes.edu.in/photo-gallery"));
                startActivity(hy);
            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jr=new Intent(Intent.ACTION_VIEW);
                jr.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m09&page=scstcell"));
                startActivity(jr);
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tr=new Intent(Intent.ACTION_VIEW);
                tr.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m09&page=library"));
                startActivity(tr);
            }
        });
    }
}
