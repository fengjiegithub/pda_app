package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ComputerscActivity extends AppCompatActivity {
    TextView t7,tex39,tex40,tex41,tex42,tex44,tex46,tex48,tex49,tex66,tex67,tex68,tex69,tex70,tex71,tex72,tex73,tex74,
    tex51,tex52,tex53,tex54,tex55,tex56,tex57,tex58,tex59,tex60,tex61,tex62,tex63,tex64,t11;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computersc);
//        t7=findViewById(R.id.t7);
//        tex39=findViewById(R.id.tex39);
//        tex40=findViewById(R.id.tex40 );
//        tex41=findViewById(R.id.tex39);
//        tex42=findViewById(R.id.tex42);
//        tex44=findViewById(R.id.tex44);
//        tex46=findViewById(R.id.tex46);
//        tex48=findViewById(R.id.tex48);
//        tex49=findViewById(R.id.tex49);
//        tex67=findViewById(R.id.tex67);
//        tex66=findViewById(R.id.tex66);
//        tex68=findViewById(R.id.tex68);
//        tex69=findViewById(R.id.tex69);
//        tex70=findViewById(R.id.tex70);
//        tex71=findViewById(R.id.te71);
//        tex72=findViewById(R.id.tex72);
//        tex73=findViewById(R.id.tex73);
//        tex74=findViewById(R.id.tex74);
//        tex51=findViewById(R.id.tex51);
//        tex52=findViewById(R.id.tex52);
//        tex53=findViewById(R.id.tex53);
//        tex54=findViewById(R.id.tex54);
//        tex55=findViewById(R.id.tex55);
//        tex56=findViewById(R.id.tex56);
//        tex57=findViewById(R.id.tex57);
//        tex58=findViewById(R.id.tex58);
//        tex59=findViewById(R.id.tex59);
//        tex60=findViewById(R.id.tex60);
//        tex61=findViewById(R.id.tex61);
//        tex62=findViewById(R.id.tex62);
//        tex63=findViewById(R.id.tex63);
//        tex64=findViewById(R.id.tex64);
//        t11=findViewById(R.id.t11);
//
//
//
//
//        t7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent t=new Intent(ComputerscActivity .this,ComputerActivity.class);
//                startActivity(t);
//            }
//        });
//        tex39.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/cs1.pdf?alt=media&token=0aa04c4f-6e65-4137-a823-1d3b30573d67");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex40.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/cs2.pdf?alt=media&token=07eb689f-915e-4e09-9738-212f29106d15");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex41.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/cs3.pdf?alt=media&token=c768b652-c474-4bf0-9300-91f7cd1ec56c");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex42.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/cs4.pdf?alt=media&token=610e2698-35cf-4e68-b361-bdfc80e5643e");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex44.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/le1.pdf?alt=media&token=feabf9b8-543a-46fc-ba73-dcc147bc7f00");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex46.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/le2.pdf?alt=media&token=d9d7af79-d3c9-40a9-a788-37698abfcd88");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex48.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/n1.pdf?alt=media&token=727e3be5-9bdb-4c34-b9aa-cc5fe40c84da");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex49.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/n2.pdf?alt=media&token=46c17fcb-36f2-4d4f-bc07-035a2406efa9");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex66.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q1.pdf?alt=media&token=a012dace-f4ea-4d31-a6ef-af26eedfc8e3");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex67.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/1.docx?alt=media&token=f4d1d8d9-640f-42de-8d80-fa7ef7dcdbdb");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex68.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q2.pdf?alt=media&token=ab558e7d-317f-4056-aabc-923a082f0e24");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex69.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q3.pdf?alt=media&token=e9f8516e-5b6f-4658-a7f7-73d21d2da6a5");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex70.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q4.pdf?alt=media&token=29d3c9f0-fda4-4926-9b4b-9bf9c57650a0");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex71.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q5.pdf?alt=media&token=4680e5af-473f-4e75-b19b-64b9fa944320");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex72.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q6.pdf?alt=media&token=80042a89-61fb-4c41-aad1-d88dd961c5b5");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex73.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q7.pdf?alt=media&token=f7166162-28c0-42aa-bfe8-d43886b2f3cf");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex74.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/q8.pdf?alt=media&token=3387f0ec-6eec-4203-86da-787b862ab8d1");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//
//        tex51.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu1.pdf?alt=media&token=6847305c-fa02-41b5-9965-d745c08e993e");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex52.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu2.pdf?alt=media&token=34a64e10-ebf1-4432-8515-d9dfc2ec09d8");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex53.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu3.pdf?alt=media&token=d7010ee8-d25e-4ad7-8b6a-e16e0ae5b94d");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex54.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu4.pdf?alt=media&token=a54160bc-7883-4ce9-ae6a-08f693a8eaee");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex55.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu5.pdf?alt=media&token=574398db-06ff-4191-bc1c-8275e803b41a");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex56.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu6.pdf?alt=media&token=1dc25024-57db-4972-99fc-f3f19681f948");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex57.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 Intent i=new Intent(Intent.ACTION_VIEW);
//                 i.setData(Uri.parse("https://machinelearningmastery.com/how-to-run-your-first-classifier-in-weka/"));
//                 startActivity(i);
//            }
//        });
//        tex58.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu7.pdf?alt=media&token=ff4dd469-7c6a-4234-8597-20f15f6296f7");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex59.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu8.pdf?alt=media&token=63600e11-1b0b-4c9c-a30b-1a36899b9a0b");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex60.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("http://facweb.cs.depaul.edu/mobasher/classes/ect584/WEKA/preprocess.html"));
//                startActivity(i);
//            }
//        });
//        tex61.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("http://facweb.cs.depaul.edu/mobasher/classes/ect584/WEKA/associate.html"));
//                startActivity(i);
//
//            }
//        });
//        tex62.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu9.pdf?alt=media&token=bee94bc9-146b-4ec1-94c5-732126ca1d24");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex63.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu10.pdf?alt=media&token=8f0c2da5-4834-4923-8fca-4b0e6b90a4c9");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        tex64.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu11.pdf?alt=media&token=49c4393b-da45-47bf-91ef-50ddc1218dae");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });
//        t11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/qu12.pdf?alt=media&token=c2ed7065-96f3-46d1-9ba1-0a9f0b468396");
//                DownloadManager.Request request =new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
//            }
//        });


    }
}
