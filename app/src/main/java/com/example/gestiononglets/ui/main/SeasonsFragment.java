package com.example.gestiononglets.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.gestiononglets.R;

import static android.content.ContentValues.TAG;

public class SeasonsFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    // Ils sont distincts pour chaque SeasonFragment instancié
    private String title;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static SeasonFragment newInstance(int position, String title) {
        Log.d("DEBUG", "newInstance");
        SeasonFragment fragment = new SeasonFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Vérifier si cette méthode est appelée
        Log.d("DEBUG", "onCreate");
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Vérifier si cette méthode est appelée
        Log.d("DEBUG", "onCreateView");
        View view = inflater.inflate(R.layout.fragment_seasons, container, false);
        return view;
    }
}
