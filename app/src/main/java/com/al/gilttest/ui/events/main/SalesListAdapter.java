package com.al.gilttest.ui.events.main;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.al.gilttest.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SalesListAdapter extends RecyclerView.Adapter<SalesListAdapter.ViewHolder> {

    private List<SalesVM> sales;

    public SalesListAdapter(List<SalesVM> sales) {
        this.sales = sales;
    }

    @Override
    public SalesListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sales_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SalesVM sale = sales.get(position);
        Picasso.with(holder.itemView.getContext()).load(sale.getImageUrl()).into(holder.img);
        holder.saleName.setText(sale.getName());
        holder.saleEnds.setText(sale.getEnds());
    }

    @Override
    public int getItemCount() {
        return sales.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.sale_image)
        ImageView img;
        @BindView(R.id.sale_name)
        TextView saleName;
        @BindView(R.id.sale_ends)
        TextView saleEnds;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
