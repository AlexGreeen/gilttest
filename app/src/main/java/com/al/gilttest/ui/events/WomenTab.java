package com.al.gilttest.ui.events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.al.gilttest.R;

import java.util.ArrayList;
import java.util.List;


public class WomenTab extends Fragment {
    public static final String TAG = WomenTab.class.getName();
    public static final String W_SALES_KEY = "wom_active_sales";
    private List<W_SalesVE> w_sales = new ArrayList<>();
    private W_Adapter w_adapter;
    private RecyclerView rv;
    private RecyclerView.LayoutManager layoutManager;

    public static WomenTab newInstance(List<W_SalesVE> list) {
        ArrayList<W_SalesVE> data = new ArrayList<>();
        Bundle args = new Bundle();
        data.addAll(list);
        args.putParcelableArrayList(W_SALES_KEY, data);
        WomenTab fragment = new WomenTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() == null) {
            w_sales = getArguments().getParcelableArrayList(W_SALES_KEY);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_women_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv = view.findViewById(R.id.w_recycler);
        layoutManager = new LinearLayoutManager(this.getContext());
        rv.setLayoutManager(layoutManager);
        w_adapter = new W_Adapter(w_sales);
        rv.setAdapter(w_adapter);
    }
}
