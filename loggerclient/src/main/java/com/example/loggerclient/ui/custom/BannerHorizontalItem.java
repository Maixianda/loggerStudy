package com.example.loggerclient.ui.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.loggerclient.R;

/**
 * Created by Administrator on 2016/9/3.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/3 16:42
 */
public class BannerHorizontalItem extends LinearLayout {
    private int mCount = 0;
    public BannerHorizontalItem(Context context, int count) {
        super(context);
        mCount = count;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_horizontal_holder_view,this);
    }

    public void init() {

    }
}
