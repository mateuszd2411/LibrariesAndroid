package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button simpleSliderBtn, progressViewBtn, determinateProgressView, flipDigitClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        simpleSliderBtn = findViewById(R.id.simple_slider_btn);
        progressViewBtn = findViewById(R.id.progress_view_btn);
        determinateProgressView = findViewById(R.id.determinate_progress_view_btn);
        flipDigitClock = findViewById(R.id.flip_digit_btn);

        //click listener
        simpleSliderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleSliderActivity.class);
                startActivity(intent);
            }
        });

        progressViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressView.class);
                startActivity(intent);
            }
        });

        determinateProgressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeterminateProgressView.class);
                startActivity(intent);
            }
        });

        flipDigitClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlipDigitClock.class);
                startActivity(intent);
            }
        });

    }
}
