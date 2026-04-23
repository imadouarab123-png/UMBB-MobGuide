package com.example.umbbmobguide;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Specialities_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specialities_page);

        // getting department name from intent
        String departmentName = getIntent().getStringExtra("name");

        TextView txtDepartment = findViewById(R.id.txtDepartment);
        txtDepartment.setText(departmentName);

        ListView listView = findViewById(R.id.listSpecialities);
        ArrayList<Speciality> list = new ArrayList<>();


        TextView textview = findViewById(R.id.txtSpecDescription);
       //conditions for every department by its name
        if (departmentName.contains("Informatique")) {
            textview.setText("speciality description");
            list.add(new Speciality("Artificial Intelligence"));
            list.add(new Speciality("Software Engineering"));
            list.add(new Speciality("Networks"));
            list.add(new Speciality("Information Systems"));

        } else if (departmentName.contains("Math")) {
            textview.setText("speciality description");
            list.add(new Speciality("Pure Mathematics"));
            list.add(new Speciality("Applied Mathematics"));
            list.add(new Speciality("Statistics"));

        } else if (departmentName.contains("Physics")) {
            textview.setText("speciality description");
            list.add(new Speciality("Theoretical Physics"));
            list.add(new Speciality("Materials Physics"));

        } else {

            list.add(new Speciality("No specialities available"));
        }


        SpecialityAdapter adapter = new SpecialityAdapter(this, list);
        listView.setAdapter(adapter);

        // listView height fix interface
        listView.post(() -> {
            int totalHeight = 0;

            for (int i = 0; i < adapter.getCount(); i++) {
                View item = adapter.getView(i, null, listView);
                item.measure(0, 0);
                totalHeight += item.getMeasuredHeight();
            }

            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalHeight +
                    (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(params);
        });
    }
}