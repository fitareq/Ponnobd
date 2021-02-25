package com.youthfireit.ponnobd.roomdata;


import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;

import com.youthfireit.ponnobd.roomdata.dao.CategoryDao;
import com.youthfireit.ponnobd.roomdata.dao.OrderDao;
import com.youthfireit.ponnobd.roomdata.dao.ProductsDao;
import com.youthfireit.ponnobd.roomdata.models.Categories;
import com.youthfireit.ponnobd.roomdata.models.Order;
import com.youthfireit.ponnobd.roomdata.models.Products;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Products.class, Order.class, Categories.class},version = 1, exportSchema = false)
public abstract class LocalDatabase {

    public abstract ProductsDao productsDao();
    public abstract OrderDao orderDao();
    public abstract CategoryDao categoryDao();

    public static volatile LocalDatabase INSTANCE;
    public static final int NUMBER_OF_THREAD = 6;
    public static final ExecutorService databaseWriteExecutors = Executors.newFixedThreadPool(NUMBER_OF_THREAD);


    public static LocalDatabase getINSTANCE(Application application) {

        if (INSTANCE == null) {
            synchronized (LocalDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(application,
                            LocalDatabase.class,
                            "Ponnobd.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
