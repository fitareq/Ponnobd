package com.youthfireit.ponnobd.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.adapter.ProductsAdapter;
import com.youthfireit.ponnobd.databinding.FragmentHomeBinding;
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
    private RecyclerView.LayoutManager layoutManager;
    private ProductsAdapter adapter;


    private HomeViewModel viewModel;



    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();


        binding.swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                display(1);

            }
        });
        binding.productRecyclerview.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getContext(), 2, RecyclerView.VERTICAL, false);
        binding.productRecyclerview.setLayoutManager(layoutManager);

        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        display(1);
        viewModel.getProducts().observe(getViewLifecycleOwner(),products -> {
            adapter = new ProductsAdapter(products);
            binding.productRecyclerview.setAdapter(adapter);
        });







        /*PonnobdAPI api = APIInstance.retroInstance().create(PonnobdAPI.class);
        Call<List<Products>> call = api.getAllProducts(1);
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {
                if (response.isSuccessful())
                {

                    adapter = new ProductsAdapter(response.body());
                    binding.productRecyclerview.setAdapter(adapter);
                }
            }



            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {

            }
        });*/
        return v;
    }

void display(int page)
{
    viewModel.loadProducts(page);
}


}