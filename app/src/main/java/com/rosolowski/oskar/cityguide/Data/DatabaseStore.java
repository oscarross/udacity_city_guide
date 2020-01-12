package com.rosolowski.oskar.cityguide.Data;

import com.rosolowski.oskar.cityguide.R;

import java.util.ArrayList;

public class DatabaseStore {
    public ArrayList<Place.Type> getCategories() {
        final ArrayList<Place.Type> categories = new ArrayList<>();
        categories.add(Place.Type.MONUMENT);
        categories.add(Place.Type.NATURERESERVE);
        categories.add(Place.Type.RESTAURANT);
        categories.add(Place.Type.OTHER);

        return categories;
    }

    public ArrayList<Place> getPlacesForType(Place.Type type) {
        switch (type) {
            case NATURERESERVE: return mockNatureReserves();
            case OTHER: return mockOtherInterestingPlaces();
            case RESTAURANT: return mockRestaurants();
            case MONUMENT: return mockMonuments();
        }

        return null;
    }

    private ArrayList<Place> mockRestaurants() {
        final ArrayList<Place> places = new ArrayList<>();
//        places.add(new Place("Żółty Słoń", "description", Place.Type.RESTAURANT, "location"));

        return places;
    }

    private ArrayList<Place> mockMonuments() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.castle_name, R.string.castle_desc, Place.Type.MONUMENT, "Chęciny", R.drawable.checiny));
        places.add(new Place(R.string.bishops_palace_name, R.string.bishops_palace_desc, Place.Type.MONUMENT, "Kielce", R.drawable.palac_biskupow_krakowskich));

        return places;
    }

    private ArrayList<Place> mockOtherInterestingPlaces() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.wietrznia_name, R.string.wietrznia_desc, Place.Type.OTHER, "Wietrznia", R.drawable.geoeducation));

        return places;
    }

    private ArrayList<Place> mockNatureReserves() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.kadzielnia_name, R.string.kadzielnia_desc, Place.Type.NATURERESERVE, "Kielce", R.drawable.kadzielnia));
        places.add(new Place(R.string.karczowka_name, R.string.karczowka_desc, Place.Type.NATURERESERVE, "Kielce", R.drawable.karczowka));
        places.add(new Place(R.string.paradise_cave_name, R.string.paradise_cave_desc, Place.Type.NATURERESERVE, "Kielce", R.drawable.paradise_cave));
        places.add(new Place(R.string.slichowice_name, R.string.slichowice_desc, Place.Type.NATURERESERVE, "Kielce", R.drawable.slichowice));
        places.add(new Place(R.string.sufraganiec_name, R.string.sufraganiec_desc, Place.Type.NATURERESERVE, "Kielce", R.drawable.sufraganiec));

        return places;
    }
}
