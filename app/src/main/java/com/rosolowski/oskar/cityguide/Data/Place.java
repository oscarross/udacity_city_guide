package com.rosolowski.oskar.cityguide.Data;

import androidx.annotation.NonNull;

public class Place {
    public enum Type {
        RESTAURANT, MONUMENT, NATURERESERVE, OTHER
    }

    private static final int NO_IMAGE = -1;

    private String name;
    private String description;
    private Type type;
    private String location;
    private int imageResourceId = NO_IMAGE;

    public Place(String name, String description, Type type, String location, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public Place(String name, String description, Type type, String location) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getLocation() { return location; }

    public int getImageResourceId() { return imageResourceId; }

    public boolean hassImage() { return imageResourceId != NO_IMAGE; }

    @NonNull
    @Override
    public String toString() {
        return "Place - " + name;
    }
}
