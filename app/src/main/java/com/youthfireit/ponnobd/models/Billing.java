package com.youthfireit.ponnobd.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Billing {


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
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;

    public Billing(String firstName, String lastName, String address1, String address2,
                   String city, String state, String postcode, String country,
                   String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.email = email;
        this.phone = phone;

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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

