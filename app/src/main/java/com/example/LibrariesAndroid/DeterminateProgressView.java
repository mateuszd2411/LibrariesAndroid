package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.owl93.dpb.CircularProgressView;

public class DeterminateProgressView extends AppCompatActivity {

    //https://www.youtube.com/watch?v=zuVVd4k4qB8&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=2

    CircularProgressView progress;

    Button button;

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinate_progress_view);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (progress.getProgress() < 100) {
                    progress.animateProgressChange(progress.getProgress() + 10, 1000);
                    handler.postDelayed(runnable, 1000);
                }
            }
        };

        progress = findViewById(R.id.progress);
        button = findViewById(R.id.button);

        progress.setMaxValue(100);
        progress.setProgress(0);
        progress.setTextEnabled(true);
        progress.setTextColor(Color.GREEN);
        progress.setStrokeWidth(10);
        progress.setStrokeColor(Color.GRAY);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(runnable, 1000);
            }
        });
    }
}