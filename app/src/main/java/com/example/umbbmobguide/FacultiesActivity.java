package com.example.umbbmobguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FacultiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);

        ListView listView = findViewById(R.id.listFaculties);
        SearchView searchview = findViewById(R.id.search);
        ArrayList<Faculty> list = new ArrayList<>();

        list.add(new Faculty("Faculty of Sciences", R.drawable.fs_umbb));
        list.add(new Faculty("Faculty of Technology", R.drawable.ft_umbb));
        list.add(new Faculty("Faculty of Hydrocarbons and Chemistry", R.drawable.fhc_umbb));
        list.add(new Faculty("Faculty of Law and Political Science", R.drawable.fp_umbb));
        list.add(new Faculty("Faculty of Letters and Languages", R.drawable.fll_umbb));
        list.add(new Faculty("Faculty of Economic Sciences, Commercial Sciences, and Management Sciences", R.drawable.fse_umbb));
        list.add(new Faculty("Institute of Electrical and Electronic Engineering", R.drawable.igee_umbb));
        list.add(new Faculty("Institute of Applied Sciences and Technology", R.drawable.ista));
//        list.add(new Faculty("Annexe Médecine", R.drawable.logo_umbb));
//        list.add(new Faculty("Annexe ENS - Boumerdes", R.drawable.logo_umbb));
        FacultyAdapter adapter = new FacultyAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Departments_page.class);
                Faculty selectedFaculty = adapter.getItem(i);
                intent.putExtra("name", selectedFaculty.getName());
                intent.putExtra("logo", selectedFaculty.getLogo());
                startActivity(intent);
            }
        });
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
               adapter.getFilter().filter(query);
                return false;
            }
        });
    }


}