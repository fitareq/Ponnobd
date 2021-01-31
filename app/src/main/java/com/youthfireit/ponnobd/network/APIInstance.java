package com.youthfireit.ponnobd.network;

import com.youthfireit.ponnobd.utills.ProjectConstants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIInstance {

    public static Retrofit retroInstance()
    {
        return new Retrofit.Builder()
                       .baseUrl(ProjectConstants.BASE_URL)
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();
    }

}
