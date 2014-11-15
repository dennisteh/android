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

public class PromotionFragment extends Fragment{
    /**
     * Returns a new instance of this fragment for the given section number.
     */


    public static PromotionFragment newInstance() {
        PromotionFragment fragment = new PromotionFragment();
         return fragment;
    }

    public PromotionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_promotion, container,
                false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity11) activity).onSectionAttached(1);

    }
}

/**
 * A placeholder fragment containing a simple view.
 */


// public static class PlaceholderFragment extends Fragment {
/**
 * The fragment argument representing the section number for this
 * fragment.
 */
//    private static final String ARG_SECTION_NUMBER = "section_number";

/**
 * Returns a new instance of this fragment for the given section
 * number.
 */
//     public static PlaceholderFragment newInstance(int sectionNumber) {
//        PlaceholderFragment fragment = new PlaceholderFragment();
//        Bundle args = new Bundle();
//        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//        fragment.setArguments(args);
//        return fragment;
//    }

//     public PlaceholderFragment() {
//     }

//     @Override
//     public View onCreateView(LayoutInflater inflater, ViewGroup container,
//             Bundle savedInstanceState) {
//         View rootView = inflater.inflate(R.layout.fragment_my_activity11, container, false);
//         return rootView;
//     }

//     @Override
//     public void onAttach(Activity activity) {
//         super.onAttach(activity);
//         ((MyActivity11) activity).onSectionAttached(
//                 getArguments().getInt(ARG_SECTION_NUMBER));
//     }
// }
