package com.youthfireit.ponnobd.roomdata.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.youthfireit.ponnobd.roomdata.models.Categories;

import java.util.List;

@Dao
public interface CategoryDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertCategoryList(List<Categories> categories);
    @Query("SELECT * FROM category_table")
    List<Categories> getAllCategory();


}
