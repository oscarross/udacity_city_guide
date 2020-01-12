package com.rosolowski.oskar.cityguide.Data;

import androidx.annotation.NonNull;

public class Place {
    public enum Type {
        RESTAURANT, MONUMENT, NATURERESERVE, OTHER
    }

    private static final int NO_IMAGE = -1;

    private int nameTranslationId;



    private int descriptionTranslationId;
    private Type type;
    private String location;
    private int imageResourceId = NO_IMAGE;

    public Place(int nameTranslationId, int descriptionTranslationId, Type type, String location, int imageResourceId) {
        this.nameTranslationId = nameTranslationId;
        this.descriptionTranslationId = descriptionTranslationId;
        this.type = type;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public Place(int nameTranslationId, int description, Type type, String location) {
        this.nameTranslationId = nameTranslationId;
        this.descriptionTranslationId = descriptionTranslationId;
        this.type = type;
        this.location = location;
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

    public boolean hassImage() { return imageResourceId != NO_IMAGE; }

    @NonNull
    @Override
    public String toString() {
        return "Place - " + nameTranslationId;
    }
}
