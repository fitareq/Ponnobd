package com.youthfireit.ponnobd.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.databinding.FragmentSingleProductBinding;


public class SingleProductFragment extends Fragment {



    FragmentSingleProductBinding binding;
    public SingleProductFragment() {
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


    }




}