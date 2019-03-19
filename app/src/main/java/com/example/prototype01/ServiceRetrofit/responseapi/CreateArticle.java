package com.example.prototype01.ServiceRetrofit.responseapi;

import com.example.prototype01.model.Article;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateArticle {
    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("article")
    @Expose
    private Article article;

    public CreateArticle() {
    }

    public CreateArticle(Boolean error, Article article) {
        this.error = error;
        this.article = article;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
