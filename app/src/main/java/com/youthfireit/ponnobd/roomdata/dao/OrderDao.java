package com.youthfireit.ponnobd.roomdata.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.youthfireit.ponnobd.roomdata.models.Order;

import java.util.List;

@Dao
public interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertOrderList(List<Order> order);
    @Query("SELECT * FROM order_table")
    List<Order> getAllOrder();
}
