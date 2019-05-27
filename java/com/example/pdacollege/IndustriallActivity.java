package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndustriallActivity extends AppCompatActivity {
    TextView h2,tex26;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industriall);
        h2=findViewById(R.id.h2);
        tex26=findViewById(R.id.tex26);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hr=new Intent(Intent.ACTION_VIEW);
                hr.setData(Uri.parse("http://ieomsociety.org/ieom/pda/"));
                startActivity(hr);
            }
        });
        tex26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/if.pdf?alt=media&token=fd59b161-d625-41cf-b3af-026d4ee1031c");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
    }
}
