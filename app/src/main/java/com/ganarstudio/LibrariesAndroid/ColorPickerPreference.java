package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.skydoves.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.ColorPickerView;
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener;
import com.skydoves.colorpickerview.listeners.ColorListener;

public class ColorPickerPreference extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker_preference);

        textView = (TextView) findViewById(R.id.text);

        final ColorPickerView colorPickerView = (ColorPickerView) findViewById(R.id.colorPickerView);
        colorPickerView.setColorListener(new ColorEnvelopeListener() {
            @Override
            public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                //Toast.makeText(ColorPickerPreference.this, "Color: " + envelope.getColor(), Toast.LENGTH_SHORT).show();
                textView.setText("0" + envelope.getColor());
                textView.setBackgroundColor(envelope.getColor());
                textView.setTextColor(Color.WHITE);
            }
        });
    }
}