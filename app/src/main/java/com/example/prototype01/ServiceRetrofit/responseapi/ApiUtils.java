package com.example.prototype01.ServiceRetrofit.responseapi;


import com.example.prototype01.ServiceRetrofit.RetrofitClient;
import com.example.prototype01.ServiceRetrofit.datamanager.MyApi;

public class ApiUtils {

 
   public static final String BASE_URL = "http://waklytech.alwaysdata.net/Article/MyAPI/";


    private ApiUtils() {
    }

    public static MyApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(MyApi.class);
    }
}
