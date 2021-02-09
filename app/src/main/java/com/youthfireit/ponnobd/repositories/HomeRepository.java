package com.youthfireit.ponnobd.repositories;

import android.app.Application;

import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;


public class HomeRepository {


    private PonnobdAPI api;



    public HomeRepository(Application application) {

        api = APIInstance.retroInstance().create(PonnobdAPI.class);
    }




}
