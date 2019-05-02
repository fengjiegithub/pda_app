package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FacultyActivity extends AppCompatActivity {
    Button civil,mechanical,electrical,electronics,
            industrial,instrumentation,architecture,ceramic,
            information,computer,automobile,physics,chemistry,mathematics,humanity,power,thermal,environmental,structural,production,computers,communication,informations,materials,biomedical;
//    Button post,research;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
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

        power=findViewById(R.id.power);
        thermal=findViewById(R.id.thermal);
        environmental=findViewById(R.id.environmental);
        structural=findViewById(R.id.structural);
        production=findViewById(R.id.production);
        computers=findViewById(R.id.computers);
        communication=findViewById(R.id.communication);
        informations=findViewById(R.id.informations);
        materials=findViewById(R.id.materials);
        biomedical=findViewById(R.id.biomedical);


        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,civil.class);
                startActivity(intent);
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,MechanicalActivity.class);
                startActivity(intent1);
            }
        });
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,ElectricalActivity.class);
                startActivity(intent2);
            }
        });

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,ElectronicActivity.class);
                startActivity(intent);
            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,IndustrialActivity.class);
                startActivity(intent1);
            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,InstrumentationActivity.class);
                startActivity(intent2);
            }
        });

        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,ArchitectureActivity.class);
                startActivity(intent);
            }
        });
        ceramic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,CeramicActivity.class);
                startActivity(intent1);
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,InformationActivity.class);
                startActivity(intent2);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,ComputerActivity.class);
                startActivity(intent);
            }
        });
        automobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,AutomobileActivity.class);
                startActivity(intent1);
            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,PhysicsActivity.class);
                startActivity(intent2);
            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,ChemistryActivity.class);
                startActivity(intent);
            }
        });
        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,MathActivity.class);
                startActivity(intent1);
            }
        });
        humanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,HumanityActivity.class);
                startActivity(intent2);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,PowerActivity.class);
                startActivity(intent1);
            }
        });
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,ThermalActivity.class);
                startActivity(intent2);
            }
        });

        environmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,EnvironmentalActivity.class);
                startActivity(intent);
            }
        });
        structural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,StructuralActivity.class);
                startActivity(intent1);
            }
        });
        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,ProductionActivity.class);
                startActivity(intent2);
            }
        });
        computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,ComputersActivity.class);
                startActivity(intent1);
            }
        });
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,CommunicationActivity.class);
                startActivity(intent2);
            }
        });

        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacultyActivity.this,ComputernActivity.class);
                startActivity(intent);
            }
        });
        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FacultyActivity.this,MaterialsActivity.class);
                startActivity(intent1);
            }
        });
        biomedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FacultyActivity.this,BiomedicalActivity.class);
                startActivity(intent2);
            }
        });




    }
}
