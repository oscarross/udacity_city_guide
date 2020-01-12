package com.rosolowski.oskar.cityguide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rosolowski.oskar.cityguide.Data.Place;
import com.rosolowski.oskar.cityguide.R;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Place> {
    public PlacesAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.place_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView titleTextView = (TextView) listView.findViewById(R.id.place_list_item_title);
        titleTextView.setText(currentPlace.getName());

        return listView;
    }
}
