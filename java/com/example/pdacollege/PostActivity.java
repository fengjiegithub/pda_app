package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostActivity extends AppCompatActivity {
    Button power,thermal,environmental,structural,production,computers,biomedical,communication,informations,materials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        power=findViewById(R.id.power);
        thermal=findViewById(R.id.thermal);
        environmental=findViewById(R.id.environmental);
        structural=findViewById(R.id.structural);
        production=findViewById(R.id.production);
        computers=findViewById(R.id.computers);
        biomedical=findViewById(R.id.biomedical);
        communication=findViewById(R.id.communication);
        informations=findViewById(R.id.informations);
        materials=findViewById(R.id.materials);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent po=new Intent(PostActivity.this,PowersActivity.class);
                startActivity(po);
            }
        });
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent th=new Intent(PostActivity.this,ThermalsActivity.class);
                startActivity(th);
            }
        });
        environmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent en=new Intent(PostActivity.this,EnvironmentActivity.class);
                startActivity(en);
            }
        });
        structural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent st=new Intent(PostActivity.this,StructuralsActivity.class);
                startActivity(st);

            }
        });
        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr=new Intent(PostActivity.this,ProductionsActivity.class);
                startActivity(pr);

            }
        });
        computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co=new Intent(PostActivity.this,CSActivity.class);
                startActivity(co);

            }
        });
        biomedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bm=new Intent(PostActivity.this,BiomActivity.class);
                startActivity(bm);

            }
        });
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cs=new Intent(PostActivity.this,CSActivity.class);
                startActivity(cs);
            }
        });
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cN=new Intent(PostActivity.this,CNActivity.class);
                startActivity(cN);
            }
        });
        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ms=new Intent(PostActivity.this,MS2Activity.class);
                startActivity(ms);
            }
        });



    }
}
