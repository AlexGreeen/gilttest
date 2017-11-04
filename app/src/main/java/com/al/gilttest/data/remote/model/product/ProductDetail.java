
package com.al.gilttest.data.remote.model.product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ProductDetail implements Serializable {

    private final static long serialVersionUID = 3500841352560242066L;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("image_urls")
    @Expose
    private ImageUrls imageUrls;
    @SerializedName("skus")
    @Expose
    private List<Sku> skus = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ImageUrls imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

}
