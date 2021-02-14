package com.youthfireit.ponnobd.models;

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
        @SerializedName("menu_order")
        private int menuOrder;
        @SerializedName("count")
        private int count;

        /**
         * No args constructor for use in serialization
         *
         */
        public Categories() {
        }

        /**
         *
         * @param parent
         * @param image
         * @param menuOrder
         * @param display
         * @param name
         * @param count
         * @param description
         * @param id
         * @param slug
         */
        public Categories(int id, String name, String slug, int parent, String description, String display, ProductImages image, int menuOrder, int count) {
            super();
            this.id = id;
            this.name = name;
            this.slug = slug;
            this.parent = parent;
            this.description = description;
            this.display = display;
            this.image = image;
            this.menuOrder = menuOrder;
            this.count = count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getParent() {
            return parent;
        }

        public void setParent(int parent) {
            this.parent = parent;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDisplay() {
            return display;
        }

        public void setDisplay(String display) {
            this.display = display;
        }

        public ProductImages getImage() {
            return image;
        }

        public void setImage(ProductImages image) {
            this.image = image;
        }

        public int getMenuOrder() {
            return menuOrder;
        }

        public void setMenuOrder(int menuOrder) {
            this.menuOrder = menuOrder;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }


}
