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

    RecyclerView recyclerView;
    private Listener mListener;
    String datas[];

    public ListFragment() {
        // Required empty public constructor
    }

    // 프래그먼트가 Activity에서 호출되는순간, 호출한 Activity의 Context가 넘어온다
    @Override
    public void onAttach(Context context) { //
        super.onAttach(context);

    }

    // 1. 인터페이스 정의
    // 나를 호출하는 activity에서 구현해야되는 인터페이스
    public interface Listener {
        public String[] getData();
        public void goDetail(int position);
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

    // 리사이클러뷰 아답터를 생성합니다. (Music Adapter 를 복사해서 사용해도 됩니다)
    public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder>{

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return datas.length;
        }

        class Holder extends RecyclerView.ViewHolder {

            public Holder(View itemView) {
                super(itemView);
            }
        }
    }
}
