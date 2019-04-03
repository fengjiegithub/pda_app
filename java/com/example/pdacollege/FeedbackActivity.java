package com.example.pdacollege;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class FeedbackActivity extends AppCompatActivity {
    EditText name,email,subject,feedback;
    Button send;
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        subject=findViewById(R.id.subject);
        feedback=findViewById(R.id.feedbck);
        send=findViewById(R.id.send);
        firebase.setAndroidContext(this);

        firebase =new Firebase("https://pdacollege-940c1.firebaseio.com");

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String na =name.getText().toString();
                String em=email.getText().toString();
                String su=subject.getText().toString();
                String fe=feedback.getText().toString();


                Firebase childname = firebase.child("Name");
                childname.setValue(na);
                if (name==null){
                    name.setError("This is an required Field");
                    send.setEnabled(false);

                }
                else {
                    name.setError(null);
                    send.setEnabled(true);
                }

                Firebase childemail = firebase.child("Email");
                childemail.setValue(na);
                if (email==null){
                    email.setError("This is an required Field");
                    send.setEnabled(false);

                }
                else {
                    email.setError(null);
                    send.setEnabled(true);
                }

                Firebase childsubject = firebase.child("Subject");
                childsubject.setValue(na);
                if (subject==null){
                    subject.setError("This is an required Field");
                    send.setEnabled(false);

                }
                else {
                    subject.setError(null);
                    send.setEnabled(true);
                }

                Firebase childfeedback = firebase.child("Feedback");
                childfeedback.setValue(na);
                if (feedback==null){
                    feedback.setError("This is an required Field");
                    send.setEnabled(false);

                }
                else {
                    feedback.setError(null);
                    send.setEnabled(true);
                }
            }
        });

    }
}
