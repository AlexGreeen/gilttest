package com.al.gilttest.ui.events.men;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.al.gilttest.R;
import com.al.gilttest.ui.events.women.WomenTab;

import java.util.ArrayList;
import java.util.List;

public class MenTab extends Fragment {
    public static final String M_TAG = WomenTab.class.getName();
    public static final String M_SALES_KEY = "men_active_sales";
    private List<M_SalesVM> m_sales = new ArrayList<>();
    private M_Adapter adapter;
    private RecyclerView rv;
    private RecyclerView.LayoutManager layoutManager;

    public static MenTab newInstance(List<M_SalesVM> sales) {
        ArrayList<M_SalesVM> data = new ArrayList<>();
        data.addAll(sales);
        Bundle args = new Bundle();
        args.putParcelableArrayList(M_SALES_KEY, data);
        MenTab fragment = new MenTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            m_sales = getArguments().getParcelableArrayList(M_SALES_KEY);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_men_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv = view.findViewById(R.id.m_recycler);
        layoutManager = new LinearLayoutManager(this.getContext());
        rv.setLayoutManager(layoutManager);
        adapter = new M_Adapter(m_sales);
        rv.setAdapter(adapter);
    }
}
