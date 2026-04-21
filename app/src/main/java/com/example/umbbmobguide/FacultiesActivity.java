package com.example.umbbmobguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FacultiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);

        ListView listView = findViewById(R.id.listFaculties);

        ArrayList<Faculty> list = new ArrayList<>();

        list.add(new Faculty("Faculté des sciences ", R.drawable.info));
        list.add(new Faculty("Faculté des technologie", R.drawable.logo_umbb));
        list.add(new Faculty("Faculté des Hydrocarbures et de la Chimie", R.drawable.umbb));
        list.add(new Faculty("Faculté de droit et sciences politiques", R.drawable.umbb));
        list.add(new Faculty("Faculté des lettres et les langues", R.drawable.umbb));
        list.add(new Faculty("Faculté des Sciences Economiques, Commerciales et des Sciences de Gestion", R.drawable.umbb));
        list.add(new Faculty("Institut de Génie Eléctrique et Eléctronique", R.drawable.umbb));
        list.add(new Faculty("Institut des Sciences et Techniques Appliquées", R.drawable.umbb));
        list.add(new Faculty("Annexe Médecine", R.drawable.umbb));
        list.add(new Faculty("Annexe ENS - Boumerdes", R.drawable.umbb));
        FacultyAdapter adapter = new FacultyAdapter(this, list);
        listView.setAdapter(adapter);
    }
}