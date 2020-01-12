package com.rosolowski.oskar.cityguide.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rosolowski.oskar.cityguide.R;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);
        getSupportFragmentManager()
                .beginTransaction()
//                .replace(R.id.category_container, new )
        .commit();
    }
}
