package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.tonnyl.whatsnew.WhatsNew;
import io.github.tonnyl.whatsnew.item.WhatsNewItem;
import io.github.tonnyl.whatsnew.util.PresentationOption;

public class WhatsNewLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_new_library);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsNew whatsNew = WhatsNew.newInstance(
                        new WhatsNewItem("Nice Icons", "Completely customize colors, texts and icons.", R.drawable.ic_album),
                        new WhatsNewItem("Such Easy", "Setting this up only takes 2 lines of code, impressive you say?", R.drawable.ic_all24),
                        new WhatsNewItem("Very Sleep", "It helps you get more sleep by writing less code.", R.drawable.ic_assistant),
                        new WhatsNewItem("Text Only", "No icons? Just go with plain text.")
                );
                whatsNew.setPresentationOption(PresentationOption.DEBUG);
                whatsNew.presentAutomatically(WhatsNewLibrary.this);
            }
        });
    }
}