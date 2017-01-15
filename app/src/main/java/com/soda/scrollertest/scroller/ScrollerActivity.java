package com.soda.scrollertest.scroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.soda.scrollertest.R;

public class ScrollerActivity extends AppCompatActivity {

    private MyRelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoller);
        mLayout = (MyRelativeLayout) findViewById(R.id.layout);
    }

    public void up(View view) {
        mLayout.smoothScrollBy(0, 100);
    }

    public void left(View view) {
        mLayout.smoothScrollBy(100, 0);
    }

    public void down(View view) {
        mLayout.smoothScrollBy(0, -100);
    }

    public void right(View view) {
        mLayout.smoothScrollBy(-100, 0);
    }

    public void reset(View view) {
       mLayout.reset();
    }
}
