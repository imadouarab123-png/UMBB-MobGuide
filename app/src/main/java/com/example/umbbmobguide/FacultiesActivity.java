package com.example.umbbmobguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        list.add(new Faculty("Faculté des sciences ", R.drawable.fs_umbb));
        list.add(new Faculty("Faculté des technologie", R.drawable.ft_umbb));
        list.add(new Faculty("Faculté des Hydrocarbures et de la Chimie", R.drawable.fhc_umbb));
        list.add(new Faculty("Faculté de droit et sciences politiques", R.drawable.fp_umbb));
        list.add(new Faculty("Faculté des lettres et les langues", R.drawable.fll_umbb));
        list.add(new Faculty("Faculté des Sciences Economiques, Commerciales et des Sciences de Gestion", R.drawable.fse_umbb));
        list.add(new Faculty("Institut de Génie Eléctrique et Eléctronique", R.drawable.igee_umbb));
        list.add(new Faculty("Institut des Sciences et Techniques Appliquées", R.drawable.ista));
        list.add(new Faculty("Annexe Médecine", R.drawable.logo_umbb));
        list.add(new Faculty("Annexe ENS - Boumerdes", R.drawable.logo_umbb));
        FacultyAdapter adapter = new FacultyAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Departments_page.class);
                intent.putExtra("name", list.get(i).name);
                intent.putExtra("logo", list.get(i).logo);
                startActivity(intent);
            }
        });
    }


}