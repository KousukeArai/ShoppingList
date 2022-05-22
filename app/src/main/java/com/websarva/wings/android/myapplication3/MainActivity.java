package com.websarva.wings.android.myapplication3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.websarva.wings.android.myapplication3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public static List<Map<String, Object>> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        Map<String, Object> map = new HashMap<>();

        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "りんご");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "たまねぎ");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "にんじん");
        map.put("unit", "本");
        map.put("check", false);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "トマト");
        map.put("unit", "個");
        map.put("check", false);
        list.add(map);
    }
}

