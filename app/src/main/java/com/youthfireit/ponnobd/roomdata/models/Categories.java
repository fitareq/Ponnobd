package com.youthfireit.ponnobd.roomdata.models;

import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "category_table")
public class Categories {

    @SerializedName("id")
    private final int id;
    @SerializedName("name")
    private final String name;
    @SerializedName("slug")
    private final String slug;
    @SerializedName("parent")
    private final int parent;
    @SerializedName("description")
    private final String description;
    @SerializedName("display")
    private final String display;
    @SerializedName("image")
    private final ProductImages image;


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
