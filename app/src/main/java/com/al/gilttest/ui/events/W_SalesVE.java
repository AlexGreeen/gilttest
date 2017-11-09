package com.al.gilttest.ui.events;


import android.os.Parcel;
import android.os.Parcelable;

class W_SalesVE implements Parcelable {

    public static final Parcelable.Creator<W_SalesVE> CREATOR = new Parcelable.Creator<W_SalesVE>() {
        @Override
        public W_SalesVE createFromParcel(Parcel source) {
            return new W_SalesVE(source);
        }

        @Override
        public W_SalesVE[] newArray(int size) {
            return new W_SalesVE[size];
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

    public W_SalesVE() {
    }

    protected W_SalesVE(Parcel in) {
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
