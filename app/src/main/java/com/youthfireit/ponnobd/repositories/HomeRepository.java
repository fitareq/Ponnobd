package com.youthfireit.ponnobd.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.youthfireit.ponnobd.roomdata.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;

import java.util.List;


public class HomeRepository {


    private PonnobdAPI api;
    private LiveData<List<Products>> products;



    public HomeRepository(Application application) {

        api = APIInstance.retroInstance().create(PonnobdAPI.class);

    }








}
