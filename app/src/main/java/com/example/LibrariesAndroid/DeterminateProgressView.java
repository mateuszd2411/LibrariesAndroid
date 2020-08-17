package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.owl93.dpb.CircularProgressView;

public class DeterminateProgressView extends AppCompatActivity {

    //https://www.youtube.com/watch?v=zuVVd4k4qB8&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=2

    CircularProgressView progress;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinate_progress_view);

        progress = findViewById(R.id.progress);
        button = findViewById(R.id.button);

        progress.setMaxValue(100);
        progress.setProgress(0);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.setProgress(progress.getProgress() + 10);
            }
        });
    }
}