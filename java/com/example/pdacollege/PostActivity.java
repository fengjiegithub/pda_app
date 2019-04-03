package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostActivity extends AppCompatActivity {
    Button power,thermal,environmental,structural,production,computer,biomedical,communication,information,materials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        power=findViewById(R.id.power);
        thermal=findViewById(R.id.thermal);
        environmental=findViewById(R.id.environmental);
        structural=findViewById(R.id.structural);
        production=findViewById(R.id.production);
        computer=findViewById(R.id.computer);
        biomedical=findViewById(R.id.biomedical);
        communication=findViewById(R.id.communication);
        information=findViewById(R.id.information);
        materials=findViewById(R.id.materials);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(Intent.ACTION_VIEW);
                p.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-power-electronics"));
                startActivity(p);
            }
        });
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(Intent.ACTION_VIEW);
                t.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-thermal-power"));
                startActivity(t);
            }
        });
        environmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent en=new Intent(Intent.ACTION_VIEW);
                en.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-environmental"));
                startActivity(en);
            }
        });
        structural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(Intent.ACTION_VIEW);
                s.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-structural"));
                startActivity(s);

            }
        });
        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr=new Intent(Intent.ACTION_VIEW);
                pr.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-production"));
                startActivity(pr);
            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inf=new Intent(Intent.ACTION_VIEW);
                inf.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-computer-science"));
                startActivity(inf);
            }
        });
        biomedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Intent.ACTION_VIEW);
                b.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-biomedical-electronics#"));
                startActivity(b);
            }
        });
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bcn=new Intent(Intent.ACTION_VIEW);
                bcn.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-communication-system"));
                startActivity(bcn);
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mn=new Intent(Intent.ACTION_VIEW);
                mn.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-computer-networks"));
                startActivity(mn);
            }
        });
        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Intent.ACTION_VIEW);
                m.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=pg-materials-science"));
                startActivity(m);
            }
        });



    }
}
