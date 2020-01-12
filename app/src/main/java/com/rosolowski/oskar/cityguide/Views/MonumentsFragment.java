package com.rosolowski.oskar.cityguide.Views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.rosolowski.oskar.cityguide.Adapters.PlacesAdapter;
import com.rosolowski.oskar.cityguide.Data.DatabaseStore;
import com.rosolowski.oskar.cityguide.Data.Place;
import com.rosolowski.oskar.cityguide.R;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {


    private DatabaseStore store;

    public MonumentsFragment() {
        this.store = new DatabaseStore();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = store.getPlacesForType(Place.Type.MONUMENT);
        PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Log.v("Click", "Current place: " + place);
            }
        });

        return rootView;
    }

}
