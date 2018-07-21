package com.example.steven.testnavbargpsconf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by steven on 9/14/2017.
 */

public class fourthFragment extends Fragment {

View myView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       myView= inflater.inflate(R.layout.fourth_layer,container,false);
        return myView;
    }
}
