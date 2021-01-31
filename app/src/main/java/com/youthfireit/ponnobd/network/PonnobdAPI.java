package com.youthfireit.ponnobd.network;

import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.utills.ProjectConstants;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface PonnobdAPI {


    @GET("products?consumer_secret=" + ProjectConstants.COUSUMER_SECRET + "&consumer_key=" + ProjectConstants.COUSUMER_KEY)
    Call<List<Products>> getAllProducts(@Query("page") int page);




}
