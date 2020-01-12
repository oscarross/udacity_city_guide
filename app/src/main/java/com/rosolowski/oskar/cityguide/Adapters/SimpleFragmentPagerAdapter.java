package com.rosolowski.oskar.cityguide.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rosolowski.oskar.cityguide.Data.DatabaseStore;
import com.rosolowski.oskar.cityguide.Data.Place;
import com.rosolowski.oskar.cityguide.R;
import com.rosolowski.oskar.cityguide.Views.MonumentsFragment;
import com.rosolowski.oskar.cityguide.Views.NatureReservesFragment;
import com.rosolowski.oskar.cityguide.Views.OtherPlacesFragment;
import com.rosolowski.oskar.cityguide.Views.RestaurantsFragment;

import java.util.ArrayList;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Place.Type> categories;
    private Context context;

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);

        this.context = context;
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

        switch (category) {
            case NATURERESERVE: return context.getString(R.string.nature_category_title);
            case OTHER: return context.getString(R.string.other_category_title);
            case RESTAURANT: return context.getString(R.string.restaurants_category_title);
            case MONUMENT: return context.getString(R.string.monuments_category_title);
        }

        return null;
    }
}
