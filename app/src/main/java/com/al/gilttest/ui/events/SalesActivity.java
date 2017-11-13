package com.al.gilttest.ui.events;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.al.gilttest.R;
import com.al.gilttest.data.DataManager;
import com.al.gilttest.data.remote.constants.Constants;
import com.al.gilttest.ui.events.main.SalesFragment;
import com.al.gilttest.ui.events.main.SalesVM;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SalesActivity extends AppCompatActivity implements DataManager.OnCompleteCallback {

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.toolbar_top)
    Toolbar toolbar_top;
    @BindView(R.id.toolbar_bottom)
    Toolbar toolbar_bottom;
    //@BindView(R.id.navigation_view)
    NavigationView navigation_view;
    private List<SalesVM> sales = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        ButterKnife.bind(this);
        DataManager.getInstance().registerCallback(this);
        fetch();
    }

    void fetch() {
        DataManager.getInstance().salesResponse(Constants.ACTIVE.toString());
    }


    @Override
    public void onComplete(List<SalesVM> retData) {
        sales.addAll(retData);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame, SalesFragment.newInstance(sales),
                        SalesFragment.TAG).commit();
    }
}
