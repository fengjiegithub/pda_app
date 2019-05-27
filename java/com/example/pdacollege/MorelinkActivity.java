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
               Intent ci=new Intent(MorelinkActivity.this,CircularActivity.class);
               startActivity(ci);
            }
        });
        mandatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma=new Intent(MorelinkActivity.this,MandatoryActivity.class);
                startActivity(ma);
            }
        });
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent re=new Intent(MorelinkActivity.this,ResearchActivity.class);
                startActivity(re);
            }
        });
        itbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MorelinkActivity.this,ItbtActivity.class);
                startActivity(it);
            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MorelinkActivity.this,PhotoActivity.class);
                startActivity(it);
            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MorelinkActivity.this,SCActivity.class);
                startActivity(it);
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent li=new Intent(MorelinkActivity.this,LibraryActivity.class);
                startActivity(li);
            }
        });
    }
}
