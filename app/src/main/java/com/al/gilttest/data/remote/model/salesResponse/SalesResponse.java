
package com.al.gilttest.data.remote.model.salesResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SalesResponse {

    public final static long serialVersionUID = -1955218291431272967L;
    @SerializedName("sales")
    @Expose
    public List<Sale> sales = null;

    public class Sale {

        public final static long serialVersionUID = -2494454537891142505L;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("sale")
        @Expose
        public String sale;
        @SerializedName("sale_key")
        @Expose
        public String saleKey;
        @SerializedName("store")
        @Expose
        public String store;
        @SerializedName("description")
        @Expose
        public String description;
        @SerializedName("sale_url")
        @Expose
        public String saleUrl;
        @SerializedName("begins")
        @Expose
        public String begins;
        @SerializedName("ends")
        @Expose
        public String ends;
        @SerializedName("image_urls")
        @Expose
        public ImageUrls imageUrls;

    }

    public class ImageUrls {

        public final static long serialVersionUID = 8454126933168445154L;
        @SerializedName("1024x320")
        @Expose
        public List<_1024x320> _1024x320 = null;

    }

    public class _1024x320 {

        public final static long serialVersionUID = -4407003245524285596L;
        @SerializedName("url")
        @Expose
        public String url;
        @SerializedName("width")
        @Expose
        public Integer width;
        @SerializedName("height")
        @Expose
        public Integer height;

    }
}
