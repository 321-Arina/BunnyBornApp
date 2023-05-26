package com.example.bunnybornapp.NewsActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

import com.example.bunnybornapp.FaceActivity;
import com.example.bunnybornapp.FotozoneActivity;
import com.example.bunnybornapp.HomeActivity;
import com.example.bunnybornapp.LikesActivity;
import com.example.bunnybornapp.R;
import com.example.bunnybornapp.SearchActivity;
import com.example.bunnybornapp.SettingsActivity;
import com.example.bunnybornapp.StashActivity;
import com.example.bunnybornapp.UserActivity;

public class News03 extends AppCompatActivity {

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
        setContentView(R.layout.activity_news03);

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
            if (butHome.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
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
            if (butSettings.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }

        }
    };
}
