package com.example.bunnybornapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.bunnybornapp.Model.News;
import com.example.bunnybornapp.Model.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private Button butZone;
    private Button butStash;
    private Button butFace;
    private ImageButton butHome;
    private ImageButton butSearch;
    private ImageButton butUser;
    private ImageButton butLikes;
    private ImageButton butSettings;


    // создание коллекции контейнера для данных класса News
    List<News> news = new ArrayList<News>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.newsList);

        // создадим адаптер и загрузим в него контейнер с данными
        NewsAdapter adapter = new NewsAdapter(this, HomeActivity.this, news);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);


    }
    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        news.add( new News("Новогодний фотопроект!", "Новогодний фотопроект для детей от 10 месяцев до 3-х лет...",
                R.drawable.news01));
        news.add( new News("Новогодние предложения!", "К каждой фотоссесии новорождённых, фото в новогоднем образе в подарок...",
                R.drawable.news02));
        news.add( new News("Беспроигрышная лотерея!", "Для всех клиентов этого года доступна лотерея...",
                R.drawable.news03));
        news.add( new News("Горячее предложение!", "Внимание! Ещё можно успеть! Пустое 'окно' в студии 'Дизель', зал 'Wood'...",
                R.drawable.news04));
        news.add( new News("Новинки проката!", "Уважаемые клиенты! Доступно обновление новогоднего реквизита...",
                R.drawable.news05));
        news.add( new News("Скидки!!!", "Для всех новых клиентов действует скидка на первую фотосессию...",
                R.drawable.news06));
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
            if (butSettings.equals(view)) {
                // переключение на новую активность
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }

        }
    };
}
