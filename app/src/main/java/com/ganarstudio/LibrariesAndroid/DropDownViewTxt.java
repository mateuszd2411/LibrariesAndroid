package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.anthonyfdev.dropdownview.DropDownView;

public class DropDownViewTxt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down_view_txt);

        final DropDownView dropDownView = (DropDownView) findViewById(R.id.drop_down_view);
        View collapsedView = LayoutInflater.from(this).inflate(R.layout.header, null, false);
        View expandedView = LayoutInflater.from(this).inflate(R.layout.footer, null, false);

        dropDownView.setHeaderView(collapsedView);
        dropDownView.setExpandedView(expandedView);

        collapsedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dropDownView.isExpanded()) {
                    dropDownView.collapseDropDown();
                } else {
                    dropDownView.expandDropDown();
                }
            }
        });
    }
}