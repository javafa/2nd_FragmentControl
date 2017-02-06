package com.veryworks.android.fragmentcontrol;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ListFragment extends Fragment {

    public ListFragment() {
        // Required empty public constructor
    }

    // 프래그먼트가 Activity에서 호출되는순간, 호출한 Activity의 Context가 넘어온다
    @Override
    public void onAttach(Context context) { //
        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }
}
