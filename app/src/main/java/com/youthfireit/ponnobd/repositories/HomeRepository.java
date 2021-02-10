package com.youthfireit.ponnobd.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeRepository {


    private PonnobdAPI api;
    private LiveData<List<Products>> products;



    public HomeRepository(Application application) {

        api = APIInstance.retroInstance().create(PonnobdAPI.class);

    }








}
