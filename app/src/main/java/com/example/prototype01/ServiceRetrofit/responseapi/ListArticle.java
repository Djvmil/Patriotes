package com.example.prototype01.ServiceRetrofit.responseapi;

import com.example.prototype01.model.Article;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListArticle {
    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("article")
    @Expose
    private ArrayList<Article> articles;

    public ListArticle(Boolean error, ArrayList<Article> articles) {
        this.error = error;
        this.articles = articles;
    }
}
