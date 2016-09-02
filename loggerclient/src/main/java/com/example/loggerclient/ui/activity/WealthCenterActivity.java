package com.example.loggerclient.ui.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;

import com.example.loggerclient.R;
import com.example.loggerclient.databinding.ActivityWealthCenterBinding;
import com.example.loggerclient.model.HeaderModel;
import com.leo.swipe.back.base.BaseSwipeBackActivity;

/**
 * Created by Administrator on 2016/9/2.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/2 15:56
 */
public class WealthCenterActivity extends BaseSwipeBackActivity  implements HeaderModel.HeaderView{
    private ActivityWealthCenterBinding binding;
    public HeaderModel header;
    @Override
    public void beforeInitView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wealth_center);
        setHeader();
    }

    private void setHeader() {
        header = new HeaderModel(this);
        header.setMidTitle("按揭产品");
        binding.setHeader(header);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void onBackClicked() {

    }

    @Override
    public void onTitleClicked() {

    }

    @Override
    public void onMenuClicked() {

    }
}
