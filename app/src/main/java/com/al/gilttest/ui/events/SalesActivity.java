package com.al.gilttest.ui.events;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.al.gilttest.R;
import com.al.gilttest.data.DataManager;
import com.al.gilttest.data.remote.constants.Constants;
import com.al.gilttest.ui.events.main.SalesFragment;
import com.al.gilttest.ui.events.main.SalesVM;
import com.al.gilttest.ui.events.men.M_SalesVM;
import com.al.gilttest.ui.events.men.MenTab;
import com.al.gilttest.ui.events.women.W_SalesVE;
import com.al.gilttest.ui.events.women.WomenTab;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SalesActivity extends AppCompatActivity implements DataManager.OnCompleteCallback {

    @BindView(R.id.toolbar_top)
    Toolbar toolbar_top;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.viewpager)
    ViewPager pager;

    WomenTab womenFragment;
    MenTab menFragment;
    SalesFragment salesFragment;

    private List<SalesVM> a_sales = new ArrayList<>();
    private List<W_SalesVE> w_sales = new ArrayList<>();
    private List<M_SalesVM> m_sales = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        ButterKnife.bind(this);
        pager.setOffscreenPageLimit(3);
        tabs.setupWithViewPager(pager);

        DataManager.getInstance().registerCallback(this);
        fetch();


    }

    void fetch() {
        DataManager.getInstance().salesResponse(Constants.ACTIVE.toString());
    }


    @Override
    public void onComplete(List<SalesVM> retData) {
        a_sales.addAll(retData);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame, SalesFragment.newInstance(a_sales),
                        SalesFragment.TAG).commit();
    }

    private void setupViewPager(ViewPager viewPager) {
        EventsViewPagerAdapter adapter = new EventsViewPagerAdapter(getSupportFragmentManager());
    }

    private void initFirstTab(List<M_SalesVM> reternedWonamSales) {

    }
}
