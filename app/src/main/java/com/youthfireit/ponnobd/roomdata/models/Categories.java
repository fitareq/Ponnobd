package com.youthfireit.ponnobd.roomdata.models;

import com.google.gson.annotations.SerializedName;


public class Categories {

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("slug")
        private String slug;
        @SerializedName("parent")
        private int parent;
        @SerializedName("description")
        private String description;
        @SerializedName("display")
        private String display;
        @SerializedName("image")
        private ProductImages image;



    public Categories(int id, String name, String slug, int parent, String description, String display, ProductImages image) {

        this.id = id;
        this.name = name;
        this.slug = slug;
        this.parent = parent;
        this.description = description;
        this.display = display;
        this.image = image;
    }



    public int getId() {

        return id;
    }



    public String getName() {

        return name;
    }



    public String getSlug() {

        return slug;
    }



    public int getParent() {

        return parent;
    }



    public String getDescription() {

        return description;
    }



    public String getDisplay() {

        return display;
    }



    public ProductImages getImage() {

        return image;
    }




}
