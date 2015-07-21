package com.shannonmckenzie.mediaguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class FavoritesFragment extends Fragment {

    public FavoritesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<String> dummyFavorites = new ArrayList<>();
        dummyFavorites.add("Roku");
        dummyFavorites.add("Amazon");
        dummyFavorites.add("Making Stuff");
        dummyFavorites.add("Batman: The Brave and the Bold");
        dummyFavorites.add("Jake the Pirate");
        dummyFavorites.add("Inspector Gadget");

        ArrayAdapter<String> favoritesAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_favorites, R.id.list_item_favorites_textview, dummyFavorites);
        View rootView = inflater.inflate(R.layout.fragment_favorites, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_favorites);
        listView.setAdapter(favoritesAdapter);

        return rootView;
    }
}
