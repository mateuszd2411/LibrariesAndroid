package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.aldrek.digitflip.FlipWidget;

import java.util.Random;

public class FlipDigitClock extends AppCompatActivity {

    //https://www.youtube.com/watch?v=_Rv6rCdLnwY&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=3

    Button button;
    FlipWidget flipWidget;
    int number = 0;

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_digit_clock);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                number++;
                flipWidget.setValue(number, true);
                handler.postDelayed(runnable, 1000);
            }
        };

        flipWidget = findViewById(R.id.flipWidget);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == 0) {
                    handler.postDelayed(runnable, 1000);
                }
            }
        });

    }
}