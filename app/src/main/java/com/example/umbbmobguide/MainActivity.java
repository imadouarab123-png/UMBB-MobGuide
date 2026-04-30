package com.example.umbbmobguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.activity.OnBackPressedCallback;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CardView btnAbout, btnFaculties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.btnAbout);
        btnFaculties = findViewById(R.id.btnFaculties);

        btnAbout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        });

        btnFaculties.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FacultiesActivity.class);
            startActivity(intent);
        });


        //toolbar and menu java code
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.Open,R.string.Close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

/*
if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout,new MainActivity()).commit();
        }
*/

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.settings) {
            startActivity(new Intent(MainActivity.this, settingPage.class));
        }
//        else if (id == R.id.aboutUs) {
//            startActivity(new Intent(MainActivity.this, AboutUS.class));
//        }
else if(id == R.id.exitApp){
            System.exit(0);
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}