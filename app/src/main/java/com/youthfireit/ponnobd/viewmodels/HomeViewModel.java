package com.youthfireit.ponnobd.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.repositories.HomeRepository;

import java.util.List;


public class HomeViewModel extends AndroidViewModel {


    private HomeRepository repository;
    private LiveData<List<Products>> products;



    public HomeViewModel(Application application) {

        super(application);
        repository = new HomeRepository(application);
        products = repository.getProducts();
    }



    public LiveData<List<Products>> getProducts() {

        return products;
    }


public void loadProducts(int page)
{
    repository.loadProducts(page);
}

}
