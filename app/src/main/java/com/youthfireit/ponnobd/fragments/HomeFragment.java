package com.youthfireit.ponnobd.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.adapter.CategoryAdapter;
import com.youthfireit.ponnobd.adapter.ProductsAdapter;
import com.youthfireit.ponnobd.databinding.FragmentHomeBinding;
import com.youthfireit.ponnobd.models.Categories;
import com.youthfireit.ponnobd.models.ProductImages;
import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;
import com.youthfireit.ponnobd.viewmodels.HomeViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    private RecyclerView.LayoutManager layoutManager, categoryManager;
    private ProductsAdapter adapter;
    private CategoryAdapter categoryAdapter;
    private HomeViewModel viewModel;
    private PonnobdAPI api;


    public HomeFragment() {
        // Required empty public constructor
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


        api = APIInstance.retroInstance().create(PonnobdAPI.class);
        displayProducts();
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



    void displayProducts()
    {
        Call<List<Products>> call = api.getAllProducts(1);
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {
                if (response.isSuccessful()) {

                    if (response.body()!=null) {

                        adapter = new ProductsAdapter(response.body());
                        binding.topRatedProductsRview.setAdapter(adapter);
                        binding.progressBar.setVisibility(View.GONE);
                        binding.topRatedProductsRview.setVisibility(View.VISIBLE);
                    }
                }
            }


            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {

                Toast.makeText(getContext(), "Sunam", Toast.LENGTH_SHORT).show();
            }
        });
    }

/*void display(int page)
{
    viewModel.loadProducts(page);
}*/


}