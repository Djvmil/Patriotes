package com.example.prototype01;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prototype01.model.Article;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapterArticle extends RecyclerView.Adapter<RecyclerViewAdapterArticle.MyViewHolder> {


    private Context mContext;
    private List<Article> mData;
    public static final String BASE_URL = "http://waklytech.alwaysdata.net/Annonce/storage/";
    private DetailsFragment detailsFragment;

    public RecyclerViewAdapterArticle(Context mContext, List<Article> mData) {
        this.mContext = mContext;
        this.mData = mData;
        detailsFragment = new DetailsFragment();
    }

    @NonNull
    @Override
    public RecyclerViewAdapterArticle.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_article,viewGroup,false);

        return new RecyclerViewAdapterArticle.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterArticle.MyViewHolder myViewHolder, int i) {

        myViewHolder.titreArticle.setText(mData.get(i).getTitre());
       // Picasso.with(mContext).load(BASE_URL+mData.get(i).getImage_url()).into(myViewHolder.img_annonce);
      //  Picasso.with(mContext).load(mData.get(i).getImage_url()).into(myViewHolder.img_article);
        Picasso.with(mContext)
                .load(mData.get(i).getImage_url())
                .placeholder(R.drawable.ic_insert_emoticon_black_24dp)
                .error(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
                .into(myViewHolder.img_article);
        final String text = mData.get(i).getTexte();
        final String text1 = mData.get(i).getTitre();
        final int url =mData.get(i).getImage_url();

        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Bundle bundle = new Bundle();
                bundle.putString("text",text);
                bundle.putString("title",text1);
                bundle.putInt("url",url);
                MainActivity.detail = true;
                detailsFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = ((FragmentActivity)mContext).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,detailsFragment);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img_article;
        TextView titreArticle;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_article = itemView.findViewById(R.id.img_article);
            titreArticle = itemView.findViewById(R.id.titreArticle);
            cardView = itemView.findViewById(R.id.cardviewArticle);

        }
    }
}
