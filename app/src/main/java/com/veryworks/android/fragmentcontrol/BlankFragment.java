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
import android.widget.TextView;


public class BlankFragment extends Fragment {

    RecyclerView recyclerView;
    private Listener mListener;
    String datas[];

    public BlankFragment() {
        // Required empty public constructor
    }

    // 프래그먼트가 Activity에서 호출되는순간, 호출한 Activity의 Context가 넘어온다
    @Override
    public void onAttach(Context context) { //
        super.onAttach(context);
        // 넘어온 activity를 Listener 로 캐스팅해서 mListener 변수에 담아둔다
        // 3. 사용하는 사용자측에서 인터페이스 필터링...
        mListener = (Listener) context;
        datas = mListener.getData();
    }

    // 1. 인터페이스 정의
    // 나를 호출하는 activity에서 구현해야되는 인터페이스
    public interface Listener {
        String[] getData();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        // 1. 리사이클러뷰 가져오기
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        // 2. 아답터 생성
        ListAdapter adapter = new ListAdapter();
        // 3. 뷰에 아답터 세팅
        recyclerView.setAdapter(adapter);
        // 4. 레이아웃 매니저 세팅
        recyclerView.setLayoutManager(new LinearLayoutManager( getContext() ));

        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    // 리사이클러뷰 아답터를 생성합니다. (Music Adapter 를 복사해서 사용해도 됩니다)
    public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder>{

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            String item = datas[position];
            holder.title.setText(item);
        }

        @Override
        public int getItemCount() {
            return datas.length;
        }

        class Holder extends RecyclerView.ViewHolder {
            TextView title;
            public Holder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.title);
            }
        }
    }
}
