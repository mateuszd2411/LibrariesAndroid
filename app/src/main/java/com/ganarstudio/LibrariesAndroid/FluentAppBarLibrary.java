package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.vlstr.fluentappbar.FluentAppBar;

public class FluentAppBarLibrary extends AppCompatActivity implements View.OnClickListener {

    FluentAppBar fluentAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluent_app_bar_library);

        fluentAppBar = (FluentAppBar) findViewById(R.id.fluent_app_bar);
        fluentAppBar.setNavigationMenu(R.menu.menu, this);
        fluentAppBar.setSecondaryMenu(R.menu.menu2, this);
        fluentAppBar.setBlurRadius(10);
    }

    @Override
    public void onClick(View v) {
        int resId = (int) v.getTag();
        switch (resId){
            //Navigation Menu
            case R.id.nav_all:
                fluentAppBar.collapse();
                break;
            case R.id.nav_album:
                break;
            case R.id.nav_keywords:
                break;

            // Secondary Menu
            case R.id.menu_sync:
                fluentAppBar.collapse();
                break;
            case R.id.menu_assistant:
                break;
            case R.id.menu_shared:
                break;
        }
    }
}