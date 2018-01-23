package com.example.admin.hist;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 19.01.2018.
 */

public class TextFragment extends Fragment {

    static int currentLayout = R.layout.fragment_item;

    public TextFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(currentLayout, container, false);
    }
}
