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

// listView and the description text for each faculty name
        if (facultyName.contains("Faculty of Sciences")) {
            //description text
            textview.setText("The Faculty of Sciences  at M'Hamed Bougara University of Boumerdes is a recognized for scientific education and research. It provides comprehensive training in disciplines, equipping students with the knowledge and skills to address real-world challenges through scientific approaches" );

            phone = "024799005";
            email = "doyenfs@umbb.dz";
            location = "36.75225162344843, 3.470397010495992";


            list.add(new Department("Departement of Mathematics", R.drawable.pi));
            list.add(new Department("Department of Computer Science", R.drawable.pc));
            list.add(new Department("Department of Physics", R.drawable.physic_atom));
            list.add(new Department("Department of Chemistry", R.drawable.chemistry));
            list.add(new Department("Department of Biology", R.drawable.biology));

            list.add(new Department("Department of Agronomic Sciences", R.drawable.agronomy));
            list.add(new Department("Department of STAPS(Sciences and Techniques of Physical and Sports)", R.drawable.sports));
        } else if (facultyName.contains("Faculty of Technology")) {

            phone = "024941499";
            email = "contactft@univ-boumerdes.dz";
            location = "36.76115276140637, 3.4577018652655607";

            textview.setText("The Faculty of Technology  at M'Hamed Bougara University of Boumerdes is a recognized for technical education and applied research. It provides comprehensive training in disciplines such as Mechanical Engineering, equipping students with the knowledge and skills to address real-world challenges through technological innovation.");
            list.add(new Department("Departement of Industrial Process Engineering", R.drawable.industry));
            list.add(new Department("Departement of Food Technology", R.drawable.industry));
            list.add(new Department("Departement of Environmental Engineering", R.drawable.solar_farm));
            list.add(new Department("Departement of Mechanical Engineering", R.drawable.mechanic));
            list.add(new Department("Departement of Energetics", R.drawable.solar_farm));
            list.add(new Department("Departement of Industrial Maintenance", R.drawable.industry));
            list.add(new Department("Departement of Materials Science and Engineering", R.drawable.industry));
            list.add(new Department("Departement of Civil Engineering", R.drawable.civil_eng));

        } else if (facultyName.contains("Hydrocarbons and Chemistry")) {
            location = "36.76324014803502, 3.4728207297934617";
            phone = "+21324795162";
            email = "fhc@univ-boumerdes.dz";
            textview.setText("The Faculty of Hydrocarbons and Chemistry  at M'Hamed Bougara University of Boumerdes has continuously adapted to meet the challenges of rapid technological developments in the field of Hydrocarbons. The goal is to train graduates with the knowledge and skills needed for research, development, production, or teaching. Studying at FHC requires personal effort and commitment, while also offering a rewarding experience");
            list.add(new Department("Departement of Earthquake Engineering, Geophysics, and Random Phenomena", R.drawable.earthquake));
            list.add(new Department("Departement of Mining and Petroleum Deposits", R.drawable.oil_rig));
            list.add(new Department("Departement of Hydrocarbon Transportation and Equipment", R.drawable.oil_rig));
            list.add(new Department("Departement of Chemical and Pharmaceutical Process Engineering", R.drawable.chemistry));
            list.add(new Department("Departement of Process Automation and Electrification", R.drawable.industry));
            list.add(new Department("Departement of Hydrocarbon Economics and Marketing", R.drawable.oil_rig));

        } else if (facultyName.contains("Law")) {

            phone = "024745627";
            email = "benseghierabdou@gmail.com";
            location = "36.73164408156285, 3.3921197264373224";


            textview.setText("The Faculty of Law and Political Science  at M'Hamed Bougara University of Boumerdes provides quality education in legal studies and political sciences. The faculty is committed to training students in legal reasoning, political analysis, and civic responsibility.");
            list.add(new Department("Departement of Public Law", R.drawable.law));
            list.add(new Department("Departement of Private Law", R.drawable.law));
            list.add(new Department("Departement of Political Science", R.drawable.politics));

        } else if (facultyName.contains("Letters and Languages")) {
            location = "36.73166802871915, 3.392091137780811";
            phone = "024703911";
            email = "n.oulebsir@univ-boumerdes.dz";
            textview.setText("The Faculty of Letters and Languages  at M'Hamed Bougara University of Boumerdes provides quality education in literature, linguistics, and foreign languages. The faculty is committed to developing students' language proficiency, analytical skills, and cultural awareness. It prepares graduates with the knowledge and competencies needed for careers in translation, teaching, journalism, publishing, and international communication.");
            list.add(new Department("Department of Arabic Literature", R.drawable.language));
            list.add(new Department("Department of French language", R.drawable.language));
            list.add(new Department("Department of English language", R.drawable.language));


        } else if (facultyName.contains("Economic Sciences")) {
            location= "36.76362007240224, 3.475779667316668";
            phone = "024795257";
            email = "fsegc@univ-boumerdes.dz";

            textview.setText("The Faculty of Economic Sciences, Commercial Sciences, and Management Sciences  at M'Hamed Bougara University of Boumerdes provides quality education in economics, business, and management. The faculty is committed to developing students' analytical, managerial, and decision-making skills. It prepares graduates with the knowledge and competencies needed for careers in finance, banking, marketing, trade, and public administration.");
            list.add(new Department("Department of Management Sciences", R.drawable.managment));
            list.add(new Department("Department of Commercial Sciences", R.drawable.economy));
            list.add(new Department("Department of Economic Sciences", R.drawable.economy));
            list.add(new Department("Department of Finance and Accounting", R.drawable.economy));

        } else if (facultyName.contains("Institute of Electrical and Electronic Engineering")) {


            location = "36.75880496745825, 3.472711118893047";
            phone = "024795763";
            email = "itigee@univ-boumerdes.dz";


            textview.setText("The Institute of Electrical and Electronic Engineering  at M'Hamed Bougara University of Boumerdes provides quality education in electrical systems, electronic circuits, and automation. The institute is committed to developing students' technical, analytical, and problem-solving skills. It prepares graduates with the knowledge and competencies needed for careers in power generation, telecommunications, embedded systems, and industrial control.");
            list.add(new Department("Department of Automation and Electrical Engineering", R.drawable.electrics));
            list.add(new Department("Departement of Basic Education", R.drawable.electronic));
            list.add(new Department("Departement of Electronics", R.drawable.electronic));

        } else if (facultyName.contains("Applied Sciences and Technology")) {
            location = "36.76259242070286, 3.476943399872513";

            phone = "024795183";
            email = "ista-umbb@univ-boumerdes.dz";

            textview.setText("The Institute of Applied Sciences and Technology (ISTA) at M'Hamed Bougara University of Boumerdes was established in response to national concerns regarding graduate employability and integration into the socio-economic sector. The Institute has offered a professional bachelor's degree in Measurement, Metrology, and Quality,");
            list.add(new Department("Department of MMQ(Mesures, Metrology & quality)", R.drawable.safety));

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
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.75350432201355, 3.473436924088286"));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+finalLocation));
                startActivity(intent);
            }
        });
    }
}