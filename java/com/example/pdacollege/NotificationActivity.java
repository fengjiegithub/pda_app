package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {
    TextView tex13,tex14,tex15,tex16,tex17,tex18,tex19;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        tex13=findViewById(R.id.tex13);
        tex14=findViewById(R.id.tex14);
        tex15=findViewById(R.id.tex15);
        tex16=findViewById(R.id.tex16);
        tex17=findViewById(R.id.tex17);
        tex18=findViewById(R.id.tex18);
        tex19=findViewById(R.id.tex19);
        tex13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex1.pdf?alt=media&token=6501490e-0749-46be-b261-870945c02748");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex2.pdf?alt=media&token=6fdd093b-dc9a-4e22-9159-1f207d7071c9");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex3.pdf?alt=media&token=398c6f85-01b4-44a5-aedf-bfbb063b8557");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex4.pdf?alt=media&token=3f8f260a-bd57-45c7-a7a8-1a4eacc0af86");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex5.pdf?alt=media&token=9686f450-38c0-4126-af87-6656eac221b9");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qb_16cv44.pdf?alt=media&token=3fe3c7d6-447a-4a05-b426-b31109ba92cf");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/ex6.pdf?alt=media&token=3d10e2f9-7d22-4cb6-8d2f-f67de1f638e5");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });

    }
}
