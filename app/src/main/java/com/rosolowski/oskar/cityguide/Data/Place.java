package com.rosolowski.oskar.cityguide.Data;

import androidx.annotation.NonNull;

public class Place {
    public enum Type {
        RESTAURANT, MONUMENT, NATURERESERVE, OTHER
    }

    private static final int NO_RESOURCE = -1;

    private int nameTranslationId;
    private int descriptionTranslationId = NO_RESOURCE;
    private Type type;
    private String location;
    private int imageResourceId;

    public Place(int nameTranslationId, int descriptionTranslationId, Type type, String location, int imageResourceId) {
        this.nameTranslationId = nameTranslationId;
        this.descriptionTranslationId = descriptionTranslationId;
        this.type = type;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public Place(int nameTranslationId, Type type, String location, int imageResourceId) {
        this.nameTranslationId = nameTranslationId;
        this.type = type;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public int getNameTranslationId() {
        return nameTranslationId;
    }

    public int getDescriptionTranslationId() { return descriptionTranslationId; }

    public Type getType() {
        return type;
    }

    public String getLocation() { return location; }

    public int getImageResourceId() { return imageResourceId; }

    public boolean hassDesc() { return descriptionTranslationId != NO_RESOURCE; }

    @NonNull
    @Override
    public String toString() {
        return "Place - " + nameTranslationId;
    }
}
