package com.youthfireit.ponnobd.utills;

public interface NavRoutes {

    interface HomeFragmentEvents
    {
        void loadSingleProduct(int id);
    }
    interface ProductsAdapterEvents
    {
        void itemClickListener(int id);
    }

}
