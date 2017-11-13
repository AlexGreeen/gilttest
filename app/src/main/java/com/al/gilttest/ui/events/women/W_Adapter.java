package com.al.gilttest.ui.events.women;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.al.gilttest.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

class W_Adapter extends RecyclerView.Adapter<W_Adapter.ViewHolder> {

    private List<W_SalesVE> sales = new ArrayList<>();

    public W_Adapter(List<W_SalesVE> list) {
        this.sales = list;
    }

    @Override
    public W_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sales_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(W_Adapter.ViewHolder holder, int position) {
        W_SalesVE sale = sales.get(position);
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
