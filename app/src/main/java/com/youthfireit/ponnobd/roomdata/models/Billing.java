package com.youthfireit.ponnobd.roomdata.models;


import com.google.gson.annotations.SerializedName;



public class Billing {


    @SerializedName("first_name")

    private final String firstName;
    @SerializedName("last_name")
    private final String lastName;
    @SerializedName("address_1")
    private final String address1;
    @SerializedName("address_2")
    private final String address2;
    @SerializedName("city")
    private final String city;
    @SerializedName("state")
    private final String state;
    @SerializedName("postcode")
    private final String postcode;
    @SerializedName("country")
    private final String country;
    @SerializedName("email")
    private final String email;
    @SerializedName("phone")
    private final String phone;

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

