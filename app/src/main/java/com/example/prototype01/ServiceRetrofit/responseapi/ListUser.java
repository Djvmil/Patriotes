package com.example.prototype01.ServiceRetrofit.responseapi;

import com.example.prototype01.model.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListUser {

    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("users")
    @Expose
    private ArrayList<User> users;

    public ListUser() {
    }

    public ListUser(Boolean error, ArrayList<User> users) {
        this.error = error;
        this.users = users;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
