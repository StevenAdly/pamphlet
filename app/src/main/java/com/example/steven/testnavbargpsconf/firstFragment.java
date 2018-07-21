package com.example.steven.testnavbargpsconf;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by steven on 9/14/2017.
 */

public class firstFragment extends Fragment {

View myView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       myView= inflater.inflate(R.layout.first_layer,container,false);
        return myView;
    }
}
