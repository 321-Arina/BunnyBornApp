package com.example.bunnybornapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Button butZone;
    private Button butStash;
    private Button butFace;
    private ImageButton butHome;
    private ImageButton butSearch;
    private ImageButton butUser;
    private ImageButton butLikes;
    private ImageButton butSettings;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // присваивание id полям
        butZone = findViewById(R.id.butZone);
        butStash = findViewById(R.id.butStash);
        butFace = findViewById(R.id.butFace);
        butHome = findViewById(R.id.butHome);
        butSearch = findViewById(R.id.butSearch);
        butUser = findViewById(R.id.butUser);
        butLikes = findViewById(R.id.butLikes);
        butSettings = findViewById(R.id.butSettings);

        // обработка нажатия кнопки
        butZone.setOnClickListener(listener);
        butStash.setOnClickListener(listener);
        butFace.setOnClickListener(listener);
        butHome.setOnClickListener(listener);
        butSearch.setOnClickListener(listener);
        butUser.setOnClickListener(listener);
        butLikes.setOnClickListener(listener);
        butSettings.setOnClickListener(listener);

    }
    // создание слушателя
    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (butZone.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), FotozoneActivity.class);
                startActivity(intent);
            }
            if (butStash.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), StashActivity.class);
                startActivity(intent);
            }
            if (butFace.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), FaceActivity.class);
                startActivity(intent);
            }
            if (butSearch.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
            if (butUser.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(intent);
            }
            if (butLikes.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), LikesActivity.class);
                startActivity(intent);
            }
            if (butHome.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }

        }
    };
}

