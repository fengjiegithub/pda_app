package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BiomActivity extends AppCompatActivity {
    TextView t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biom);
        t7=findViewById(R.id.t7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt=new Intent(BiomActivity.this,BiomedicalActivity.class);
                startActivity(yt);
            }
        });
    }
}
