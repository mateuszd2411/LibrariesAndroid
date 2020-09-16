package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.angads25.toggle.interfaces.OnToggledListener;
import com.github.angads25.toggle.model.ToggleableView;
import com.github.angads25.toggle.widget.LabeledSwitch;

public class AndroidToggleLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_toggle_library);

        LabeledSwitch labeledSwitch = findViewById(R.id.switch1);
        labeledSwitch.setOnToggledListener(new OnToggledListener() {
            @Override
            public void onSwitched(ToggleableView toggleableView, boolean isOn) {
                if (isOn) {
                    Toast.makeText(AndroidToggleLibrary.this, "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AndroidToggleLibrary.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}