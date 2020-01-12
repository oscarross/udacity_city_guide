package com.rosolowski.oskar.cityguide.Data;

import java.util.ArrayList;

public class DatabaseStore {
    public ArrayList<Place> getPlacesForType(Place.Type type) {
        switch (type)
        {
            case RESTAURANT:
                return mockRestaurants();
            default:
                return new ArrayList<>();
        }
    }

    private ArrayList<Place> mockRestaurants() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Żółty Słoń", Place.Type.RESTAURANT));

        return places;
    }
}
