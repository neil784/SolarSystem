package com.example.thesolarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class IntroPage extends AppCompatActivity {
    private float y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                y2 = touchevent.getY();
                if (y1 > y2) {
                    Intent intent = new Intent(IntroPage.this, MainPage.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                    finish();
                }
                break;
        }
        return false;
    }
}