package com.example.prototype01.ServiceRetrofit.datamanager;

import com.example.prototype01.ServiceRetrofit.responseapi.ConnectionMail;
import com.example.prototype01.ServiceRetrofit.responseapi.ConnectionUsername;
import com.example.prototype01.ServiceRetrofit.responseapi.CreateArticle;
import com.example.prototype01.ServiceRetrofit.responseapi.CreateUser;
import com.example.prototype01.ServiceRetrofit.responseapi.ListArticle;
import com.example.prototype01.ServiceRetrofit.responseapi.ListUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyApi {
    @GET("v1/Api.php?")
    Call<ListUser> listUser(@Query("apicall") String getUser);

    @GET("v1/Api.php?")
    Call<ListArticle> listAnnonce(@Query("apicall") String getAnnonce);


    @POST("v1/Api.php?")
    @FormUrlEncoded
    Call<CreateUser> createUser(
            @Query("apicall") String createUser,
            @Field("nom") String nom,
            @Field("prenom") String prenom,
            @Field("email") String email,
            @Field("image_url") String image_url,
            @Field("username") String username,
            @Field("password") String password
    );

    @POST("v1/Api.php?")
    @FormUrlEncoded
    Call<CreateArticle> createAnnonce(
            @Query("apicall") String createAnnonce,
            @Field("nomProduit") String nomProduit,
            @Field("description") String description,
            @Field("prix") float prix,
            @Field("image_url") String image_url,
            @Field("idCategorie") int idCategorie,
            @Field("idUser") int idUser
    );

    @POST("v1/Api.php?")
    @FormUrlEncoded
    Call<ConnectionMail> connectionMail(
            @Query("apicall") String connectionMail,
            @Field("email") String email,
            @Field("password") String password
    );

    @POST("v1/Api.php?")
    @FormUrlEncoded
    Call<ConnectionUsername> connectionUsername(
            @Query("apicall") String connectionUsername,
            @Field("username") String username,
            @Field("password") String password
    );

}
