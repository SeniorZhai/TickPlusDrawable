package com.zoe.tickplusdrawable;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.view);
        // 设置大小 颜色
        final TickPlusDrawable tickPlusDrawable = new TickPlusDrawable(getResources().getDimensionPixelSize(R.dimen.stroke_width), getResources().getColor(android.R.color.holo_blue_dark), Color.WHITE);
        view.setBackground(tickPlusDrawable);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tickPlusDrawable.toggle();
            }
        });
    }
}
