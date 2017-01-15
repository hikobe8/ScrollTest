package com.soda.scrollertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.soda.scrollertest.scroller.MyRelativeLayout;

public class ScrollActivity extends AppCompatActivity {

    private MyRelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoller);
        mLayout = (MyRelativeLayout) findViewById(R.id.layout);
    }

    public void up(View view) {
        mLayout.scrollBy(0, 100);
    }

    public void left(View view) {
        mLayout.scrollBy(100, 0);
    }

    public void down(View view) {
        mLayout.scrollBy(0, -100);
    }

    public void right(View view) {
        mLayout.scrollBy(-100, 0);
    }

    /**
     * 复位到初始坐标
     * 调用scrollTO/scrollBy方法值是对内容进行滑动，不会改变控件的初始x,y值
     * @param view
     */
    public void reset(View view) {
        mLayout.scrollTo((int) mLayout.getX(), (int)mLayout.getY());
    }
}
