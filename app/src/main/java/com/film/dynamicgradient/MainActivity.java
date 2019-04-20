package com.film.dynamicgradient;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,new int[] {getResources().getColor(R.color.colorAccent),
        getResources().getColor(R.color.colorPrimaryDark), getResources().getColor(R.color.colorPrimary)});
        findViewById(R.id.textView).setBackground(gradientDrawable);
    }
}
