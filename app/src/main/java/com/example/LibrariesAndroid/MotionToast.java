package com.example.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotionToast extends AppCompatActivity {
//https://www.youtube.com/watch?v=5G_67FR9xu4&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=4
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_toast);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                www.sanju.motiontoast.MotionToast.Companion.createToast(
                        MotionToast.this,
                        "Text message",
                        www.sanju.motiontoast.MotionToast.TOAST_SUCCESS,
                        www.sanju.motiontoast.MotionToast.GRAVITY_BOTTOM,
                        www.sanju.motiontoast.MotionToast.SHORT_DURATION,
                        ResourcesCompat.getFont(MotionToast.this,R.font.helvetica_regular));
            }
        });

    }
}