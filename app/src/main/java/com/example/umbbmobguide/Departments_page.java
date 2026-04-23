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

        TextView textview = findViewById(R.id.txtDescription);


        CardView btnCall = findViewById(R.id.btnCall);
        CardView btnEmail = findViewById(R.id.btnEmail);
        CardView btnLocation = findViewById(R.id.btnLocation);


        String phone = "";
        String email = "";
        String location = "";

// listView and the description text for each faculty name
        if (facultyName.contains("sciences") && !facultyName.contains("Economiques")) {
            //description text
           textview.setText("description for umbb");

            phone = "213550000111";
            email = "sciences@umbb.dz";
            location = "UMBB Faculty of Sciences, Boumerdes";


            list.add(new Department("Département de Mathématiques", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département d'Informatique", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Physique", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Chimie", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Biologie", R.drawable.ic_launcher_foreground));

        } else if (facultyName.contains("technologie")) {

            phone = "213550000222";
            email = "tech@umbb.dz";
            location = "UMBB Faculty of Technology, Boumerdes";

            textview.setText("description for umbb");
            list.add(new Department("Département de Génie Civil", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Génie Mécanique", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Génie des Procédés", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département d'Architecture", R.drawable.ic_launcher_foreground));

        } else if (facultyName.contains("Hydrocarbures")) {
            location = "";
            phone = "";
            email = "";
            textview.setText("description for umbb");
            list.add(new Department("Département des Hydrocarbures", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Chimie Industrielle", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Raffinage et Pétrochimie", R.drawable.ic_launcher_foreground));

        } else if (facultyName.contains("droit")) {

            phone = "213550000333";
            email = "droit@umbb.dz";
            location = "UMBB Faculty of Law, Boumerdes";



            textview.setText("description for umbb");
            list.add(new Department("Département de Droit Privé", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Droit Public", R.drawable.ic_launcher_foreground));
            list.add(new Department("Département de Sciences Politiques", R.drawable.ic_launcher_foreground));

        } else if (facultyName.contains("lettres")) {
                location = "";
                phone = "";
                email = "";
                textview.setText("description for umbb");
                list.add(new Department("Département de Langue Arabe", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département de Langue Française", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département de Langue Anglaise", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département de Traduction", R.drawable.ic_launcher_foreground));

            } else if (facultyName.contains("Economiques")) {
                textview.setText("description for umbb");
                list.add(new Department("Département des Sciences Economiques", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département des Sciences de Gestion", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département des Sciences Commerciales", R.drawable.ic_launcher_foreground));

            } else if (facultyName.contains("Eléctrique")) {
                textview.setText("description for umbb");
                list.add(new Department("Département d'Electrotechnique", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département d'Electronique", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département d'Automatique", R.drawable.ic_launcher_foreground));

            } else if (facultyName.contains("Appliquées")) {
                textview.setText("description for umbb");
                list.add(new Department("Département de Maintenance Industrielle", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département d'Hygiène et Sécurité Industrielle", R.drawable.ic_launcher_foreground));

            } else if (facultyName.contains("Médecine")) {
                textview.setText("description for umbb5");
                list.add(new Department("Département de Médecine", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département de Pharmacie", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département de Chirurgie Dentaire", R.drawable.ic_launcher_foreground));

            } else if (facultyName.contains("ENS")) {
                textview.setText("g industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
                list.add(new Department("Département des Sciences Exactes", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département des Lettres et Sciences Humaines", R.drawable.ic_launcher_foreground));
                list.add(new Department("Département des Langues", R.drawable.ic_launcher_foreground));
            }else{
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
            intent.putExtra(Intent.EXTRA_TEXT, "Hello, I need information about your faculty.");

            startActivity(intent);
        });
        // google maps button click
        String finalLocation = location;
        btnLocation.setOnClickListener(v -> {

            Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(finalLocation));

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");

            startActivity(intent);
        });
    }
}