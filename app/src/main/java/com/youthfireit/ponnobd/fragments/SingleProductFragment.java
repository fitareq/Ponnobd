package com.youthfireit.ponnobd.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.youthfireit.ponnobd.databinding.FragmentSingleProductBinding;
import com.youthfireit.ponnobd.roomdata.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SingleProductFragment extends Fragment {


    private FragmentSingleProductBinding binding;
    private int id;
    private PonnobdAPI api;



    public SingleProductFragment(int id) {

        this.id = id;
        api = APIInstance.retroInstance().create(PonnobdAPI.class);
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        binding = FragmentSingleProductBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();

        return v;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        Call<Products> call = api.getSingleProduct(id);
        call.enqueue(new Callback<Products>() {
            @Override
            public void onResponse(Call<Products> call, Response<Products> response) {

                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Products products = response.body();
                        String title = products.getProductName();
                        binding.singleProductTitle.setText(title);
                    }
                }
            }



            @Override
            public void onFailure(Call<Products> call, Throwable t) {

            }
        });

    }




}