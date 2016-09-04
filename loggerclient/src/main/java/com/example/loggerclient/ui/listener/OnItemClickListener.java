package com.example.loggerclient.ui.listener;

import android.view.View;

import com.example.loggerclient.ui.adapter.BaseAdapter;
import com.example.loggerclient.ui.adapter.ViewHolder.BaseViewHolder;

/**
 * Created by Administrator on 2016/9/4.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/4 19:03
 */
public interface OnItemClickListener {
    void onItemClick(BaseAdapter adapter, BaseViewHolder vh, View view);
}
