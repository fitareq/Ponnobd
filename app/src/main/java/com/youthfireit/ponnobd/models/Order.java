package com.youthfireit.ponnobd.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Order {

    @SerializedName("payment_method")
    private final String paymentMethod;

    @SerializedName("payment_method_title")
    private final String paymentMethodTitle;

    @SerializedName("set_paid")
    private final boolean setPaid;

    private final Billing billing;
    private final Shipping shipping;

    @SerializedName("line_items")
    private final List<LineItem> lineItem;

    @SerializedName("shipping_lines")
    private final List<ShippingLines> shippingLines;

    public Order(String paymentMethod, String paymentMethodTitle, boolean setPaid, Billing billing,
                 Shipping shipping, List<LineItem> lineItem, List<ShippingLines> shippingLines) {
        this.paymentMethod = paymentMethod;
        this.paymentMethodTitle = paymentMethodTitle;
        this.setPaid = setPaid;
        this.billing = billing;
        this.shipping = shipping;
        this.lineItem = lineItem;
        this.shippingLines = shippingLines;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentMethodTitle() {
        return paymentMethodTitle;
    }

    public boolean isSetPaid() {
        return setPaid;
    }

    public Billing getBilling() {
        return billing;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public List<LineItem> getLineItem() {
        return lineItem;
    }

    public List<ShippingLines> getShippingLines() {
        return shippingLines;
    }
}
