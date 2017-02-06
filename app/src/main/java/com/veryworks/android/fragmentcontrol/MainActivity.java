package com.veryworks.android.fragmentcontrol;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.Listener, DetailFragment.OnDetailListener{

    // datas 변수를 MainActivity 에 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. 프래그먼트 생성

        // 2. 프래그먼트 매니저 가져오기

        // 3. 프래그먼트를 실행하기위한 트랜잭션 시작

        // 4. 프래그먼트를 레이아웃에 add 한다

        // 5. git 의 commit 과 같은 기능

    }

    // 2. 인터페이스 구현
    @Override
    public String[] getData() {
        return null;
    }

    @Override
    public void goDetail(int position){

    }

    @Override
    public void goList(){

    }
}
