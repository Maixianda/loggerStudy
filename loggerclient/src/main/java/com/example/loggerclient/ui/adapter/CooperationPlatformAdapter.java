package com.example.loggerclient.ui.adapter;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.support.v4.content.ContextCompat;

import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.example.loggerclient.R;
import com.example.loggerclient.databinding.ItemCooperationPlatformBinding;
import com.example.loggerclient.model.CooperationPlatform;
import com.example.loggerclient.ui.adapter.ViewHolder.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/9/6.
 * 说明:           合作平台适配器
 * 创建人:         maixianda
 * 创建时间:       2016/9/6 10:02
 */
public class CooperationPlatformAdapter extends ListAdapter<CooperationPlatform,ViewDataBinding> implements OnItemClickListener {
    private List<CooperationPlatform> mCooperationPlatform;
    private ItemCooperationPlatformBinding binding;
    private Activity activity;
    public CooperationPlatformAdapter(Activity Activity) {
        super(Activity);
        activity = Activity;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewBinding(BaseViewHolder<ViewDataBinding> vh, int position) {
        binding = (ItemCooperationPlatformBinding) vh.getBinding();
        CooperationPlatform cooperationPlatform = get(position);
        binding.tvBigTitle.setText(cooperationPlatform.getBigTitle());
        binding.tvSmallTitle.setText(cooperationPlatform.getSmallTitle());
        binding.rlPlatform.setBackground(ContextCompat.getDrawable(activity,R.mipmap.ic_test_1));
    }

    @Override
    protected int getItemLayoutId(int position) {
        return R.layout.item_cooperation_platform;
    }

    @Override
    public void onItemClick(int i) {

    }
}
