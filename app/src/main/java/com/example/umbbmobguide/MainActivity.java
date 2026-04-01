package com.example.umbbmobguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAbout, btnFaculties;

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
    }
}