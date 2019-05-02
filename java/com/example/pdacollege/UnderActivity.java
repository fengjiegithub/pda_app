package com.example.pdacollege;

import android.app.Instrumentation;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnderActivity extends AppCompatActivity {
    Button civil,mechanical,electrical,electronics,industrial,instrumentation,architecture,ceramic,information,computer,automobile,physics,chemistry,mathematics,humanity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under);
        civil=findViewById(R.id.civil);
        mechanical=findViewById(R.id.mechanical);
        electrical=findViewById(R.id.electrical);
        electronics=findViewById(R.id.electronics);
        industrial=findViewById(R.id.industrial);
        instrumentation=findViewById(R.id.instrumentation);
        architecture=findViewById(R.id.architecture);
        ceramic=findViewById(R.id.ceramic);
        information=findViewById(R.id.information);
        computer=findViewById(R.id.computer);
        automobile=findViewById(R.id.automobile);
        physics=findViewById(R.id.physics);
        chemistry=findViewById(R.id.chemistry);
        mathematics=findViewById(R.id.mathematics);
        humanity=findViewById(R.id.humanity);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UnderActivity.this,civil.class);
                startActivity(i);
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii =new Intent(UnderActivity.this,MechanicaActivity.class);
                startActivity(ii);
            }
        });
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia =new Intent(UnderActivity.this,ElectricallActivity.class);
                startActivity(ia);
            }
        });
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id =new Intent(UnderActivity.this,ElectronicActivity.class);
                startActivity(id);

            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ip =new Intent(UnderActivity.this, ElectronicActivity.class);
                startActivity(ip);

            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iw =new Intent(UnderActivity.this, InstrumentActivity.class);
                startActivity(iw);

            }
        });
        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ie =new Intent(UnderActivity.this, ArchitectActivity.class);
                startActivity(ie);

            }
        });
        ceramic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UnderActivity.this, CeramicsActivity.class);
                startActivity(i);

            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ey=new Intent(Intent.ACTION_VIEW);
                ey.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-information-science"));
                startActivity(ey);

            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co=new Intent(Intent.ACTION_VIEW);
                co.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-computer-science"));
                startActivity(co);

            }
        });
        automobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au=new Intent(Intent.ACTION_VIEW);
                au.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-automobile"));
                startActivity(au);

            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(Intent.ACTION_VIEW);
                p.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-physics"));
                startActivity(p);

            }
        });
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch=new Intent(Intent.ACTION_VIEW);
                ch.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-chemistry"));
                startActivity(ch);

            }
        });
        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Intent.ACTION_VIEW);
                m.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-mathematics"));
                startActivity(m);

            }
        });
        humanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Intent.ACTION_VIEW);
                h.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m04&page=ug-humanity"));
                startActivity(h);
            }
        });

    }
}
