package com.youthfireit.ponnobd.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.youthfireit.ponnobd.LocalDatabase;
import com.youthfireit.ponnobd.ProductsDao;
import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeRepository {


    private Application application;
    private LiveData<List<Products>> products;
    private PonnobdAPI api;
    private ProductsDao productsDao;



    public HomeRepository(Application application) {


        this.application = application;
        LocalDatabase db = LocalDatabase.getINSTANCE(application);
        api = APIInstance.retroInstance().create(PonnobdAPI.class);

        productsDao = db.productsDao();
        products = productsDao.getAllProducts();


    }



    public LiveData<List<Products>> getProducts() {

        return products;
    }



   public void loadProducts(int page) {

        Call<List<Products>> call = api.getAllProducts(page);
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {

                if (response.isSuccessful()) {
                    if (response.body()!=null)
                        insertToLocalDB(response.body());
                }
            }



            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {

            }
        });
    }

    void insertToLocalDB(List<Products> products)
    {
        LocalDatabase.databaseWriteExecutor.execute(()->
        {
            productsDao.insertAllProducts(products);
        });
    }



}
