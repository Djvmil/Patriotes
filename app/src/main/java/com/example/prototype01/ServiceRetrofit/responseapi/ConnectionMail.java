package com.example.prototype01.ServiceRetrofit.responseapi;

import com.example.prototype01.model.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConnectionMail {

    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("user")
    @Expose
    private User user;


    public ConnectionMail() {

    }

    public ConnectionMail(Boolean error, User user) {
        this.error = error;
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
