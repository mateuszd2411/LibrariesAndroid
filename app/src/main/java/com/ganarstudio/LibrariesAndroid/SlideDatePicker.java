package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.niwattep.materialslidedatepicker.SlideDatePickerDialog;
import com.niwattep.materialslidedatepicker.SlideDatePickerDialogCallback;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SlideDatePicker extends AppCompatActivity implements SlideDatePickerDialogCallback {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_date_picker);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the last supported date
                Calendar endDate = Calendar.getInstance();
                endDate.set(Calendar.YEAR, 2100);

                SlideDatePickerDialog.Builder builder = new SlideDatePickerDialog.Builder();
                builder.setEndDate(endDate);
                SlideDatePickerDialog dialog = builder.build();
                dialog.show(getSupportFragmentManager(), "Dialog");
            }
        });
    }

    @Override
    public void onPositiveClick(int day, int month, int year, @NotNull Calendar calendar) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MM dd yyyy", Locale.getDefault());
        textView.setText(format.format(calendar.getTime()));
    }
}