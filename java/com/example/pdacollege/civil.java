package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class civil extends AppCompatActivity {
TextView tex47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil2);
        tex47=findViewById(R.id.tex46);
        tex47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tex=new Intent(civil.this,CivilActivity.class);
                startActivity(tex);
            }
        });
    }
}
