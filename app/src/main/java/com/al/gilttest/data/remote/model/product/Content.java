
package com.al.gilttest.data.remote.model.product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Content implements Serializable {

    private final static long serialVersionUID = -1687428582251129781L;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("origin")
    @Expose
    private String origin;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
