package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.BalloonAnimation;

public class Balloon extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balloon);

        button = findViewById(R.id.button);

        final com.skydoves.balloon.Balloon balloon = new com.skydoves.balloon.Balloon.Builder(getApplicationContext())
                .setArrowSize(10)
                .setArrowOrientation(ArrowOrientation.BOTTOM)
                .setArrowVisible(true)
                .setWidthRatio(0.0f)
                .setHeight(65)
                .setTextSize(15f)
                .setArrowPosition(0.5f)
                .setCornerRadius(10f)
                .setText("You can access your profile from now on.")
                .setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent))
                .setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                .setBalloonAnimation(BalloonAnimation.CIRCULAR)
                .build();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balloon.showAlignBottom(button);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        balloon.dismiss();
                    }
                }, 2000);
            }
        });
    }
}