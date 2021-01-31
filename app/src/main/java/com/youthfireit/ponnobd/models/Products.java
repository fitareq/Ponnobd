package com.youthfireit.ponnobd.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "all_products")
public class Products {


    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private Integer productId;

    @ColumnInfo(name = "name")
    @SerializedName("name")
    private String productName;

    @ColumnInfo(name = "slug")
    @SerializedName("slug")
    private String productSlug;

    @ColumnInfo(name = "date_created")
    @SerializedName("date_created")
    private String productdateCreated;

    @ColumnInfo(name = "date_created_gmt")
    @SerializedName("date_created_gmt")
    private String productDateCreatedGmt;

    @ColumnInfo(name = "date_modified")
    @SerializedName("date_modified")
    private String productDateModified;

    @ColumnInfo(name = "date_modified_gmt")
    @SerializedName("date_modified_gmt")
    private String productDateModifiedGmt;

    @ColumnInfo(name = "type")
    @SerializedName("type")
    private String productType;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    private String productStatus;

    @ColumnInfo(name = "featured")
    @SerializedName("featured")
    private Boolean productFeatured;

    @ColumnInfo(name = "catalog_visibility")
    @SerializedName("catalog_visibility")
    private String productCatalogVisibility;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    private String productDescription;

    @ColumnInfo(name = "short_description")
    @SerializedName("short_description")
    private String productShortDescription;

    @ColumnInfo(name = "sku")
    @SerializedName("sku")
    private String productSku;

    @ColumnInfo(name = "price")
    @SerializedName("price")
    private String productPrice;

    @ColumnInfo(name = "regular_price")
    @SerializedName("regular_price")
    private String productRegularPrice;

    @ColumnInfo(name = "sale_price")
    @SerializedName("sale_price")
    private String productSalePrice;

    @ColumnInfo(name = "date_on_sale_from")
    @SerializedName("date_on_sale_from")
    private String productDateOnSaleFrom;

    @ColumnInfo(name = "date_on_sale_from_gmt")
    @SerializedName("date_on_sale_from_gmt")
    private String productDateOnSaleFromGmt;

    @ColumnInfo(name = "date_on_sale_to")
    @SerializedName("date_on_sale_to")
    private String productDateOnSaleTo;

    @ColumnInfo(name = "date_on_sale_to_gmt")
    @SerializedName("date_on_sale_to_gmt")
    private String productDateOnSaleToGmt;

    @ColumnInfo(name = "on_sale")
    @SerializedName("on_sale")
    private Boolean productDateOnSale;

    @ColumnInfo(name = "purchasable")
    @SerializedName("purchasable")
    private Boolean productPurchasable;

    @ColumnInfo(name = "total_sales")
    @SerializedName("total_sales")
    private Integer productTotalSales;

    @ColumnInfo(name = "stock_quantity")
    @SerializedName("stock_quantity")
    private String productStockQuantity;

    @ColumnInfo(name = "reviews_allowed")
    @SerializedName("reviews_allowed")
    private Boolean productReviewsAllowed;

    @ColumnInfo(name = "average_rating")
    @SerializedName("average_rating")
    private String productAverageRating;

    @ColumnInfo(name = "rating_count")
    @SerializedName("rating_count")
    private Integer productRatingCount;

    @Ignore
    @ColumnInfo(name = "related_ids")
    @SerializedName("related_ids")
    private List<Integer> productRelatedIds;

    @ColumnInfo(name = "stock_status")
    @SerializedName("stock_status")
    private String productStockStatus;

    @Ignore
    @ColumnInfo(name = "images")
    @SerializedName("images")
    private List<ProductImages> productImages;



    public Products(Integer productId, String productName, String productSlug, String productdateCreated, String productDateCreatedGmt,
                    String productDateModified, String productDateModifiedGmt, String productType, String productStatus, Boolean productFeatured,
                    String productCatalogVisibility, String productDescription, String productShortDescription, String productSku, String productPrice,
                    String productRegularPrice, String productSalePrice, String productDateOnSaleFrom, String productDateOnSaleFromGmt,
                    String productDateOnSaleTo, String productDateOnSaleToGmt, Boolean productDateOnSale, Boolean productPurchasable,
                    Integer productTotalSales, String productStockQuantity, Boolean productReviewsAllowed, String productAverageRating,
                    Integer productRatingCount, List<Integer> productRelatedIds, String productStockStatus, List<ProductImages> productImages) {

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
