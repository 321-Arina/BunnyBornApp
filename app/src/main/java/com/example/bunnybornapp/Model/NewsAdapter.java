package com.example.bunnybornapp.Model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bunnybornapp.NewsActivities.News01;
import com.example.bunnybornapp.NewsActivities.News02;
import com.example.bunnybornapp.NewsActivities.News03;
import com.example.bunnybornapp.NewsActivities.News04;
import com.example.bunnybornapp.NewsActivities.News05;
import com.example.bunnybornapp.NewsActivities.News06;
import com.example.bunnybornapp.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<News> newsAd; // поле коллекции контейнера для хранения данных (объектов класса News)
    private final Activity activity;
    private final Context context;


    // конструктор адаптера
    public NewsAdapter(Context context, Activity activity, List<News> newsAd) {
        this.inflater = LayoutInflater.from(context);
        this.newsAd = newsAd;
        this.context = context;
        this.activity = activity;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту News
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_news, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту News по определенной позиции
    @Override
    public void onBindViewHolder(NewsAdapter.ViewHolder holder, int position) {
        News news = newsAd.get(position);
        holder.newsResView.setImageResource(news.getNewsRes());
        holder.nameView.setText(news.getName());
        holder.newsView.setText(news.getNews());

        holder.nLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // задание переключения на новый экран
                if (holder.getAdapterPosition() == 0) {
                    Intent intent = new Intent(context, News01.class);
                    activity.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 1) {
                    Intent intent = new Intent(context, News02.class);
                    activity.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 2) {
                    Intent intent = new Intent(context, News03.class);
                    activity.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 3) {
                    Intent intent = new Intent(context, News04.class);
                    activity.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 4) {
                    Intent intent = new Intent(context, News05.class);
                    activity.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 5) {
                    Intent intent = new Intent(context, News06.class);
                    activity.startActivity(intent);
                }
            }
         });
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return newsAd.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView newsResView;
        final TextView nameView, newsView;
        ConstraintLayout nLayout;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_news.xml
        ViewHolder(@NonNull View view) {
            super(view);
            newsView = view.findViewById(R.id.news);
            nameView = view.findViewById(R.id.name);
            newsResView = view.findViewById(R.id.newsRes);
            nLayout = view.findViewById(R.id.nLayout);
        }
    }
}