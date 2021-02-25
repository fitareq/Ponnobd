package com.youthfireit.ponnobd.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.youthfireit.ponnobd.adapter.CategoryAdapter;
import com.youthfireit.ponnobd.adapter.ProductsAdapter;
import com.youthfireit.ponnobd.databinding.FragmentHomeBinding;
import com.youthfireit.ponnobd.roomdata.models.Categories;
import com.youthfireit.ponnobd.roomdata.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;
import com.youthfireit.ponnobd.utills.NavRoutes;
import com.youthfireit.ponnobd.viewmodels.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment implements ProductsAdapter.ProductAdapterListener, NavRoutes.ProductsAdapterEvents {


    private FragmentHomeBinding binding;
    private RecyclerView.LayoutManager layoutManager, categoryManager;
    private ProductsAdapter adapter;
    private CategoryAdapter categoryAdapter;
    private HomeViewModel viewModel;
    private PonnobdAPI api;
    private List<Products> products = new ArrayList<>();
    private int page = 1;
    private int position;
    private NavRoutes.HomeFragmentEvents homeFragmentEvents;



    public HomeFragment(NavRoutes.HomeFragmentEvents homeFragmentEvents) {
        // Required empty public constructor
        this.homeFragmentEvents = homeFragmentEvents;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();


        /*binding.swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                *//*display(1);*//*
                binding.swipeRefreshLayout.setEnabled(false);

            }
        });*/
        binding.topRatedProductsRview.setHasFixedSize(true);
        binding.categoriesRecyclerview.setHasFixedSize(true);
        //binding.categoriesRecyclerview.setNestedScrollingEnabled(false);
        binding.topRatedProductsRview.setNestedScrollingEnabled(false);
        categoryManager = new GridLayoutManager(getContext(),5,RecyclerView.VERTICAL,false);
        layoutManager = new GridLayoutManager(getContext(), 2, RecyclerView.VERTICAL, false);
        binding.topRatedProductsRview.setLayoutManager(layoutManager);
        binding.categoriesRecyclerview.setLayoutManager(categoryManager);

        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        /*display(1);*/
       /* viewModel.getProducts().observe(getViewLifecycleOwner(),products -> {
            adapter = new ProductsAdapter(products);
            binding.productRecyclerview.setAdapter(adapter);
        });*/


        binding.nestedScroll.setSmoothScrollingEnabled(true);

        binding.nestedScroll.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                /*String i = scrollX+"@"+scrollY+"@"+oldScrollX+"@"+oldScrollY;
                Toast.makeText(getContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();*/
                if (scrollY>oldScrollY)
                    binding.appbarLayout.setVisibility(View.GONE);
                else binding.appbarLayout.setVisibility(View.VISIBLE);
            }
        });
        api = APIInstance.retroInstance().create(PonnobdAPI.class);
        binding.topRatedProductsRview.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {

                super.onScrollStateChanged(recyclerView, newState);


            }
        });

        displayProducts(page);
        displayCategories();

        return v;
    }



    private void displayCategories()
    {
        Call<List<Categories>> call = api.getAllCategory();
        call.enqueue(new Callback<List<Categories>>() {
            @Override
            public void onResponse(Call<List<Categories>> call, Response<List<Categories>> response) {
                if (response.isSuccessful()) {

                    if (response.body()!=null) {

                        categoryAdapter = new CategoryAdapter(response.body());
                        binding.categoriesRecyclerview.setAdapter(categoryAdapter);
                    }
                }
            }


            @Override
            public void onFailure(Call<List<Categories>> call, Throwable t) {

                Toast.makeText(getContext(), "Sunam", Toast.LENGTH_SHORT).show();
            }
        });
    }



    void displayProducts(int page)
    {
        Call<List<Products>> call = api.getAllProducts(page);
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {
                if (response.isSuccessful()) {

                    if (response.body()!=null) {
                        products.addAll(response.body());
                        adapter = new ProductsAdapter(products, HomeFragment.this,HomeFragment.this);
                        binding.topRatedProductsRview.setAdapter(adapter);
                        binding.progressBar.setVisibility(View.GONE);
                        binding.topRatedProductsRview.setVisibility(View.VISIBLE);
                    }
                }
            }


            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {

                binding.progressBar.setVisibility(View.GONE);
            }
        });
    }



    @Override
    public void productScrollPosition(int position) {
        this.position = position;

    }



    @Override
    public void itemClickListener(int id) {
        homeFragmentEvents.loadSingleProduct(id);
    }

/*void display(int page)
{
    viewModel.loadProducts(page);
}*/


}