package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PosActivity extends AppCompatActivity {
    Button power,thermal,environmental,structural,production,computers,biomedical,communication,informations,materials;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos);
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
                Intent po=new Intent(PosActivity.this,PowerActivity.class);
                startActivity(po);
            }
        });
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent th=new Intent(PosActivity.this,ThermalActivity.class);
                startActivity(th);
            }
        });
        environmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent en=new Intent(PosActivity.this,EnvironmentalActivity.class);
                startActivity(en);
            }
        });
        structural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent st=new Intent(PosActivity.this,StructuralActivity.class);
                startActivity(st);

            }
        });
        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr=new Intent(PosActivity.this,ProductionActivity.class);
                startActivity(pr);

            }
        });
        computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co=new Intent(PosActivity.this,ComputersActivity.class);
                startActivity(co);

            }
        });
        biomedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bm=new Intent(PosActivity.this,BiomedicalActivity.class);
                startActivity(bm);

            }
        });
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cs=new Intent(PosActivity.this,CommunicationActivity.class);
                startActivity(cs);
            }
        });
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cN=new Intent(PosActivity.this,InformationActivity.class);
                startActivity(cN);
            }
        });
        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ms=new Intent(PosActivity.this,MaterialsActivity.class);
                startActivity(ms);
            }
        });

    }
}
