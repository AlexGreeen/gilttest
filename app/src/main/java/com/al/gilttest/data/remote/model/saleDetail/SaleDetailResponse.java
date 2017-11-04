package com.al.gilttest.data.remote.model.saleDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SaleDetailResponse {

    private final static long serialVersionUID = 1135857104287195137L;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sale")
    @Expose
    private String sale;
    @SerializedName("sale_key")
    @Expose
    private String saleKey;
    @SerializedName("store")
    @Expose
    private String store;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("sale_url")
    @Expose
    private String saleUrl;
    @SerializedName("begins")
    @Expose
    private String begins;
    @SerializedName("ends")
    @Expose
    private String ends;
    @SerializedName("image_urls")
    @Expose
    private ImageUrls imageUrls;
    @SerializedName("products")
    @Expose
    private List<String> products = null;

}
