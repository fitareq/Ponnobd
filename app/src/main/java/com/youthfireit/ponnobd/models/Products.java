package com.youthfireit.ponnobd.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Products {


    @SerializedName("id")
    private final Integer productId;


    @SerializedName("name")
    private final String productName;


    @SerializedName("slug")
    private final String productSlug;


    @SerializedName("date_created")
    private final String productdateCreated;


    @SerializedName("date_created_gmt")
    private final String productDateCreatedGmt;


    @SerializedName("date_modified")
    private final String productDateModified;


    @SerializedName("date_modified_gmt")
    private final String productDateModifiedGmt;


    @SerializedName("type")
    private final String productType;


    @SerializedName("status")
    private final String productStatus;


    @SerializedName("featured")
    private final Boolean productFeatured;


    @SerializedName("catalog_visibility")
    private final String productCatalogVisibility;

    @SerializedName("description")
    private final String productDescription;

    @SerializedName("short_description")
    private final String productShortDescription;

    @SerializedName("sku")
    private final String productSku;

    @SerializedName("price")
    private final String productPrice;

    @SerializedName("regular_price")
    private final String productRegularPrice;

    @SerializedName("sale_price")
    private final String productSalePrice;

    @SerializedName("date_on_sale_from")
    private final String productDateOnSaleFrom;

    @SerializedName("date_on_sale_from_gmt")
    private final String productDateOnSaleFromGmt;

    @SerializedName("date_on_sale_to")
    private final String productDateOnSaleTo;

    @SerializedName("date_on_sale_to_gmt")
    private final String productDateOnSaleToGmt;

    @SerializedName("on_sale")
    private final Boolean productDateOnSale;

    @SerializedName("purchasable")
    private final Boolean productPurchasable;

    @SerializedName("total_sales")
    private final Integer productTotalSales;

    @SerializedName("stock_quantity")
    private final String productStockQuantity;

    @SerializedName("reviews_allowed")
    private final Boolean productReviewsAllowed;

    @SerializedName("average_rating")
    private final String productAverageRating;

    @SerializedName("rating_count")
    private final Integer productRatingCount;


    @SerializedName("related_ids")
    private final List<Integer> productRelatedIds;

    @SerializedName("stock_status")
    private final String productStockStatus;


    @SerializedName("images")
    private final List<ProductImages> productImages;



    public Products(Integer productId, String productName, String productSlug, String productdateCreated,
                    String productDateCreatedGmt, String productDateModified, String productDateModifiedGmt,
                    String productType, String productStatus, Boolean productFeatured, String productCatalogVisibility,
                    String productDescription, String productShortDescription, String productSku, String productPrice,
                    String productRegularPrice, String productSalePrice, String productDateOnSaleFrom,
                    String productDateOnSaleFromGmt, String productDateOnSaleTo, String productDateOnSaleToGmt,
                    Boolean productDateOnSale, Boolean productPurchasable, Integer productTotalSales,
                    String productStockQuantity, Boolean productReviewsAllowed, String productAverageRating,
                    Integer productRatingCount, List<Integer> productRelatedIds, String productStockStatus,
                    List<ProductImages> productImages) {

        this.productId = productId;
        this.productName = productName;
        this.productSlug = productSlug;
        this.productdateCreated = productdateCreated;
        this.productDateCreatedGmt = productDateCreatedGmt;
        this.productDateModified = productDateModified;
        this.productDateModifiedGmt = productDateModifiedGmt;
        this.productType = productType;
        this.productStatus = productStatus;
        this.productFeatured = productFeatured;
        this.productCatalogVisibility = productCatalogVisibility;
        this.productDescription = productDescription;
        this.productShortDescription = productShortDescription;
        this.productSku = productSku;
        this.productPrice = productPrice;
        this.productRegularPrice = productRegularPrice;
        this.productSalePrice = productSalePrice;
        this.productDateOnSaleFrom = productDateOnSaleFrom;
        this.productDateOnSaleFromGmt = productDateOnSaleFromGmt;
        this.productDateOnSaleTo = productDateOnSaleTo;
        this.productDateOnSaleToGmt = productDateOnSaleToGmt;
        this.productDateOnSale = productDateOnSale;
        this.productPurchasable = productPurchasable;
        this.productTotalSales = productTotalSales;
        this.productStockQuantity = productStockQuantity;
        this.productReviewsAllowed = productReviewsAllowed;
        this.productAverageRating = productAverageRating;
        this.productRatingCount = productRatingCount;
        this.productRelatedIds = productRelatedIds;
        this.productStockStatus = productStockStatus;
        this.productImages = productImages;
    }



    public Integer getProductId() {

        return productId;
    }



    public String getProductName() {

        return productName;
    }



    public String getProductSlug() {

        return productSlug;
    }



    public String getProductdateCreated() {

        return productdateCreated;
    }



    public String getProductDateCreatedGmt() {

        return productDateCreatedGmt;
    }



    public String getProductDateModified() {

        return productDateModified;
    }



    public String getProductDateModifiedGmt() {

        return productDateModifiedGmt;
    }



    public String getProductType() {

        return productType;
    }



    public String getProductStatus() {

        return productStatus;
    }



    public Boolean getProductFeatured() {

        return productFeatured;
    }



    public String getProductCatalogVisibility() {

        return productCatalogVisibility;
    }



    public String getProductDescription() {

        return productDescription;
    }



    public String getProductShortDescription() {

        return productShortDescription;
    }



    public String getProductSku() {

        return productSku;
    }



    public String getProductPrice() {

        return productPrice;
    }



    public String getProductRegularPrice() {

        return productRegularPrice;
    }



    public String getProductSalePrice() {

        return productSalePrice;
    }



    public String getProductDateOnSaleFrom() {

        return productDateOnSaleFrom;
    }



    public String getProductDateOnSaleFromGmt() {

        return productDateOnSaleFromGmt;
    }



    public String getProductDateOnSaleTo() {

        return productDateOnSaleTo;
    }



    public String getProductDateOnSaleToGmt() {

        return productDateOnSaleToGmt;
    }



    public Boolean getProductDateOnSale() {

        return productDateOnSale;
    }



    public Boolean getProductPurchasable() {

        return productPurchasable;
    }



    public Integer getProductTotalSales() {

        return productTotalSales;
    }



    public String getProductStockQuantity() {

        return productStockQuantity;
    }



    public Boolean getProductReviewsAllowed() {

        return productReviewsAllowed;
    }



    public String getProductAverageRating() {

        return productAverageRating;
    }



    public Integer getProductRatingCount() {

        return productRatingCount;
    }



    public List<Integer> getProductRelatedIds() {

        return productRelatedIds;
    }



    public String getProductStockStatus() {

        return productStockStatus;
    }



    public List<ProductImages> getProductImages() {

        return productImages;
    }




}
