package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skydoves.progressview.OnProgressChangeListener;

import java.util.Random;

public class ProgressView extends AppCompatActivity {

    //  https://www.youtube.com/watch?v=x2gymBeqaJQ&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w

    com.skydoves.progressview.ProgressView progressView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_view);

        progressView = findViewById(R.id.progressView1);
        button = findViewById(R.id.button);

        progressView.setOnProgressChangeListener(new OnProgressChangeListener() {
            @Override
            public void onChange(float progress) {
                progressView.setLabelText("Progress: " + progress + "%");
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                progressView.setProgress(r.nextInt(100) + 1);
            }
        });
    }
}