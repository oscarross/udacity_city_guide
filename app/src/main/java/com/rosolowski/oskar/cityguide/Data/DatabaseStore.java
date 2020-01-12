package com.rosolowski.oskar.cityguide.Data;

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
        places.add(new Place("Żółty Słoń", "description", Place.Type.RESTAURANT, "location"));

        return places;
    }

    private ArrayList<Place> mockMonuments() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Monument", "desc1", Place.Type.MONUMENT, "location"));

        return places;
    }

    private ArrayList<Place> mockOtherInterestingPlaces() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Other", "desc1", Place.Type.OTHER, "location"));

        return places;
    }

    private ArrayList<Place> mockNatureReserves() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Nature", "desc1", Place.Type.NATURERESERVE, "location"));

        return places;
    }
}
