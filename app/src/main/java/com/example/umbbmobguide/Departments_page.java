package com.example.umbbmobguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class Departments_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments_page);

        String facultyName = getIntent().getStringExtra("name");
        int facultyLogo = getIntent().getIntExtra("logo", R.drawable.logo_umbb);

        ImageView img = findViewById(R.id.img);
        TextView txtName = findViewById(R.id.txtName);

        img.setImageResource(facultyLogo);
        txtName.setText(facultyName);

        ListView listView = findViewById(R.id.listDepartments);
        ArrayList<Department> list = new ArrayList<>();
        listView.setNestedScrollingEnabled(false);
        TextView textview = findViewById(R.id.txtDescription);


        CardView btnCall = findViewById(R.id.btnCall);
        CardView btnEmail = findViewById(R.id.btnEmail);
        CardView btnLocation = findViewById(R.id.btnLocation);


        String phone = "";
        String email = "";
        String location = "";

        if (facultyName == null) facultyName = "";

        if (facultyName.equals(getString(R.string.faculty_sciences))) {
            textview.setText(getString(R.string.fs_desc));
            phone = "024799005";
            email = "doyenfs@umbb.dz";
            location = "36.75225162344843, 3.470397010495992";

            list.add(new Department(getString(R.string.dept_maths), R.drawable.pi));
            list.add(new Department(getString(R.string.dept_cs), R.drawable.pc));

            list.add(new Department(getString(R.string.dept_physics), R.drawable.physic_atom));
            list.add(new Department(getString(R.string.dept_chemistry), R.drawable.chemistry));

            list.add(new Department(getString(R.string.dept_biology), R.drawable.biology));

            list.add(new Department(getString(R.string.dept_agronomy), R.drawable.agronomy));
            list.add(new Department(getString(R.string.dept_sports), R.drawable.sports));

        } else if (facultyName.equals(getString(R.string.faculty_technology))) {
            textview.setText(getString(R.string.ft_desc));
            phone = "024941499";
            email = "contactft@univ-boumerdes.dz";
            location = "36.76115276140637, 3.4577018652655607";

            list.add(new Department(getString(R.string.dept_industrial_process), R.drawable.industry));
            list.add(new Department(getString(R.string.dept_food_tech), R.drawable.industry));

            list.add(new Department(getString(R.string.dept_env_eng), R.drawable.solar_farm));

            list.add(new Department(getString(R.string.dept_mech_eng), R.drawable.mechanic));

            list.add(new Department(getString(R.string.dept_energetics), R.drawable.solar_farm));
            list.add(new Department(getString(R.string.dept_maintenance), R.drawable.industry));

            list.add(new Department(getString(R.string.dept_materials), R.drawable.industry));

            list.add(new Department(getString(R.string.dept_civil_eng), R.drawable.civil_eng));

        } else if (facultyName.equals(getString(R.string.faculty_hydrocarbons))) {
            textview.setText(getString(R.string.fhc_desc));
            location = "36.76324014803502, 3.4728207297934617";
            phone = "+21324795162";
            email = "fhc@univ-boumerdes.dz";

            list.add(new Department(getString(R.string.dept_earthquake), R.drawable.earthquake));
            list.add(new Department(getString(R.string.dept_mining), R.drawable.oil_rig));
            list.add(new Department(getString(R.string.dept_transport), R.drawable.oil_rig));

            list.add(new Department(getString(R.string.dept_chem_pharm), R.drawable.chemistry));
            list.add(new Department(getString(R.string.dept_automation), R.drawable.industry));

            list.add(new Department(getString(R.string.dept_econ_marketing), R.drawable.oil_rig));

        } else if (facultyName.equals(getString(R.string.faculty_law))) {
            textview.setText(getString(R.string.law_desc));
            phone = "024745627";
            email = "benseghierabdou@gmail.com";
            location = "36.73164408156285, 3.3921197264373224";

            list.add(new Department(getString(R.string.dept_public_law), R.drawable.law));
            list.add(new Department(getString(R.string.dept_private_law), R.drawable.law));

            list.add(new Department(getString(R.string.dept_political_science), R.drawable.politics));

        } else if (facultyName.equals(getString(R.string.faculty_letters))) {
            textview.setText(getString(R.string.fll_desc));
            location = "36.73166802871915, 3.392091137780811";
            phone = "024703911";
            email = "n.oulebsir@univ-boumerdes.dz";

            list.add(new Department(getString(R.string.dept_arabic_lit), R.drawable.language));
            list.add(new Department(getString(R.string.dept_french), R.drawable.language));

            list.add(new Department(getString(R.string.dept_english), R.drawable.language));

        } else if (facultyName.equals(getString(R.string.faculty_economics))) {
            textview.setText(getString(R.string.fse_desc));
            location = "36.76362007240224, 3.475779667316668";
            phone = "024795257";
            email = "fsegc@univ-boumerdes.dz";

            list.add(new Department(getString(R.string.dept_management), R.drawable.managment));

            list.add(new Department(getString(R.string.dept_commercial), R.drawable.economy));

             list.add(new Department(getString(R.string.dept_econ_sci), R.drawable.economy));
            list.add(new Department(getString(R.string.dept_finance), R.drawable.economy));

        } else if (facultyName.equals(getString(R.string.institute_electrical))) {
            textview.setText(getString(R.string.igee_desc));
            location = "36.75880496745825, 3.472711118893047";
            phone = "024795763";
            email = "itigee@univ-boumerdes.dz";

            list.add(new Department(getString(R.string.dept_auto_elec), R.drawable.electrics));

            list.add(new Department(getString(R.string.dept_basic_edu), R.drawable.electronic));

            list.add(new Department(getString(R.string.dept_electronics), R.drawable.electronic));

        } else if (facultyName.equals(getString(R.string.institute_applied_tech))) {
            textview.setText(getString(R.string.ista_desc));
            location = "36.76259242070286, 3.476943399872513";
            phone = "024795183";
            email = "ista-umbb@univ-boumerdes.dz";

            list.add(new Department(getString(R.string.dept_mmq), R.drawable.safety));

        } else {
            phone = "";
            email = "";
            location = "";
        }

        DepartmentAdapter adapter = new DepartmentAdapter(this, list);
        listView.setAdapter(adapter);


        listView.post(() -> {
            int totalHeight = 0;

            for (int i = 0; i < adapter.getCount(); i++) {
                View item = adapter.getView(i, null, listView);
                item.measure(0, 0);
                totalHeight += item.getMeasuredHeight();
            }

            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(params);
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Specialities_page.class);
                intent.putExtra("name", list.get(i).name);

                intent.putExtra("logo", list.get(i).logo);
                startActivity(intent);
            }
        });
        //call button click
        String finalPhone = phone;
        btnCall.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel:" + finalPhone);
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        });
//email button click
        String finalEmail = email;
        btnEmail.setOnClickListener(v -> {
            Uri uri = Uri.parse("mailto:" + finalEmail);

            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Faculty Information");


            startActivity(intent);
        });
        // google maps button click
        String finalLocation = location;
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:" + finalLocation + "?q=" + finalLocation);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
