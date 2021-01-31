package com.youthfireit.ponnobd;

import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.youthfireit.ponnobd.models.Products;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {Products.class}, version = 1, exportSchema = false)
public abstract class LocalDatabase extends RoomDatabase {


    public abstract ProductsDao productsDao();



    public static volatile LocalDatabase INSTANCE;
    public static final int NUMBER_OF_THREAD = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREAD);



    public static LocalDatabase getINSTANCE(Application application) {

        if (INSTANCE == null) {
            synchronized (LocalDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(application, LocalDatabase.class, "Ponnobd.db")
                                       .build();
                }
            }
        }
        return INSTANCE;
    }




}
