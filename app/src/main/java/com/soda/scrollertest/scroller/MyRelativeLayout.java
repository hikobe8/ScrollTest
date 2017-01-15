package com.soda.scrollertest.scroller;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.Scroller;

/**
 * Created by Ray on 2017/1/14.
 */

public class MyRelativeLayout extends RelativeLayout {

    //利用Scroller实现弹性滑动
    private Scroller mScroller;

    public MyRelativeLayout(Context context) {
        super(context, null, 0);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mScroller = new Scroller(getContext());
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if (mScroller.computeScrollOffset()) {
            scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            invalidate();
        }
    }

    public void smoothScrollTo(int x, int y) {
        int dx = x - getScrollX();
        int dy = y - getScrollY();
        mScroller.startScroll(getScrollX(), getScrollY(), dx, dy,1000);
        invalidate();
    }

    public void smoothScrollBy(int x, int y) {
        mScroller.startScroll(getScrollX(), getScrollY(), x, y,500);
        invalidate();
    }

    public void reset(){
       smoothScrollTo((int)getX(), (int)getY());
    }
}
