package com.example.umbbmobguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);






        CardView btnCall = findViewById(R.id.btnCall_about);

       CardView btnEmail = findViewById(R.id.btnEmail_about);


        String phone = "024795188";
        String email = "communication@univ-boumerdes.dz";
        btnCall.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel:" + phone);
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        });
//email button click
        btnEmail.setOnClickListener(v -> {
            Uri uri = Uri.parse("mailto:" + email);

            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra(Intent.EXTRA_SUBJECT, "University information");


            startActivity(intent);
        });
    }

}