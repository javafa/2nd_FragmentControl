# Fragment Control
프래그먼트 동작구조를 이해합니다

## Fragment Life Cycle
첫번째 생명주기인 onAttach를 통해 호출한 Activity의 Context가 넘어온다

* onAttach(Context context) > onCreate > onCreateView > onActivityCreated > onStart > onResume > onPause > onStop > onDestroyView > onDestroy > onDetach

## Fragment Control
add 와 replace, remove 등을 통해 fragment를 Activity 화면에서 제어한다.
* Fragment add
```java
// 1. 프래그먼트 생성
Fragment fragment = new Fragment()
// 2. 프래그먼트를 실행하기위한 트랜잭션 시작
FragmentTransaction transaction = manager.beginTransaction();
// 3. 프래그먼트를 레이아웃에 add 한다
transaction.add(R.id.fragment, fragment);
// 4. addToBackStack을 호출하면 stack에 transaction 전체가 쌓인다
transaction.addToBackStack(null);
// 5. git 의 commit 과 같은 기능
transaction.commit();
```

* Fragment remove

addToBackStack 을 통해 stack을 이용했다면 단순히 onBackPressed 를 호출하는 것만으로 fragment를 제거할 수 있다
```java
// stack에 있는 프래그먼트 제거
super.onBackPressed();
```