package com.youthfireit.ponnobd.roomdata.models;

import com.google.gson.annotations.SerializedName;

public class ShippingLines {


    @SerializedName("method_id")
    private String methodId;
    @SerializedName("method_title")
    private String methodTitle;
    @SerializedName("total")
    private String total;

    public ShippingLines(String methodId,
                         String methodTitle, String total) {
        this.methodId = methodId;
        this.methodTitle = methodTitle;
        this.total = total;
    }

    public String getMethodId() {
        return methodId;
    }

    public String getMethodTitle() {
        return methodTitle;
    }

    public String getTotal() {
        return total;
    }
}

