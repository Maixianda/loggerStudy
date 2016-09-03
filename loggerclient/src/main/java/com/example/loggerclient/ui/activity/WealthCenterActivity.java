package com.example.loggerclient.ui.activity;

import android.databinding.DataBindingUtil;
import android.widget.HorizontalScrollView;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.example.loggerclient.R;
import com.example.loggerclient.databinding.ActivityWealthCenterBinding;
import com.example.loggerclient.model.HeaderModel;
import com.example.loggerclient.ui.custom.BannerHorizontalItemHolderView;
import com.example.loggerclient.ui.custom.LocalImageHolderView;
import com.leo.swipe.back.base.BaseSwipeBackActivity;
import com.orhanobut.logger.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/2.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/2 15:56
 */
public class WealthCenterActivity extends BaseSwipeBackActivity  implements HeaderModel.HeaderView{
    private ActivityWealthCenterBinding binding;
    public HeaderModel header;
    private ArrayList<Integer> localImg = new ArrayList<>();
    @Override
    public void beforeInitView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wealth_center);
        setHeader();
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        initLocalImg();
        //region 顶部banner
        binding.convenientBanner.setPages(new CBViewHolderCreator<LocalImageHolderView>() {
            @Override
            public LocalImageHolderView createHolder() {
                return new LocalImageHolderView();
            }
        },localImg)
        .setPageIndicator(new int[]{R.drawable.ic_white_dot, R.drawable.ic_red_dot}, getResources().getDimensionPixelSize(R.dimen.dp_7));
        //endregion 顶部banner
        // TODO: 2016/9/3 17:28 第二部分banner
//        binding.convenientSecBanner.setPages(new CBViewHolderCreator<BannerHorizontalItemHolderView>() {
//            @Override
//            public BannerHorizontalItemHolderView createHolder() {
//                return new BannerHorizontalItemHolderView();
//            }
//        },);
    }

    @Override
    protected void onResume() {
        binding.convenientBanner.startTurning(5000);
        super.onResume();
    }

    @Override
    protected void onPause() {
        binding.convenientBanner.stopTurning();
        super.onPause();
    }

    private void initLocalImg() {
        int i = 0;
        while (i<7)
        {
            localImg.add(getResId("ic_test_" + i, R.mipmap.class));
            i++;
        }
    }

    private void setHeader() {
        header = new HeaderModel(this);
        header.setMidTitle("按揭产品");
        binding.setHeader(header);
    }

    private int getResId(String varName,Class<?> cls)
    {
        Field idField = null;
        try {
            idField = cls.getDeclaredField(varName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e("banner获取资源,没有这个资源id");
            return -1;
        }

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
