package com.example.salesapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.salesapp.R;
import com.example.salesapp.fragment_place_order;

public class Fragment_Order extends Fragment {

    Button placeOrderBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment__order, container, false);

        placeOrderBtn = view.findViewById(R.id.place_order_btn);

        placeOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment placeOrderFragment = new fragment_place_order();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frame_moving, placeOrderFragment).commit();
            }
        });


        return view;
    }
}