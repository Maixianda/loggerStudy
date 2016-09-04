package com.example.loggerclient.ui.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.loggerclient.R;

/**
 * Created by Administrator on 2016/9/3.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/3 16:42
 */
public class BannerHorizontalItem extends LinearLayout {
    private int mCount = 0;
    private BannerHorizontalItem object;
    private ImageView mIv1;
    private ImageView mIv2;
    private ImageView mIv3;
    private ImageView mIv4;
    private TextView mTv1;
    private TextView mTv2;
    private TextView mTv3;
    private TextView mTv4;
    public BannerHorizontalItem(Context context, int count) {
        super(context);
        mCount = count;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_horizontal_holder_view,this);
    }

    public void setObject(BannerHorizontalItem object) {
        mIv1 = object.mIv1;
        mIv2 = object.mIv1;
        mIv3 = object.mIv1;
        mIv4 = object.mIv1;
        mTv1 = object.mTv1;
        mTv2 = object.mTv2;
        mTv3 = object.mTv3;
        mTv4 = object.mTv4;
    }
}
