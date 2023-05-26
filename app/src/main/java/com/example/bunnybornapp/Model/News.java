package com.example.bunnybornapp.Model;

public class News {

    // поля
    private String name;
    private String news;
    private int newsRes;

    // конструктор
    public News(String name, String news, int newsRes) {
        this.name = name;
        this.news = news;
        this.newsRes = newsRes;
    }
    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getNewsRes() {
        return newsRes;
    }

    public void setNewsRes(int newsRes) {
        this.newsRes = newsRes;
    }
}

