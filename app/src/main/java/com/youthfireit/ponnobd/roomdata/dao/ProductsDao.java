package com.youthfireit.ponnobd.roomdata.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.youthfireit.ponnobd.roomdata.models.Products;

import java.util.List;

@Dao
public interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertProductList(List<Products> products);
    @Query("SELECT * FROM all_product")
    List<Products> getAllProducts();


}
