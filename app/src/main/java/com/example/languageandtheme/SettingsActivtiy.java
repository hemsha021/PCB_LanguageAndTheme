package com.example.languageandtheme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class SettingsActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_activtiy);

        //Fragment Transaction for settings Container
        getSupportFragmentManager().beginTransaction().replace(R.id.settings_container,new Settings()).commit();
    }

}
