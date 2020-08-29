package com.ganarstudio.LibrariesAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextHighlighter extends AppCompatActivity {

    Button btn_search;
    EditText et_search;
    TextView tv_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_highlighter);

        btn_search = (Button) findViewById(R.id.btn_search);
        et_search = (EditText) findViewById(R.id.et_text);
        tv_output = (TextView) findViewById(R.id.tv_output);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new com.xeoh.android.texthighlighter.TextHighlighter()
                        .setBackgroundColor(Color.parseColor("#FFFF00"))
                        .setForegroundColor(Color.RED)
                        .addTarget(tv_output)
                        .highlight(et_search.getText().toString(), com.xeoh.android.texthighlighter.TextHighlighter.BASE_MATCHER);
            }
        });
    }
}