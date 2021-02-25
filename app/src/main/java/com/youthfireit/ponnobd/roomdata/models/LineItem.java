package com.youthfireit.ponnobd.roomdata.models;

import com.google.gson.annotations.SerializedName;

public class LineItem {

        @SerializedName("product_id")
        private Integer productId;

        @SerializedName("quantity")
        private Integer quantity;

    public LineItem(Integer productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}

