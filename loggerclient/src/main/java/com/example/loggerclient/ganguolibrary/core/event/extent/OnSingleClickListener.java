package com.example.loggerclient.ganguolibrary.core.event.extent;

import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/9/2.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/2 14:56
 */
public abstract class OnSingleClickListener implements View.OnClickListener {

    /**
     * 点击间隔
     */
    private static final long DOUBLE_PRESS_INTERVAL = 600;
    private long lastPressTime;

    public abstract void onSingleClick(View v);

    @Override
    public void onClick(View v) {
        long pressTime = System.currentTimeMillis();
        if (pressTime - lastPressTime >= DOUBLE_PRESS_INTERVAL) {
            onSingleClick(v);
        } else {
            Log.d("onSingleClick", "double click");
        }
        lastPressTime = pressTime;
    }

}
