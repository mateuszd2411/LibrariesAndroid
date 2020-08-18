package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.aldrek.digitflip.FlipDigit;
import com.aldrek.digitflip.FlipWidget;

import java.util.Calendar;
import java.util.Random;

public class FlipDigitClock extends AppCompatActivity {

    //https://www.youtube.com/watch?v=_Rv6rCdLnwY&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=3

    Button button;
    FlipWidget hours, minutes, seconds;

    int hoursNumber, minutesNumber, secondsNumber;

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_digit_clock);

        hours = findViewById(R.id.hours);
        minutes = findViewById(R.id.minutes);
        seconds = findViewById(R.id.seconds);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                Calendar calendar = Calendar.getInstance();

                hoursNumber = calendar.get(Calendar.HOUR_OF_DAY);
                minutesNumber = calendar.get(Calendar.MINUTE);
                secondsNumber = calendar.get(Calendar.SECOND);

                hours.setValue(hoursNumber, true);
                minutes.setValue(minutesNumber, true);
                seconds.setValue(secondsNumber, true);

                handler.postDelayed(runnable, 1000);
            }
        };

        handler.postDelayed(runnable, 1000);




    }
}