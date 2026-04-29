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


        //conditions for every department by its name
        if (departmentName.contains("Computer Science")) {

            list.add(new Speciality("information system (License)"));
            list.add(new Speciality("Web Development and Infographics (License)"));
            list.add(new Speciality("Software Engineering and Information Processing  (Master)"));
            list.add(new Speciality("Applied Artificial Intelligence (Master)"));

        } else if (departmentName.contains("Mathematics")) {

            list.add(new Speciality("Mathematics (License)"));
            list.add(new Speciality("Applied Mathematics (License)"));
            list.add(new Speciality("Data Science (License)"));
            list.add(new Speciality("Mathematical Analysis (Master)"));
            list.add(new Speciality("Financial Mathematics (Master)"));
            list.add(new Speciality("Stochastic Modeling and Statistics (Master)"));
            list.add(new Speciality("Optimization and Strategic Management (Master)"));


        } else if (departmentName.contains("Department of Physics")) {
            list.add(new Speciality("Materials Physics (License)"));
            list.add(new Speciality("Radiation Physics (License)"));
            list.add(new Speciality("Energetic Physics (License)"));
            list.add(new Speciality("Fundamental Physics (License)"));
            list.add(new Speciality("Materials Physics (Master)"));
            list.add(new Speciality("Energetic Physics and Renewable Energies (Master)"));
            list.add(new Speciality("Medical Physics (Master)"));
            list.add(new Speciality("Radiation Physics (Master)"));


        } else if (departmentName.contains("Department of Chemistry")) {
            list.add(new Speciality("Materials Chemistry (License)"));
            list.add(new Speciality("Organic Chemistry (License)"));
            list.add(new Speciality("Analytical Chemistry (License)"));
            list.add(new Speciality("Materials Chemistry (Master)"));
            list.add(new Speciality("Pharmaceutical Chemistry (Master)"));
            list.add(new Speciality("Environmental Chemistry (Master)"));
            list.add(new Speciality("Analytical Chemistry (Master)"));
            list.add(new Speciality("Organic Chemistry (Master)"));


        } else if (departmentName.contains("Department of Biology")) {
            list.add(new Speciality("Biotechnology and Health (License)"));
            list.add(new Speciality("Microbial Biotechnology (License)"));
            list.add(new Speciality("Plant Biotechnology and Plant Breeding (License)"));
            list.add(new Speciality("Food Technology and Quality Control (License)"));
            list.add(new Speciality("Biochemistry (License)"));
            list.add(new Speciality("Organism Biology (License)"));
            list.add(new Speciality("Animal Biology and Physiology (License)"));
            list.add(new Speciality("Molecular Biology (License)"));
            list.add(new Speciality(" Ecology and Environment (License)"));

            list.add(new Speciality("Biotechnology and Molecular Pathology (Master)"));
            list.add(new Speciality("Microbial Biotechnology (Master)"));
            list.add(new Speciality("Plant Biotechnology (Master)"));
            list.add(new Speciality("Nutrition and Food Science (Master)"));
            list.add(new Speciality("Applied Biochemistry (Master)"));
            list.add(new Speciality("Population and Organism Biology (Master)"));
            list.add(new Speciality("Genetics (Master)"));
            list.add(new Speciality("Cellular Physiology and Pathophysiology (Master)"));
            list.add(new Speciality("Molecular and Cellular Biology (Master)"));
            list.add(new Speciality("Biodiversity and Environment (Master)"));
            list.add(new Speciality("Microbial Ecology (Master)"));



        } else if (departmentName.contains("Department of Agronomic Sciences")){
            list.add(new Speciality("Plant Protection (License)"));
            list.add(new Speciality("Crop Production (License)"));
            list.add(new Speciality("Animal Production (License)"));
            list.add(new Speciality("Phytopharmacology and Plant Protection (Master)"));
            list.add(new Speciality("Animal Production and Nutrition (Master)"));
            list.add(new Speciality("Crop Production (Master)"));
            list.add(new Speciality("Phytopathology (Master)"));


    }else if (departmentName.contains("Department of STAPS")){
            list.add(new Speciality("Education and Motor Skills (License)"));
            list.add(new Speciality("Competitive Sports Training (License)"));
            list.add(new Speciality("School Physical and Sporting Activity (Master)"));
            list.add(new Speciality("Elite Sports Training (Master)"));

        }else if (departmentName.contains("Departement of Industrial Process Engineering")) {
            list.add(new Speciality("Process Engineering (License)"));
            list.add(new Speciality("Food Engineering (Master)"));
            list.add(new Speciality("Chemical Engineering (Master)"));
            list.add(new Speciality("Polymer Engineering (Master)"));
            list.add(new Speciality("Materials Process Engineering (Master)"));
        }
        else if (departmentName.contains("Food Technology")) {
            list.add(new Speciality("Process Engineering (License)"));
            list.add(new Speciality("Food Engineering (Master)"));

        }
        else if (departmentName.contains("Environmental Engineering")) {
            list.add(new Speciality("Climate Engineering (License)"));
            list.add(new Speciality("Industrial Health and Safety (License)"));
            list.add(new Speciality("Environmental Engineering (Master)"));
            list.add(new Speciality("Environmental Process Engineering (Master)"));
            list.add(new Speciality("Water Engineering and Management (Master)"));
            list.add(new Speciality("Renewable Energies in Mechanics (Master)"));

        }
        else if (departmentName.contains("Mechanical Engineering")) {
            list.add(new Speciality("Mechanical Construction (License)"));
            list.add(new Speciality("Energetics (License)"));
            list.add(new Speciality("Materials Engineering (License)"));
            list.add(new Speciality("Mechanical Construction (Master)"));
            list.add(new Speciality("Energetics (Master)"));
            list.add(new Speciality("Mechanical Manufacturing and Productivity (Master)"));
            list.add(new Speciality("Materials Engineering (Master)"));
            list.add(new Speciality("Energetic Installations and Turbomachinery (Master)"));
            list.add(new Speciality("Boiler and Piping Works (Master)"));
            list.add(new Speciality("Metallic and Boiler Works (Master)"));

        } else if (departmentName.contains("Energetics")) {
            list.add(new Speciality("Energetics (License)"));
            list.add(new Speciality("Climate Engineering (License)"));
            list.add(new Speciality("Energetics (Master)"));
            list.add(new Speciality("Energetic Installations and Turbomachinery (Master)"));
            list.add(new Speciality("Renewable Energies in Mechanics (Master)"));

        }
        else if (departmentName.contains("Industrial Maintenance")) {
            list.add(new Speciality("Industrial Maintenance (License)"));
            list.add(new Speciality("Electromechanics (License)"));
            list.add(new Speciality("Industrial Maintenance (Master)"));
            list.add(new Speciality("Electromechanics (Master)"));
            list.add(new Speciality("Mechatronics (Master)"));

        } else if (departmentName.contains("Materials Science and Engineering")) {
            list.add(new Speciality("Materials Engineering (License)"));
            list.add(new Speciality("Materials Engineering (Master)"));
            list.add(new Speciality("Materials Process Engineering (Master)"));

        }else if (departmentName.contains("Civil Engineering")) {
            list.add(new Speciality("Civil Engineering (License)"));
            list.add(new Speciality("Geotechnics (Master)"));
            list.add(new Speciality("Civil Engineering Materials (Master)"));
            list.add(new Speciality("Structures (Master)"));
            list.add(new Speciality("Structures and Construction (Master)"));
        }
        else if (departmentName.contains("Departement of Earthquake Engineering, Geophysics, and Random Phenomena")) {
            list.add(new Speciality("Seismic Geophysics (License)"));
            list.add(new Speciality("Petroleum Geophysics (Master)"));

        }
        else if (departmentName.contains("Departement of Mining and Petroleum Deposits")) {
            list.add(new Speciality("Mineral and Energy Resources (License)"));
            list.add(new Speciality("Petroleum Geology (Master)"));

        }
        else if (departmentName.contains("Departement of Hydrocarbon Transportation and Equipment")) {
            list.add(new Speciality("Transport of Hydrocarbons (License)"));
            list.add(new Speciality("Mechanics of Petrochemical Units (License)"));
            list.add(new Speciality("Mechanics of Oil Field Sites (License)"));
            list.add(new Speciality("Transport and Distribution of Hydrocarbons (Master)"));
            list.add(new Speciality("Mechanics of Petrochemical Units (Master)"));
            list.add(new Speciality("Mechanics of Oil Field Sites (Master)"));

        }
        else if (departmentName.contains("Departement of Chemical and Pharmaceutical Process Engineering")) {
            list.add(new Speciality("Technologies and Treatment of Oil and Gas (License)"));
            list.add(new Speciality("Refining (Master)"));
            list.add(new Speciality("Petrochemistry Technology (Master)"));
            list.add(new Speciality("Instrumentation in Petrochemical Industry (Master)"));

        }
        else if (departmentName.contains("Departement of Process Automation and Electrification")) {
            list.add(new Speciality("Automatic Control (License)"));
            list.add(new Speciality("Industrial Electricity (License)"));
            list.add(new Speciality("Automatic Control (Master)"));
            list.add(new Speciality("Industrial Electricity (Master)"));

        }
        else if (departmentName.contains("Departement of Hydrocarbon Economics and Marketing")) {
            list.add(new Speciality("Petroleum Economy (License)"));
            list.add(new Speciality("Hydrocarbon Economics (Master)"));

        }
        else if (departmentName.contains("Departement of Public Law")) {
            list.add(new Speciality("Public Law (License)"));
            list.add(new Speciality("Public Law (Master)"));

        }
        else if (departmentName.contains("Departement of Private Law")) {
            list.add(new Speciality("Private Law (License)"));
            list.add(new Speciality("Private Law (Master)"));
            list.add(new Speciality("Business Law (Master)"));

        }
        else if (departmentName.contains("Departement of Political Science")) {
            list.add(new Speciality("International Relations (License)"));
            list.add(new Speciality("Political and Administrative Organizations (License)"));
            list.add(new Speciality("Local Administration (Master)"));
            list.add(new Speciality("International Cooperation (Master)"));

        }
        else if (departmentName.contains("Department of Management Sciences")) {
            list.add(new Speciality("Entrepreneurship (License)"));
            list.add(new Speciality("Management (License)"));
            list.add(new Speciality("Financial Management (License)"));
            list.add(new Speciality("Management (Master)"));
            list.add(new Speciality("Public Management (Master)"));
            list.add(new Speciality("Financial Management (Master)"));

        }
        else if (departmentName.contains("Department of Commercial Sciences")) {
            list.add(new Speciality("Marketing (License)"));
            list.add(new Speciality("Marketing of Services (License)"));
            list.add(new Speciality("International Trade and Logistics (License)"));
            list.add(new Speciality("Finance and International Trade (Master)"));
            list.add(new Speciality("Marketing of Services (Master)"));
            list.add(new Speciality("Hotel and Tourism Marketing (Master)"));

        }
        else if (departmentName.contains("Department of Economic Sciences")) {
            list.add(new Speciality("Quantitative Economics (License)"));
            list.add(new Speciality("Monetary and Banking Economics (License)"));
            list.add(new Speciality("Economics and Business Management (License)"));
            list.add(new Speciality("Insurance Economics (Master)"));
            list.add(new Speciality("Quantitative Economics (Master)"));
            list.add(new Speciality("International Economics (Master)"));
            list.add(new Speciality("Economics and Business Management (Master)"));

        }
        else if (departmentName.contains("Department of Finance and Accounting")) {
            list.add(new Speciality("Accounting and Finance (License)"));
            list.add(new Speciality("Accounting and Taxation (License)"));
            list.add(new Speciality("Bank and Insurance Finance (License)"));
            list.add(new Speciality("Accounting and Audit (Master)"));
            list.add(new Speciality("Accounting and Advanced Taxation (Master)"));
            list.add(new Speciality("Finance and Insurance (Master)"));
            list.add(new Speciality("Finance and Banking (Master)"));

        }
        else if (departmentName.contains("Department of Arabic Literature")) {
            list.add(new Speciality("Arabic Literature (License)"));
            list.add(new Speciality("General Linguistics (License)"));
            list.add(new Speciality("Arabic Literature (Master)"));
            list.add(new Speciality("General Linguistics (Master)"));

        }
        else if (departmentName.contains("Department of English language")) {
            list.add(new Speciality("English Language (License)"));
            list.add(new Speciality("English Language (Master)"));

        }
        else if (departmentName.contains("Department of French language")) {
            list.add(new Speciality("French Language (License)"));
            list.add(new Speciality("French Language (Master)"));

        }
        else if (departmentName.contains("Department of Automation and Electrical Engineering")){
            list.add(new Speciality("Automation (Master)"));
        }
        else if (departmentName.contains("Departement of Basic Education")){
            list.add(new Speciality("English"));
            list.add(new Speciality("Algebra and Number Theory"));
            list.add(new Speciality("Arabic-English-Arabic Translation"));
            list.add(new Speciality("Mathematics"));
            list.add(new Speciality("Process Engineering"));
            list.add(new Speciality("Arabic-French-Arabic Translation"));
            list.add(new Speciality("Applied Organic Chemistry"));
        }
        else if (departmentName.contains("Departement of Electronics")){
            list.add(new Speciality("Electrical and Electronic Engineering (License"));
            list.add(new Speciality("Master in Telecommunications (Master)"));
        }
        else if (departmentName.contains("Department of MMQ(Mesures, Metrology & quality)")){
            list.add(new Speciality("Measurements, Metrology and Quality (License)"));
            list.add(new Speciality("Telecommunications (Master)"));
            list.add(new Speciality("Electrical Engineering (Master)"));
        }

        else{
            list.add(new Speciality("no speciality found!!"));
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