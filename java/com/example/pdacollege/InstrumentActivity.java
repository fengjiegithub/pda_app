package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstrumentActivity extends AppCompatActivity {
    TextView tex14,tex15,tex16,tex17,tex19,tex20,tex25,tex26,q12;
    DownloadManager downloadManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);
        tex14=findViewById(R.id.tex14);
        tex15=findViewById(R.id.tex15);
        tex16=findViewById(R.id.tex16);
        tex17=findViewById(R.id.tex17);
        tex19=findViewById(R.id.tex19);
        tex20=findViewById(R.id.tex20);
        tex25=findViewById(R.id.tex25);
        tex26=findViewById(R.id.tex26);
        q12=findViewById(R.id.q12);

        tex14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/i1.pdf?alt=media&token=b298c288-bbab-4e14-a4a8-2e8d13820690");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/i2.pdf?alt=media&token=81cd43b6-b216-4167-9b2c-2ed596dcacce");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/i3.pdf?alt=media&token=f3fd717b-8a53-48bc-9137-7fe5a3de6a81");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/i4.pdf?alt=media&token=9577a4fa-16e3-47b6-a9a5-1ae4ab675ea1");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/lp-even-4-6-8.zip?alt=media&token=840bdd3b-d066-4a53-aca7-6d728b1660c5");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/lp-odd-3-5-7.zip?alt=media&token=f51e8be6-80df-4258-b9a1-454db1efdb93");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(InstrumentActivity.this,InstrumentationActivity.class);
                startActivity(it);
            }
        });
        tex26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/E%26IFACULTYLIST.pdf?alt=media&token=0d2f4340-abf1-42cf-a923-f7985d24cd60");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/it.pdf?alt=media&token=65cd9b38-bf07-49a5-a785-74ed2c6f6d6b");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });

    }
}
