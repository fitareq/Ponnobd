package com.youthfireit.ponnobd;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.youthfireit.ponnobd.models.Products;

import java.util.List;


@Dao
public interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllProducts(List<Products> products);

    @Query("SELECT * FROM all_products")
    LiveData<List<Products>> getAllProducts();

}
