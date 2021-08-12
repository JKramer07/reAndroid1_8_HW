package com.geek.reandroid1_8_hw.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.geek.reandroid1_8_hw.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView botNav;
    private NavController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNavigation();
    }

    private void initNavigation() {
        botNav = findViewById(R.id.botNav);
        AppBarConfiguration appBar = new AppBarConfiguration
                .Builder(R.id.firstFragment, R.id.secondFragment).build();
        controller = Navigation.findNavController(this, R.id.mainCont);
        NavigationUI.setupWithNavController(botNav, controller);
        NavigationUI.setupActionBarWithNavController(this, controller, appBar);

    }
}