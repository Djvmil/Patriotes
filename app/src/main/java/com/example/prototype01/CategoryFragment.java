package com.example.prototype01;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prototype01.ServiceRetrofit.datamanager.MyApi;
import com.example.prototype01.ServiceRetrofit.responseapi.ApiUtils;
import com.example.prototype01.model.Article;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    private MyApi myApi;
    public static List<Article> listArticle;
    private RecyclerViewAdapterArticle myAdapter;
    private RecyclerView myrv;
    List<Article> list;
    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);


        listArticle = new ArrayList<>();
        Article article = new Article();
        article.setTitre("teste teste 1");
        article.setImage_url(R.drawable.contact_bg);
        listArticle.add(article);

        Article article1 = new Article();
        article1.setTitre("teste teste 2");
        article1.setImage_url(R.drawable.logo_patriote);
        listArticle.add(article1);

        Article article2 = new Article();
        article2.setTitre("teste teste 3");
        article2.setImage_url(R.drawable.home_bg_slideshow3);
        listArticle.add(article2);

        Article article3 = new Article();
        article3.setTitre("teste teste 4");
        article3.setImage_url(R.drawable.ic_launcher_foreground);
        listArticle.add(article3);

        Article article4 = new Article();
        article4.setTitre("teste teste 5");
        article4.setImage_url(R.drawable.ic_menu_gallery);
        listArticle.add(article4);

        Article article5 = new Article();
        article5.setTitre("teste teste 6");
        article5.setImage_url(R.drawable.ic_launcher_background);
        listArticle.add(article5);

        myrv =  view.findViewById(R.id.container_recycler_view_category);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),1));
        RecyclerViewAdapterArticle myAdapter = new RecyclerViewAdapterArticle(getContext(), listArticle);
        myrv.setLayoutManager( new GridLayoutManager(getContext(),1));
        myrv.setAdapter(myAdapter);


        return  view;
    }



}
