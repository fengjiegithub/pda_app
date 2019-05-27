package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FacilitiesActivity extends AppCompatActivity {
    TextView text6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        text6=findViewById(R.id.text6);
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iy=new Intent(FacilitiesActivity.this,PlacementActivity.class);
                startActivity(iy);
            }
        });
    }

}
