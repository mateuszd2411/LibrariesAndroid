package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button simpleSliderBtn, progressViewBtn, determinateProgressViewBtn, flipDigitClockBtn,
            motionToastBtn, balloonBtn, slideDatePickerBtn, textHighlighterBtn, dropDownViewBtn, styleableToastBtn,
            countryCurrencyPickerBtn, androidToggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        simpleSliderBtn = findViewById(R.id.simple_slider_btn);
        progressViewBtn = findViewById(R.id.progress_view_btn);
        determinateProgressViewBtn = findViewById(R.id.determinate_progress_view_btn);
        flipDigitClockBtn = findViewById(R.id.flip_digit_btn);
        motionToastBtn = findViewById(R.id.motion_toast_btn);
        balloonBtn = findViewById(R.id.balloon_btn);
        slideDatePickerBtn = findViewById(R.id.slide_date_picker_btn);
        textHighlighterBtn = findViewById(R.id.text_highlighter_btn);
        dropDownViewBtn = findViewById(R.id.drop_down_view_btn);
        styleableToastBtn = findViewById(R.id.style_able_toast_btn);
        countryCurrencyPickerBtn = findViewById(R.id.country_currency_picker_btn);
        androidToggleBtn = findViewById(R.id.android_toggle_btn);

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

        determinateProgressViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeterminateProgressView.class);
                startActivity(intent);
            }
        });

        flipDigitClockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlipDigitClock.class);
                startActivity(intent);
            }
        });

        motionToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MotionToast.class);
                startActivity(intent);
            }
        });

        balloonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Balloon.class);
                startActivity(intent);
            }
        });

        slideDatePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SlideDatePicker.class);
                startActivity(intent);
            }
        });

        textHighlighterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextHighlighter.class);
                startActivity(intent);
            }
        });

        dropDownViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DropDownViewTxt.class);
                startActivity(intent);
            }
        });

        styleableToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StyleableToastLibrary.class);
                startActivity(intent);
            }
        });

        countryCurrencyPickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountryCurrencyPickerLibrary.class);
                startActivity(intent);
            }
        });

        androidToggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidToggleLibrary.class);
                startActivity(intent);
            }
        });
    }
}
