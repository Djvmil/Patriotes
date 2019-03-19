package com.example.prototype01;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment  {


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        Bundle bundle = this.getArguments();
        TextView textView = view.findViewById(R.id.textA);
        TextView title = view.findViewById(R.id.titleA);
        ImageView imageView = view.findViewById(R.id.imageViewDetail);

        if(bundle!= null)
        {
            String test = bundle.getString("text");
            String titles = bundle.getString("title");
            int url = bundle.getInt("url");
            textView.setText(test);
            title.setText(titles);
            Picasso.with(getContext())
                    .load(url)
                    .placeholder(R.drawable.ic_insert_emoticon_black_24dp)
                    .error(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
                    .into(imageView);
        }





        return view;
    }




}
