package com.example.pdacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UndActivity extends AppCompatActivity {
    Button civil,mechanical,electrical,electronics,industrial,instrumentation,architecture,ceramic,informations,computers,automobile,physics,chemistry,mathematics,humanity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_und);
        civil=findViewById(R.id.civil);
        mechanical=findViewById(R.id.mechanical);
        electrical=findViewById(R.id.electrical);
        electronics=findViewById(R.id.electronics);
        industrial=findViewById(R.id.industrial);
        instrumentation=findViewById(R.id.instrumentation);
        architecture=findViewById(R.id.architecture);
        ceramic=findViewById(R.id.ceramic);
        informations=findViewById(R.id.information);
        computers=findViewById(R.id.computer);
        automobile=findViewById(R.id.automobile);
        physics=findViewById(R.id.physics);
        chemistry=findViewById(R.id.chemistry);
        mathematics=findViewById(R.id.mathematics);
        humanity=findViewById(R.id.humanity);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UndActivity.this,Civil2Activity.class);
                startActivity(i);
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii =new Intent(UndActivity.this,MechanicalActivity.class);
                startActivity(ii);
            }
        });
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia =new Intent(UndActivity.this,ElectricalActivity.class);
                startActivity(ia);
            }
        });
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id =new Intent(UndActivity.this,ElectronicsActivity.class);
                startActivity(id);

            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ip =new Intent(UndActivity.this, IndustrialActivity.class);
                startActivity(ip);

            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iw =new Intent(UndActivity.this, InstrumentationActivity.class);
                startActivity(iw);

            }
        });
        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ie =new Intent(UndActivity.this, ArchitectureActivity.class);
                startActivity(ie);

            }
        });
        ceramic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ce =new Intent(UndActivity.this, CeramicActivity.class);
                startActivity(ce);

            }
        });
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UndActivity.this, InformationActivity.class);
                startActivity(i);

            }
        });
        computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic =new Intent(UndActivity.this, ComputerActivity.class);
                startActivity(ic);


            }
        });
        automobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au =new Intent(UndActivity.this, AutomobileActivity.class);
                startActivity(au);

            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ph =new Intent(UndActivity.this, PhysicsActivity.class);
                startActivity(ph);

            }
        });
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch =new Intent(UndActivity.this, ChemistryActivity.class);
                startActivity(ch);
            }
        });
        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma =new Intent(UndActivity.this, MathActivity.class);
                startActivity(ma);

            }
        });
        humanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hu =new Intent(UndActivity.this, HumanityActivity.class);
                startActivity(hu);
            }
        });
    }
}
