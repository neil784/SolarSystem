package com.example.thesolarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity {
    private ImageButton sun;
    private ImageButton mercury;
    private ImageButton venus;
    private ImageButton earth;
    private ImageButton mars;
    private ImageButton jupiter;
    private ImageButton saturn;
    private ImageButton uranus;
    private ImageButton neptune;
    private ImageButton pluto;
    boolean backPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_page);

        sun = findViewById(R.id.sun);
        mercury = findViewById(R.id.mercury);
        venus = findViewById(R.id.venus);
        earth = findViewById(R.id.earth);
        mars = findViewById(R.id.mars);
        jupiter = findViewById(R.id.jupiter);
        saturn = findViewById(R.id.saturn);
        uranus = findViewById(R.id.uranus);
        neptune = findViewById(R.id.neptune);
        pluto = findViewById(R.id.pluto);

        sun.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Sun.class);
            startActivity(intent);
        });
        mercury.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Mercury.class);
            startActivity(intent);
        });
        venus.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Venus.class);
            startActivity(intent);
        });
        earth.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Earth.class);
            startActivity(intent);
        });
        mars.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Mars.class);
            startActivity(intent);
        });
        jupiter.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Jupiter.class);
            startActivity(intent);
        });
        saturn.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Saturn.class);
            startActivity(intent);
        });
        uranus.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Uranus.class);
            startActivity(intent);
        });
        neptune.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Neptune.class);
            startActivity(intent);
        });
        pluto.setOnClickListener(v -> {
            Intent intent = new Intent(MainPage.this, Pluto.class);
            startActivity(intent);
        });
    }

    @Override
    public void onBackPressed() {
        if (backPressed) {
            finishAffinity();
            System.exit(0);
        }
        Toast.makeText(this, "Back one more time to exit", Toast.LENGTH_SHORT).show();
        backPressed = true;
    }
}