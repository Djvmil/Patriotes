package com.example.prototype01;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prototype01.ServiceRetrofit.datamanager.MyApi;
import com.example.prototype01.model.Article;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private MyApi myApi;
    public static List<Article> listArticle;
    private RecyclerViewAdapterArticle myAdapter;
    private RecyclerView myrv;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        listArticle = new ArrayList<>();

        listArticle.add(new Article("ACCÈS À L’EAU POTABLE : LE DG DE LA SONES RASSURE LES POPULATIONS DU GANDIOL",
                "Le directeur général de la Société nationale des eaux du Sénégal (SONES), Charles Fall, a rassuré lundi les populations de Gandiol, Mouit, Mboumbaye et Deggou Niaye, quant à leur accès à l’eau potable selon les normes de l’Organisation mondiale du commerce (OMS), d’ici aux mois d’avril et mai prochains.\n" +
                        "Grâce à un raccordement à la conduite de Ndiock Sall, ces populations du Gandiol, longtemps confrontées à un problème de disponibilité de cette denrée, verront ainsi le bout du tunnel, grâce aux dispositions prises dans le cadre des projets structurants de l’Etat.\n" +
                        "Le patron de la SONES a donné ces assurances lors d’une tournée destinée à s’enquérir de l’état d’exécution des travaux sur l’axe Ndiock Sall-Gandiol, initiés par le gouvernement dans le cadre du programme de renforcement de l’alimentation en eau potable du département de Saint-Louis.",
                R.drawable.eau_potable));

        listArticle.add(new Article("Rwanda: polémique après les aveux de Kagame sur l’assassinat d’un opposant","Nouvelle polémique autour de propos du président Paul Kagame. Au cours de la traditionnelle retraite annuelle du gouvernement, le chef de l’État rwandais a, à nouveau, évoqué l’assassinat d’un de ses opposants. Il s’agit cette fois de Seth Sendashonga. Pour le chef de l’État rwandais, l’ancien ministre de l’Intérieur a",
                R.drawable.kagame));


        listArticle.add(new Article("Crash du 737 en Ethiopie: les boîtes noires envoyées en Europe pour analyse",
                "Les boîtes noires du Boeing 737 MAX qui s’est éffondré dimanche en Ethiopie vont être envoyées en Europe, a annoncé ce mercredi 13 mars 2019 un porte-parole de la compagnie aérienne Ethiopian Airlines. Le but est de déterminer les causes de l’accident, qui a fait 157 morts, alors que le",
                R.drawable.ethiopian_airline));
        listArticle.add(new Article("Meurtre de Lala Camara à Manchester: Les conditions d’une mort atroce",
                "Du nouveau sur le meurtre de Lala Camara, la Sénégalo-italienne retrouvée morte dimanche dernier par son co-locataire dans un appartement à Manchester. Selon des témoignages de sa mère,  la défunte a été battue à mort, les mains ligotées dans le dos… En effet, a ajouté sa maman, la dame est",
                R.drawable.lala_kamara));
        listArticle.add(new Article("teste teste 5","teste teste 5",R.drawable.ic_menu_gallery));
        listArticle.add(new Article("teste teste 6","teste teste 6",R.drawable.contact_bg));
        listArticle.add(new Article("teste teste 7","teste teste 7",R.drawable.ic_launcher_background));


        myrv =  view.findViewById(R.id.container_recycler_view_home);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),1));
        RecyclerViewAdapterArticle myAdapter = new RecyclerViewAdapterArticle(getContext(), listArticle);
        myrv.setLayoutManager( new GridLayoutManager(getContext(),1));
        myrv.setAdapter(myAdapter);

        return view;
    }

}
