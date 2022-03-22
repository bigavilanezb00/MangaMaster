package com.example.mangamaster;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mangamaster.databinding.FragmentLoginBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;

    NavController navController;
    Button botonLogin;
    Button botonSingup;
    ImageButton googleButton;
    ImageButton facebookButton;
    ImageButton outlookButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentLoginBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        botonSingup = view.findViewById(R.id.botonSingup);
        botonLogin = view.findViewById(R.id.botonLogin);
        googleButton = view.findViewById(R.id.googleButton);
        facebookButton = view.findViewById(R.id.facebookButton);
        outlookButton = view.findViewById(R.id.outlookButton);

        navController = Navigation.findNavController(view);

        botonSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_singupFragment);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_googleFragment);
            }
        });

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_recienteFragment2);
            }
        });

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_facebookFragment);
            }
        });

        outlookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_loginFragment_to_outlookFragment);
            }
        });
    }
}