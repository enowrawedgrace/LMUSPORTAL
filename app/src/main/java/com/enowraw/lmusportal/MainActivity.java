package com.enowraw.lmusportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
BottomNavigationView bottomNavigationView;
Home home;
Apply apply;
FAQ faq;
Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        home = new Home();
        apply = new Apply();
        faq = new FAQ();
        profile = new Profile();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
toolbar=findViewById(R.id.toolbar);
bottomNavigationView=findViewById(R.id.bootambar);
toolbar.setTitle("LMUS");
    }
}