package com.example.loggerclient.ui.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.example.loggerclient.R;
import com.example.loggerclient.databinding.ActivityWealthCenterBinding;
import com.example.loggerclient.model.CooperationPlatform;
import com.example.loggerclient.model.HeaderModel;
import com.example.loggerclient.ui.adapter.CooperationPlatformAdapter;
import com.example.loggerclient.ui.custom.BannerHorizontalItem;
import com.example.loggerclient.ui.custom.BannerHorizontalItemHolderView;
import com.example.loggerclient.ui.custom.LocalImageHolderView;
import com.leo.swipe.back.base.BaseSwipeBackActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/2.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/9/2 15:56
 */
public class WealthCenterActivity extends BaseSwipeBackActivity implements HeaderModel.HeaderView {
    private ActivityWealthCenterBinding binding;
    public HeaderModel header;
    private ArrayList<Integer> localImg = new ArrayList<>();
    private ArrayList<BannerHorizontalItem> llItem = new ArrayList<>();
    private CooperationPlatformAdapter adapter;
    @Override
    public void beforeInitView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wealth_center);
        setHeader();
    }

    @Override
    public void initView() {
        binding.rvPlatform.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CooperationPlatformAdapter(this);
        binding.rvPlatform.setAdapter(adapter);
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
        }, localImg)
                .setPageIndicator(new int[]{R.drawable.ic_white_dot, R.drawable.ic_red_dot}, getResources().getDimensionPixelSize(R.dimen.dp_7));
        //endregion 顶部banner
        //region 第二部分的banner
        initNetSec();
        binding.convenientSecBanner.setPages(new CBViewHolderCreator<BannerHorizontalItemHolderView>() {
            @Override
            public BannerHorizontalItemHolderView createHolder() {
                return new BannerHorizontalItemHolderView();
            }
        }, llItem);
                //.setPageIndicator(new int[]{R.drawable.ic_white_dot, R.drawable.ic_red_dot}, getResources().getDimensionPixelSize(R.dimen.dp_7));
        //endregion 第二部分的banner
        //region recyclerView
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.add(new CooperationPlatform("1111","2222","333333"));
        adapter.notifyDataSetChanged();
        //endregion recyclerView
    }

    private void initNetSec() {
        llItem.add(new BannerHorizontalItem(this, 4));
        llItem.add(new BannerHorizontalItem(this, 4));
        llItem.add(new BannerHorizontalItem(this, 4));
        llItem.add(new BannerHorizontalItem(this, 4));
        llItem.add(new BannerHorizontalItem(this, 4));
        llItem.add(new BannerHorizontalItem(this, 4));
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
        while (i < 7) {
            localImg.add(getResId("ic_test_" + i, R.mipmap.class));
            i++;
        }
    }

    private void setHeader() {
        header = new HeaderModel(this);
        header.setMidTitle("财富中心");
        binding.setHeader(header);
    }

    private int getResId(String varName, Class<?> cls) {
        Field idField = null;
        try {
            idField = cls.getDeclaredField(varName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            //Logger.e("banner获取资源,没有这个资源id");
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
