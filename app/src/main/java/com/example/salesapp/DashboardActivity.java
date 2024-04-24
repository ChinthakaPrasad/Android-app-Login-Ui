package com.example.salesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.salesapp.fragments.Fragment_Customer;
import com.example.salesapp.fragments.Fragment_Home;
import com.example.salesapp.fragments.Fragment_Order;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DashboardActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_moving, new Fragment_Home()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.order:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_moving, new Fragment_Order()).commit();
                        return true;

                    case R.id.customer:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_moving, new Fragment_Customer()).commit();
                        return true;

                    case R.id.home:
                          getSupportFragmentManager().beginTransaction().replace(R.id.frame_moving, new Fragment_Home()).commit();
                        return true;
                }
                return true;
            }
        });

    }
}