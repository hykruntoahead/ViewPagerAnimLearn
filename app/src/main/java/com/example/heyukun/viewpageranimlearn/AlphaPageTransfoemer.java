package com.example.heyukun.viewpageranimlearn;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

/**
 * Created by heyukun on 2017/6/15.
 */

public class AlphaPageTransfoemer  implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {
        Log.i("position","position:"+position);
             if (position < -1){
                 page.setScaleX(0);
                 page.setAlpha(0);
             }else if (position <= 1){
                 float pos = Math.abs(position);
                 Log.i("position","pos:"+pos);
                 if (0 <= pos && pos < 0.5){
                     page.setAlpha(Math.abs(1-pos));
                 }else {
                     page.setAlpha(pos);
                 }
//                 page.setScaleX(page.getLayoutParams().width-page.getLayoutParams().width*pos);

             }else {
                 page.setAlpha(1);
             }
    }
}

