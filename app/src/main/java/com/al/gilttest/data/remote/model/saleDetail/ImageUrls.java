
package com.al.gilttest.data.remote.model.saleDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ImageUrls implements Serializable {

    private final static long serialVersionUID = -2727505730647923532L;
    @SerializedName("91x121")
    @Expose
    private List<com.al.gilttest.data.remote.model.saleDetail._91x121> _91x121 = null;

    public List<com.al.gilttest.data.remote.model.saleDetail._91x121> get91x121() {
        return _91x121;
    }

    public void set91x121(List<com.al.gilttest.data.remote.model.saleDetail._91x121> _91x121) {
        this._91x121 = _91x121;
    }

}
