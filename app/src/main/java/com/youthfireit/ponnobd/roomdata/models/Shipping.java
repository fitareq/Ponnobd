package com.youthfireit.ponnobd.roomdata.models;

import com.google.gson.annotations.SerializedName;

public class Shipping {


    @SerializedName("first_name")

    private String firstName;
    @SerializedName("last_name")

    private String lastName;
    @SerializedName("address_1")

    private String address1;
    @SerializedName("address_2")

    private String address2;
    @SerializedName("city")

    private String city;
    @SerializedName("state")

    private String state;
    @SerializedName("postcode")
    private String postcode;
    @SerializedName("country")
    private String country;

    public Shipping(String firstName, String lastName, String address1, String address2,
                    String city, String state, String postcode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }
}

