
package com.al.gilttest.data.remote.model.product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Sku implements Serializable {

    private final static long serialVersionUID = -3580812896144406836L;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("inventory_status")
    @Expose
    private String inventoryStatus;
    @SerializedName("msrp_price")
    @Expose
    private String msrpPrice;
    @SerializedName("sale_price")
    @Expose
    private String salePrice;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getMsrpPrice() {
        return msrpPrice;
    }

    public void setMsrpPrice(String msrpPrice) {
        this.msrpPrice = msrpPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

}
