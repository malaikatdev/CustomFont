package com.wayandev.mytextview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textViewCustom);
        Typeface typeface= Typeface.createFromAsset(getAssets(),"font/surfing.ttf");
        textView.setTypeface(typeface);
    }
}
