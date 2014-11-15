package com.example.acer.myapplication;

/**
 * Created by Acer on 7/11/2014.
 */

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public class ReservationFragment extends Fragment{
    public static ReservationFragment newInstance() {
        ReservationFragment fragment = new ReservationFragment();
        return fragment;
    }

    public ReservationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_reservation, container,
                false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity11) activity).onSectionAttached(4);
    }
}
