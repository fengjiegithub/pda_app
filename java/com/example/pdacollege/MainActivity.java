package com.example.pdacollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int images[] = {R.drawable.pda,R.drawable.pda1,R.drawable.pda2};
        viewFlipper=findViewById(R.id.flipper);
//        for (int i=0; i< images.length; i++){
//            flipperImages(images[i]);
//        }
        for (int image:images){
            flipperImages(image);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
         switch (id) {
             case R.id.action_settings:
                  break;
             case R.id.action_logout:
                 Intent lg=new Intent(MainActivity.this,LoginActivity.class);
                 startActivity(lg);
                 break;
             case R.id.fedb:
                 Intent fee=new Intent(MainActivity.this,FeedbackActivity.class);
                 startActivity(fee);

         }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_about:
                Intent ab=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(ab);
                break;
            case R.id.nav_morelink:
                Intent ml=new Intent(MainActivity.this,MorelinkActivity.class);
                startActivity(ml);
                break;
            case R.id.nav_home:
                Intent vx=new Intent(Intent.ACTION_VIEW);
                vx.setData(Uri.parse("http://pda.hkes.edu.in/"));
                startActivity(vx);
                break;
            case R.id.nav_examination:
                Intent ex=new Intent(MainActivity.this,ExaminationActivity.class);
                startActivity(ex);
                break;

            case R.id.nav_admission:
                Intent a=new Intent(MainActivity.this,AdmissionActivity.class);
                startActivity(a);
                break;
            case R.id.nav_departments:
                Intent d=new Intent(MainActivity.this,DepartmentActivity.class);
                startActivity(d);
                break;
            case R.id.nav_placement:
                Intent bg=new Intent(Intent.ACTION_VIEW);
                bg.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m07&page=placement"));
                startActivity(bg);
                break;
            case R.id.nav_teqip:
                Intent bn=new Intent(Intent.ACTION_VIEW);
                bn.setData(Uri.parse("http://pda.hkes.edu.in/load?menu=m05&page=teqip"));
                startActivity(bn);
            case R.id.nav_grievance:
                Intent hg=new Intent(Intent.ACTION_VIEW);
                hg.setData(Uri.parse("http://pda.edugrievance.com/"));
                startActivity(hg);
                break;
            case R.id.faculty:
                 Intent fa=new Intent(MainActivity.this,FacultyActivity.class);
                 startActivity(fa);
                 break;
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
