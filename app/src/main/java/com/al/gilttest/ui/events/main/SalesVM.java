package com.al.gilttest.ui.events.main;


import android.os.Parcel;
import android.os.Parcelable;

public class SalesVM implements Parcelable {
    public static final Parcelable.Creator<SalesVM> CREATOR = new Parcelable.Creator<SalesVM>() {
        @Override
        public SalesVM createFromParcel(Parcel source) {
            return new SalesVM(source);
        }

        @Override
        public SalesVM[] newArray(int size) {
            return new SalesVM[size];
        }
    };
    private String name;
    private String sale;
    private String saleKey;
    private String store;
    private String description;
    private String saleUrl;
    private String begins;
    private String ends;
    private String imageUrl;
    private Integer imageWidth;
    private Integer imageHeight;

    public SalesVM(String name, String sale, String saleKey, String store, String description, String saleUrl, String begins, String ends, String imageUrl, Integer imageWidth, Integer imageHeight) {
        this.name = name;
        this.sale = sale;
        this.saleKey = saleKey;
        this.store = store;
        this.description = description;
        this.saleUrl = saleUrl;
        this.begins = begins;
        this.ends = ends;
        this.imageUrl = imageUrl;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    protected SalesVM(Parcel in) {
        this.name = in.readString();
        this.sale = in.readString();
        this.saleKey = in.readString();
        this.store = in.readString();
        this.description = in.readString();
        this.saleUrl = in.readString();
        this.begins = in.readString();
        this.ends = in.readString();
        this.imageUrl = in.readString();
        this.imageWidth = (Integer) in.readValue(Integer.class.getClassLoader());
        this.imageHeight = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.sale);
        dest.writeString(this.saleKey);
        dest.writeString(this.store);
        dest.writeString(this.description);
        dest.writeString(this.saleUrl);
        dest.writeString(this.begins);
        dest.writeString(this.ends);
        dest.writeString(this.imageUrl);
        dest.writeValue(this.imageWidth);
        dest.writeValue(this.imageHeight);
    }

    public String getName() {
        return name;
    }

    public String getSale() {
        return sale;
    }

    public String getSaleKey() {
        return saleKey;
    }

    public String getStore() {
        return store;
    }

    public String getDescription() {
        return description;
    }

    public String getSaleUrl() {
        return saleUrl;
    }

    public String getBegins() {
        return begins;
    }

    public String getEnds() {
        return ends;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }
}
