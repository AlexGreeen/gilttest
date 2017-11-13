package com.al.gilttest.ui.events.main;


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

public class SalesFragment extends Fragment {
    public static final String TAG = SalesFragment.class.getSimpleName();
    public static final String SALES_KEY = "sales_key";
    private List<SalesVM> sales = new ArrayList<>();
    private SalesListAdapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    public static SalesFragment newInstance(List<SalesVM> sales) {
        Bundle args = new Bundle();
        ArrayList<SalesVM> data = new ArrayList<>();
        data.addAll(sales);
        args.putParcelableArrayList(SALES_KEY, data);
        SalesFragment fragment = new SalesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sales = getArguments().getParcelableArrayList(SALES_KEY);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_sales, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.sales_list);
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new SalesListAdapter(sales);
        recyclerView.setAdapter(adapter);
    }
}
