package com.faith.sample.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class MediaViewPager extends ViewPager {
    public MediaViewPager(Context context) {
        super(context);
    }

    public MediaViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    /**
     * PhotoView解决手势冲突
     * @param ev
     * @return
     */

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return false;
    }


}
