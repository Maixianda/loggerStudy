package com.example.loggerclient.ui.custom;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;

/**
 * Created by Administrator on 2016/9/3.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/3 17:10
 */
public class BannerHorizontalItemHolderView implements Holder<Integer> {
    private BannerHorizontalItem item;
    @Override
    public View createView(Context context) {
        item = new BannerHorizontalItem(context,0);
        return item;
    }

    @Override
    public void UpdateUI(Context context, int i, Integer integer) {
        item.init();
    }
}
