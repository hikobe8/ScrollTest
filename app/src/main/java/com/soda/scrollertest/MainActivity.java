package com.soda.scrollertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.soda.scrollertest.scroller.ScrollerActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void scroll(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }

    public void scroller(View view) {
        Intent intent = new Intent(this, ScrollerActivity.class);
        startActivity(intent);
    }
}
