package com.example.mangamaster;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.mangamaster.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());


        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {

            if (destination.getId() == R.id.loginFragment || destination.getId() == R.id.singupFragment || destination.getId() == R.id.outlookFragment
            || destination.getId() == R.id.facebookFragment|| destination.getId() == R.id.googleFragment) {
                binding.bottomNavView.setVisibility(View.GONE);
            } else {
                binding.bottomNavView.setVisibility(View.VISIBLE);
            }

        });
    }
}