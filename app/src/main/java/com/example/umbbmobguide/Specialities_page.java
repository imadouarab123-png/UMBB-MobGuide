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
        setContentView(R.layout.activity_specialities_page);

        // getting department name from intent
        String departmentName = getIntent().getStringExtra("name");
        if (departmentName == null) departmentName = "";

        TextView txtDepartment = findViewById(R.id.txtDepartment);
        txtDepartment.setText(departmentName);

        ListView listView = findViewById(R.id.listSpecialities);
        ArrayList<Speciality> list = new ArrayList<>();


        //conditions for every department by its name
        if (departmentName.equals(getString(R.string.dept_cs))) {
            list.add(new Speciality(getString(R.string.spec_is_license)));
            list.add(new Speciality(getString(R.string.spec_web_license)));
            list.add(new Speciality(getString(R.string.spec_soft_master)));
            list.add(new Speciality(getString(R.string.spec_ai_master)));

        } else if (departmentName.equals(getString(R.string.dept_maths))) {
            list.add(new Speciality(getString(R.string.spec_math_license)));
            list.add(new Speciality(getString(R.string.spec_math_app_license)));
            list.add(new Speciality(getString(R.string.spec_data_license)));
            list.add(new Speciality(getString(R.string.spec_math_ana_master)));
            list.add(new Speciality(getString(R.string.spec_math_fin_master)));
            list.add(new Speciality(getString(R.string.spec_stoch_master)));
            list.add(new Speciality(getString(R.string.spec_opt_master)));

        } else if (departmentName.equals(getString(R.string.dept_physics))) {
            list.add(new Speciality(getString(R.string.spec_phys_mat_license)));
            list.add(new Speciality(getString(R.string.spec_phys_rad_license)));
            list.add(new Speciality(getString(R.string.spec_phys_en_license)));
            list.add(new Speciality(getString(R.string.spec_phys_fun_license)));
            list.add(new Speciality(getString(R.string.spec_phys_mat_master)));
            list.add(new Speciality(getString(R.string.spec_phys_en_ren_master)));
            list.add(new Speciality(getString(R.string.spec_phys_med_master)));
            list.add(new Speciality(getString(R.string.spec_phys_rad_master)));

        } else if (departmentName.equals(getString(R.string.dept_chemistry))) {
            list.add(new Speciality(getString(R.string.spec_chem_mat_license)));
            list.add(new Speciality(getString(R.string.spec_chem_org_license)));
            list.add(new Speciality(getString(R.string.spec_chem_ana_license)));
            list.add(new Speciality(getString(R.string.spec_chem_mat_master)));
            list.add(new Speciality(getString(R.string.spec_chem_pharm_master)));
            list.add(new Speciality(getString(R.string.spec_chem_env_master)));
            list.add(new Speciality(getString(R.string.spec_chem_ana_master)));
            list.add(new Speciality(getString(R.string.spec_chem_org_master)));

        } else if (departmentName.equals(getString(R.string.dept_biology))) {
            list.add(new Speciality(getString(R.string.spec_bio_health_license)));
            list.add(new Speciality(getString(R.string.spec_bio_micro_license)));
            list.add(new Speciality(getString(R.string.spec_bio_plant_license)));
            list.add(new Speciality(getString(R.string.spec_bio_food_license)));
            list.add(new Speciality(getString(R.string.spec_bio_chem_license)));
            list.add(new Speciality(getString(R.string.spec_bio_org_license)));
            list.add(new Speciality(getString(R.string.spec_bio_anim_license)));
            list.add(new Speciality(getString(R.string.spec_bio_mol_license)));
            list.add(new Speciality(getString(R.string.spec_bio_eco_license)));
            list.add(new Speciality(getString(R.string.spec_bio_mol_path_master)));
            list.add(new Speciality(getString(R.string.spec_bio_micro_master)));
            list.add(new Speciality(getString(R.string.spec_bio_plant_master)));
            list.add(new Speciality(getString(R.string.spec_bio_nutri_master)));
            list.add(new Speciality(getString(R.string.spec_bio_app_chem_master)));
            list.add(new Speciality(getString(R.string.spec_bio_pop_master)));
            list.add(new Speciality(getString(R.string.spec_bio_genet_master)));
            list.add(new Speciality(getString(R.string.spec_bio_cell_phys_master)));
            list.add(new Speciality(getString(R.string.spec_bio_mol_cell_master)));
            list.add(new Speciality(getString(R.string.spec_bio_biodiv_master)));
            list.add(new Speciality(getString(R.string.spec_bio_micro_eco_master)));

        } else if (departmentName.equals(getString(R.string.dept_agronomy))) {
            list.add(new Speciality(getString(R.string.spec_agri_prot_license)));
            list.add(new Speciality(getString(R.string.spec_agri_prod_license)));
            list.add(new Speciality(getString(R.string.spec_agri_anim_license)));
            list.add(new Speciality(getString(R.string.spec_agri_phytopharm_master)));
            list.add(new Speciality(getString(R.string.spec_agri_anim_nutri_master)));
            list.add(new Speciality(getString(R.string.spec_agri_crop_master)));
            list.add(new Speciality(getString(R.string.spec_agri_phytopath_master)));

        } else if (departmentName.equals(getString(R.string.dept_sports))) {
            list.add(new Speciality(getString(R.string.spec_staps_edu_license)));
            list.add(new Speciality(getString(R.string.spec_staps_train_license)));
            list.add(new Speciality(getString(R.string.spec_staps_phys_master)));
            list.add(new Speciality(getString(R.string.spec_staps_elite_master)));

        } else if (departmentName.equals(getString(R.string.dept_industrial_process))) {
            list.add(new Speciality(getString(R.string.spec_eng_process_license)));
            list.add(new Speciality(getString(R.string.spec_eng_food_master)));
            list.add(new Speciality(getString(R.string.spec_eng_chem_master)));
            list.add(new Speciality(getString(R.string.spec_eng_poly_master)));
            list.add(new Speciality(getString(R.string.spec_eng_mat_master)));

        } else if (departmentName.equals(getString(R.string.dept_food_tech))) {
            list.add(new Speciality(getString(R.string.spec_eng_process_license)));
            list.add(new Speciality(getString(R.string.spec_eng_food_master)));

        } else if (departmentName.equals(getString(R.string.dept_env_eng))) {
            list.add(new Speciality(getString(R.string.spec_env_clim_license)));
            list.add(new Speciality(getString(R.string.spec_env_health_license)));
            list.add(new Speciality(getString(R.string.spec_env_eng_master)));
            list.add(new Speciality(getString(R.string.spec_env_proc_master)));
            list.add(new Speciality(getString(R.string.spec_env_water_master)));
            list.add(new Speciality(getString(R.string.spec_env_ren_mech_master)));

        } else if (departmentName.equals(getString(R.string.dept_mech_eng))) {
            list.add(new Speciality(getString(R.string.spec_mech_const_license)));
            list.add(new Speciality(getString(R.string.spec_mech_en_license)));
            list.add(new Speciality(getString(R.string.spec_mech_mat_license)));
            list.add(new Speciality(getString(R.string.spec_mech_const_master)));
            list.add(new Speciality(getString(R.string.spec_mech_en_master)));
            list.add(new Speciality(getString(R.string.spec_mech_manuf_master)));
            list.add(new Speciality(getString(R.string.spec_mech_mat_master)));
            list.add(new Speciality(getString(R.string.spec_mech_turb_master)));
            list.add(new Speciality(getString(R.string.spec_mech_boiler_master)));
            list.add(new Speciality(getString(R.string.spec_mech_metallic_master)));

        } else if (departmentName.equals(getString(R.string.dept_energetics))) {
            list.add(new Speciality(getString(R.string.spec_mech_en_license)));
            list.add(new Speciality(getString(R.string.spec_env_clim_license)));
            list.add(new Speciality(getString(R.string.spec_mech_en_master)));
            list.add(new Speciality(getString(R.string.spec_mech_turb_master)));
            list.add(new Speciality(getString(R.string.spec_env_ren_mech_master)));

        } else if (departmentName.equals(getString(R.string.dept_maintenance))) {
            list.add(new Speciality(getString(R.string.spec_main_ind_license)));
            list.add(new Speciality(getString(R.string.spec_main_elec_license)));
            list.add(new Speciality(getString(R.string.spec_main_ind_master)));
            list.add(new Speciality(getString(R.string.spec_main_elec_master)));
            list.add(new Speciality(getString(R.string.spec_main_mecha_master)));

        } else if (departmentName.equals(getString(R.string.dept_materials))) {
            list.add(new Speciality(getString(R.string.spec_mech_mat_license)));
            list.add(new Speciality(getString(R.string.spec_mech_mat_master)));
            list.add(new Speciality(getString(R.string.spec_eng_mat_master)));

        } else if (departmentName.equals(getString(R.string.dept_civil_eng))) {
            list.add(new Speciality(getString(R.string.spec_civil_license)));
            list.add(new Speciality(getString(R.string.spec_civil_geo_master)));
            list.add(new Speciality(getString(R.string.spec_civil_mat_master)));
            list.add(new Speciality(getString(R.string.spec_civil_struct_master)));
            list.add(new Speciality(getString(R.string.spec_civil_struct_const_master)));

        } else if (departmentName.equals(getString(R.string.dept_earthquake))) {
            list.add(new Speciality(getString(R.string.spec_hydro_seismic_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_petro_master)));

        } else if (departmentName.equals(getString(R.string.dept_mining))) {
            list.add(new Speciality(getString(R.string.spec_hydro_mineral_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_geol_master)));

        } else if (departmentName.equals(getString(R.string.dept_transport))) {
            list.add(new Speciality(getString(R.string.spec_hydro_trans_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_mech_petro_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_mech_field_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_trans_dist_master)));
            list.add(new Speciality(getString(R.string.spec_hydro_mech_petro_master)));
            list.add(new Speciality(getString(R.string.spec_hydro_mech_field_master)));

        } else if (departmentName.equals(getString(R.string.dept_chem_pharm))) {
            list.add(new Speciality(getString(R.string.spec_hydro_treat_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_refining_master)));
            list.add(new Speciality(getString(R.string.spec_hydro_petro_tech_master)));
            list.add(new Speciality(getString(R.string.spec_hydro_instr_master)));

        } else if (departmentName.equals(getString(R.string.dept_automation))) {
            list.add(new Speciality(getString(R.string.spec_hydro_auto_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_elec_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_auto_master)));
            list.add(new Speciality(getString(R.string.spec_hydro_elec_master)));

        } else if (departmentName.equals(getString(R.string.dept_econ_marketing))) {
            list.add(new Speciality(getString(R.string.spec_hydro_econ_license)));
            list.add(new Speciality(getString(R.string.spec_hydro_econ_master)));

        } else if (departmentName.equals(getString(R.string.dept_public_law))) {
            list.add(new Speciality(getString(R.string.spec_law_pub_license)));
            list.add(new Speciality(getString(R.string.spec_law_pub_master)));

        } else if (departmentName.equals(getString(R.string.dept_private_law))) {
            list.add(new Speciality(getString(R.string.spec_law_priv_license)));
            list.add(new Speciality(getString(R.string.spec_law_priv_master)));
            list.add(new Speciality(getString(R.string.spec_law_biz_master)));

        } else if (departmentName.equals(getString(R.string.dept_political_science))) {
            list.add(new Speciality(getString(R.string.spec_law_ir_license)));
            list.add(new Speciality(getString(R.string.spec_law_org_license)));
            list.add(new Speciality(getString(R.string.spec_law_admin_master)));
            list.add(new Speciality(getString(R.string.spec_law_coop_master)));

        } else if (departmentName.equals(getString(R.string.dept_management))) {
            list.add(new Speciality(getString(R.string.spec_econ_entrep_license)));
            list.add(new Speciality(getString(R.string.spec_econ_mgmt_license)));
            list.add(new Speciality(getString(R.string.spec_econ_fin_mgmt_license)));
            list.add(new Speciality(getString(R.string.spec_econ_mgmt_master)));
            list.add(new Speciality(getString(R.string.spec_econ_pub_mgmt_master)));
            list.add(new Speciality(getString(R.string.spec_econ_fin_mgmt_master)));

        } else if (departmentName.equals(getString(R.string.dept_commercial))) {
            list.add(new Speciality(getString(R.string.spec_econ_mark_license)));
            list.add(new Speciality(getString(R.string.spec_econ_mark_serv_license)));
            list.add(new Speciality(getString(R.string.spec_econ_trade_license)));
            list.add(new Speciality(getString(R.string.spec_econ_fin_trade_master)));
            list.add(new Speciality(getString(R.string.spec_econ_mark_serv_master)));
            list.add(new Speciality(getString(R.string.spec_econ_hotel_master)));

        } else if (departmentName.equals(getString(R.string.dept_econ_sci))) {
            list.add(new Speciality(getString(R.string.spec_econ_quant_license)));
            list.add(new Speciality(getString(R.string.spec_econ_bank_license)));
            list.add(new Speciality(getString(R.string.spec_econ_biz_license)));
            list.add(new Speciality(getString(R.string.spec_econ_insur_master)));
            list.add(new Speciality(getString(R.string.spec_econ_quant_master)));
            list.add(new Speciality(getString(R.string.spec_econ_inter_master)));
            list.add(new Speciality(getString(R.string.spec_econ_biz_master)));

        } else if (departmentName.equals(getString(R.string.dept_finance))) {
            list.add(new Speciality(getString(R.string.spec_econ_acc_fin_license)));
            list.add(new Speciality(getString(R.string.spec_econ_acc_tax_license)));
            list.add(new Speciality(getString(R.string.spec_econ_bank_insur_license)));
            list.add(new Speciality(getString(R.string.spec_econ_acc_audit_master)));
            list.add(new Speciality(getString(R.string.spec_econ_acc_tax_master)));
            list.add(new Speciality(getString(R.string.spec_econ_fin_insur_master)));
            list.add(new Speciality(getString(R.string.spec_econ_fin_bank_master)));

        } else if (departmentName.equals(getString(R.string.dept_arabic_lit))) {
            list.add(new Speciality(getString(R.string.spec_lang_arabic_license)));
            list.add(new Speciality(getString(R.string.spec_lang_ling_license)));
            list.add(new Speciality(getString(R.string.spec_lang_arabic_master)));
            list.add(new Speciality(getString(R.string.spec_lang_ling_master)));

        } else if (departmentName.equals(getString(R.string.dept_english))) {
            list.add(new Speciality(getString(R.string.spec_lang_english_license)));
            list.add(new Speciality(getString(R.string.spec_lang_english_master)));

        } else if (departmentName.equals(getString(R.string.dept_french))) {
            list.add(new Speciality(getString(R.string.spec_lang_french_license)));
            list.add(new Speciality(getString(R.string.spec_lang_french_master)));

        } else if (departmentName.equals(getString(R.string.dept_auto_elec))) {
            list.add(new Speciality(getString(R.string.spec_igee_auto_master)));

        } else if (departmentName.equals(getString(R.string.dept_basic_edu))) {
            list.add(new Speciality(getString(R.string.spec_igee_english)));
            list.add(new Speciality(getString(R.string.spec_igee_algebra)));
            list.add(new Speciality(getString(R.string.spec_igee_trans_en)));
            list.add(new Speciality(getString(R.string.spec_igee_math)));
            list.add(new Speciality(getString(R.string.spec_igee_proc_eng)));
            list.add(new Speciality(getString(R.string.spec_igee_trans_fr)));
            list.add(new Speciality(getString(R.string.spec_igee_org_chem)));

        } else if (departmentName.equals(getString(R.string.dept_electronics))) {
            list.add(new Speciality(getString(R.string.spec_igee_elec_license)));
            list.add(new Speciality(getString(R.string.spec_igee_telecom_master)));

        } else if (departmentName.equals(getString(R.string.dept_mmq))) {
            list.add(new Speciality(getString(R.string.spec_ista_mmq_license)));
            list.add(new Speciality(getString(R.string.spec_ista_telecom_master)));
            list.add(new Speciality(getString(R.string.spec_ista_elec_master)));

        } else {
            list.add(new Speciality(getString(R.string.no_spec_found)));
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
