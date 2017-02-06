package com.veryworks.android.fragmentcontrol;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DetailFragment extends Fragment {

    private OnDetailListener mListener;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    public interface OnDetailListener {
        void goList();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
