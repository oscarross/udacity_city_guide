package com.rosolowski.oskar.cityguide.Data;

import androidx.annotation.NonNull;

public class Place {

    public enum Type {
        RESTAURANT, MONUMENT, NATURERESERVE, OTHER
    }

    private String name;
    private Type type;

    public Place(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "Place - " + name;
    }
}
