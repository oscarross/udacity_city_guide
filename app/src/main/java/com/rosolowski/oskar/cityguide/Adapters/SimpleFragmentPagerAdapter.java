package com.rosolowski.oskar.cityguide.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rosolowski.oskar.cityguide.Data.DatabaseStore;
import com.rosolowski.oskar.cityguide.Data.Place;
import com.rosolowski.oskar.cityguide.Views.MonumentsFragment;
import com.rosolowski.oskar.cityguide.Views.NatureReservesFragment;
import com.rosolowski.oskar.cityguide.Views.OtherPlacesFragment;
import com.rosolowski.oskar.cityguide.Views.RestaurantsFragment;

import java.util.ArrayList;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Place.Type> categories;

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

        this.categories = new DatabaseStore().getCategories();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Place.Type category = categories.get(position);

        switch (category) {
            case NATURERESERVE: return new NatureReservesFragment();
            case OTHER: return new OtherPlacesFragment();
            case RESTAURANT: return new RestaurantsFragment();
            case MONUMENT: return new MonumentsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Place.Type category = categories.get(position);

        switch (category) { //TODO: get from strings
            case NATURERESERVE: return "Nature";
            case OTHER: return "Other";
            case RESTAURANT: return "Restaurants";
            case MONUMENT: return "Monuments";
        }

        return null;
    }
}
