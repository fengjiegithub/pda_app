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
                Intent ci=new Intent(FacultyActivity.this,MathActivity.class);
                startActivity(ci);
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent me=new Intent(FacultyActivity.this,MechanicalActivity.class);
                startActivity(me);
            }
        });
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent el=new Intent(FacultyActivity.this,ElectricalActivity.class);
                startActivity(el);
            }
        });

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ele=new Intent(FacultyActivity.this,ElectronicActivity.class);
                startActivity(ele);
            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ind=new Intent(FacultyActivity.this,IndustrialActivity.class);
                startActivity(ind);
            }
        });
        instrumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ins=new Intent(FacultyActivity.this,InstrumentationActivity.class);
                startActivity(ins);
            }
        });

        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arc=new Intent(FacultyActivity.this,ArchitectureActivity.class);
                startActivity(arc);
            }
        });
        ceramic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ce=new Intent(FacultyActivity.this,CeramicActivity.class);
                startActivity(ce);
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inf=new Intent(FacultyActivity.this,InformationActivity.class);
                startActivity(inf);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co =new Intent(FacultyActivity.this,ComputerActivity.class);
                startActivity(co);
            }
        });
        automobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au=new Intent(FacultyActivity.this,AutomobileActivity.class);
                startActivity(au);
            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ph=new Intent(FacultyActivity.this,PhysicsActivity.class);
                startActivity(ph);
            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch=new Intent(FacultyActivity.this,ChemistryActivity.class);
                startActivity(ch);
            }
        });
        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mat=new Intent(FacultyActivity.this,MathActivity.class);
                startActivity(mat);
            }
        });
        humanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hu=new Intent(FacultyActivity.this,HumanityActivity.class);
                startActivity(hu);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent po=new Intent(FacultyActivity.this,PowerActivity.class);
                startActivity(po);
            }
        });
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent th=new Intent(FacultyActivity.this,ThermalActivity.class);
                startActivity(th);
            }
        });

        environmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent en=new Intent(FacultyActivity.this,EnvironmentalActivity.class);
                startActivity(en);
            }
        });
        structural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent st=new Intent(FacultyActivity.this,StructuralActivity.class);
                startActivity(st);
            }
        });
        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr=new Intent(FacultyActivity.this,ProductionActivity.class);
                startActivity(pr);
            }
        });
        computers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent com=new Intent(FacultyActivity.this,ComputersActivity.class);
                startActivity(com);
            }
        });
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bg=new Intent(FacultyActivity.this,CommunicationActivity.class);
                startActivity(bg);
            }
        });

        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhj=new Intent(FacultyActivity.this,ComputernActivity.class);
                startActivity(mhj);
            }
        });
        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lk=new Intent(FacultyActivity.this,MaterialsActivity.class);
                startActivity(lk);
            }
        });
        biomedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bu=new Intent(FacultyActivity.this,BiomedicalActivity.class);
                startActivity(bu);
            }
        });




    }
}
