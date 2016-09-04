package com.example.loggerclient.ui.adapter.ViewHolder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.loggerclient.BR;

/**
 * Created by Administrator on 2016/9/4.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/4 18:12
 */
public class BaseViewHolder<B extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private B mBinding;
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public B getBinding()
    {
        return mBinding;
    }

    public void bindTo(Object obj)
    {
//        mBinding.setVariable(BR.data)
    }
}
