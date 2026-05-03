package com.example.umbbmobguide;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.res.Resources;

import java.util.Locale;

public class settingPage extends AppCompatActivity {
private RadioGroup radioGrpLanguage;
private RadioButton radioEng, radioAr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_page);

        radioGrpLanguage = findViewById(R.id.radioGroupLanguage);
        radioEng = findViewById(R.id.radioEnglish);
        radioAr = findViewById(R.id.radioArabic);
        String currentLanguage = getResources().getConfiguration().locale.getLanguage();
        if (currentLanguage.equals("ar")) {
            radioAr.setChecked(true);
        } else {
            radioEng.setChecked(true);
        }
        radioGrpLanguage.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioEnglish) {
                changeLanguage("en");
            } else if (checkedId == R.id.radioArabic) {
                changeLanguage("ar");
            }
        });
    }

    public void changeLanguage(String lang) {
        Locale myLocale = new Locale(lang);
        Locale.setDefault(myLocale);
        Configuration config = new Configuration();
        config.locale = myLocale;
        Resources resources = this.getResources();
        resources.updateConfiguration(config, resources.getDisplayMetrics());


        finish();
        // Restart MainActivity to apply language changes

        Intent intent = new Intent(settingPage.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

