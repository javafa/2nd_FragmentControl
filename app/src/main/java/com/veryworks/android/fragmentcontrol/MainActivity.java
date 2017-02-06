package com.veryworks.android.fragmentcontrol;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.Listener{

    // datas 변수를 MainActivity 에 정의
    String datas[] = {"월", "화", "수", "목", "금", "토", "일"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. 프래그먼트 생성
        BlankFragment fragment = new BlankFragment();

        // 2. 프래그먼트 매니저 가져오기
        // getFragmentManager(); // 앱호환성이 없는 함수
        FragmentManager manager = getSupportFragmentManager(); // 앱 호환성이 있는 매니저함수
        // 3. 프래그먼트를 실행하기위한 트랜잭션 시작
        FragmentTransaction transaction = manager.beginTransaction();
        // 4. 프래그먼트를 레이아웃에 add 한다
        transaction.replace(R.id.fragment ,fragment);
        // 5. git 의 commit 과 같은 기능
        transaction.commit();
    }

    // 2. 인터페이스 구현
    @Override
    public String[] getData() {
        return datas;
    }
}
