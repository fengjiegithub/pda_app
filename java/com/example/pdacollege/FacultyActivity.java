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
            information,computer,automobile,physics,chemistry,mathematics,humanity;
//    Button post,research;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
//        post=findViewById(R.id.post);
//        research=findViewById(R.id.research);
//        post.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent p=new Intent(FacultyActivity.this,UnderActivity.class);
//            }
//        });
//        research.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent r=new Intent(FacultyActivity.this,PostActivity.class);
//            }
//        });
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
                Intent intent=new Intent(FacultyActivity.this,CivilActivity.class);
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


    }
}
