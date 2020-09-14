package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.muddzdev.styleabletoast.StyleableToast;

public class StyleableToastLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styleable_toast_library);

        Button button = (Button) findViewById(R.id.styleable_toast_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new StyleableToast
                        .Builder(StyleableToastLibrary.this)
                        .text("Hello world!")
                        .textColor(Color.RED)
                        .backgroundColor(Color.BLACK)
                        .stroke(1, Color.WHITE)
                        .iconStart(R.drawable.food)
                        .textBold()
                        .cornerRadius(10)
                        .length(1000000000)
                        .show();
            }
        });
    }
}