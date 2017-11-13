package com.al.gilttest.ui.events.main;

import com.al.gilttest.data.remote.model.salesResponse.SalesResponse;

import java.util.ArrayList;
import java.util.List;

public class SalesListMapper {

    private SalesListMapper() {
    }

    public static List<SalesVM> mapToList(SalesResponse r) {
        List<SalesVM> list = new ArrayList<>();
        for (int i = 0; i < r.sales.size(); i++) {
            String name = r.sales.get(i).name;
            String sale = r.sales.get(i).sale;
            String saleKey = r.sales.get(i).saleKey;
            String store = r.sales.get(i).store;
            String description = r.sales.get(i).description;
            String saleUrl = r.sales.get(i).saleUrl;
            String begins = r.sales.get(i).begins;
            String ends = r.sales.get(i).ends;
            String imgUrl = r.sales.get(i).imageUrls._1024x320.get(0).url;
            Integer imgWidth = r.sales.get(i).imageUrls._1024x320.get(0).width;
            Integer imgHeight = r.sales.get(i).imageUrls._1024x320.get(0).height;

            list.add(new SalesVM(name, sale, saleKey, store, description, saleUrl, begins, ends, imgUrl, imgWidth, imgHeight));
        }
        return list;
    }
}
