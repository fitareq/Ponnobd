package com.youthfireit.ponnobd.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "product_images")
public class ProductImages {

    @PrimaryKey
    private Integer id;
    private String date_created;
    private String date_created_gmt;
    private String date_modified;
    private String date_modified_gmt;
    @PrimaryKey
    private String src;
    private String name;
    private String alt;



    public ProductImages(Integer id, String date_created, String date_created_gmt, String date_modified,
                         String date_modified_gmt, String src, String name, String alt) {

        this.id = id;
        this.date_created = date_created;
        this.date_created_gmt = date_created_gmt;
        this.date_modified = date_modified;
        this.date_modified_gmt = date_modified_gmt;
        this.src = src;
        this.name = name;
        this.alt = alt;
    }



    public Integer getId() {

        return id;
    }



    public String getDate_created() {

        return date_created;
    }



    public String getDate_created_gmt() {

        return date_created_gmt;
    }



    public String getDate_modified() {

        return date_modified;
    }



    public String getDate_modified_gmt() {

        return date_modified_gmt;
    }



    public String getSrc() {

        return src;
    }



    public String getName() {

        return name;
    }



    public String getAlt() {

        return alt;
    }




}
