package com.example.activitycontext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
/* 문제 21. 오늘 우리는 Activity 를 동적으로 추가하는 방법을 배웠다.
            LayoutInflater 를 통해 Context 도 관리 할 수 있다.
            XML 의 도움 없이 버튼을 누르면
            계속 LinearLayout 이 추가되도록
            오늘의 예제 프로그램을 개조해보자!

            21th 날에 한 것과 오늘 한 것을 활용!
 */

public class MenuActivity extends AppCompatActivity {
    LinearLayout container;
    /* AndoriodManifest.xml 에 Activity -> Intent Filter -> Action
       쪽에서 MAIN 이 걸려 있을텐데 여기 Activity 의 이름을
       MenuActivity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        container = (LinearLayout)findViewById(R.id.container);

        Button btn = (Button)findViewById(R.id.btn);
        //setOnClickListener 버튼이 눌리면 동작해 주세요.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*LayoutInflater
                Layout 과 관련된 Context 를 모두 처리할 수 있는 것.
                 */
                LayoutInflater inflater = (LayoutInflater)getSystemService(
                        LAYOUT_INFLATER_SERVICE);
                /* container 는 LinearLayout 의 리소스

                  <LinearLayout 인 container 에
                  sub_res 라는 xml 을 배치하겠다는 의미.

        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/container"
        android:orientation="vertical"

        sub_res.xml

         /LinearLayout>

         이런느낌 */
                inflater.inflate(R.layout.sub_res, container, true);
                CheckBox box = container.findViewById(R.id.chk);
                box.setText("Load Complete");
            }
        });
    }
}

/* Context 란 무엇인가?
   우선 Multi Tasking 과 Context Switching 이라는 것을 알 필요가 있다.
   사람도 동시에 하는것처럼 보이지만 아주 빠르게 하나씩 하는 것과 같다.
   컴퓨터 또한 이것이 마찬가지다.
   (CPU 는 오직 한 순간에 한 가지 일만 처리한다.)

   요즘 나오는 CPU 는 대부분 2 ~ 3 GHz 를 지원한다.
   잠시 이야기가 나왔으니 단위에 대한 설명을 하도록 한다.
   KB = 10^3 byte, MB = 10^6 byte, GB = 10^9 byte
   즉 3 GHz = 3 * 10^9 byte 를 초당 처리함을 의미한다.
   그리고 이것의 단위는 Hz 이므로 주파수를 의미한다.
   어떤 주파수의 주기는 역수로 취급한다(정의임)
   그러므로 3 GHz 로 동작하는 CPU 는
   1 초에 30 억개의 명령을 처리할 수 있다.
   결국 명령 1개를 처리하는데는 1 / 30 억 초 밖에 걸리지 않는다.

   이 뜻은 하나 하나씩 아주 빠르게 처리하면
   사람은 느끼지도 못하는 사이에 모든 것이 동시에 처리되는 것처럼 보이게 만들 수 있다는 의미다.
   이것이 컴퓨터 분야에서 이야기하는 Multi Tasking(멀티 태스킹)의 정의다.

   다음으로 Context Switching 에 대한 것을 살펴보도록 한다.
   -> 데이터  무결성 보장,
   연산 레지스터를 운영체제가 저장 -> 이 행위 자체를 Context Switching 이라 함
   모든 프로세스는 Context 를 가지고 있다.
   그리고 프로세스는 CPU 의 추상화에 해당한다.
   --CPU의 소프트웨어 -> 프로세스
   (결국 프로세스는 CPU 를 차지하기 위해 경쟁한다.)

   A 라는 프로그램과 B 라는 프로그램이 존재한다.
   A 는 아래와 같은 작업을 한다.

   int a = 3;
   int c = b + a;

   B 는 아래와 같은 작업을 한다.

   1 번 라인 - int a = 4;
   2 번 라인 - int d = c + a;

   위에도 언급했듯이 프로세스는 CPU 를 얻기 위해 경쟁을 한다.
   (이것을 엄밀하게는 스케쥴링이라고 부르기도 한다)
   가정을 해보자!

   A 가 1 번 라인을 진행하고 제어권을 B 에게 빼앗겼다.
   (이런식으로 제어권이 넘어가는 과정 자체를 Context Switching 이라고 한다.
   물론 context 가 보호 받는다는 가정하에)
   여기서는 context 가 보호 받지 않는다고 가정하고 이야기를 진행한다.

   B 가 1 번 라인을 진행하고 다시 스케쥴링에 의해
   제어권이 A 로 넘어간 경우를 생각해보자!
   엄밀하게는 연산(범용) 레지스터에 이 정보가 저장되지만
   어셈블리어와 밀접하게 연관되어 있으므로 우리는 a 등의 변수로 설명을 하도록 한다.

   A 가 1 번을 진행하면 a = 3 이다.
    그러나 B 가 1 번을 하면서 a = 4 가 된다.
    그리고 다시 A 로 제어권이 돌아오면
    c = b + a 를 하게 되는데 a 는 3 이 아니라 4 다.
    그러므로 결국 의도치 않은 이상 동작을 하게 된다.
    (이러한 것을 데이터 무결성을 훼손한다고 한다.)

    결국 이를 방어하기 위해 탄생한 기법이 Context Switching 인데
    context(연산 레지스터, 메모리 정보 등등) 을
    백업해두고 프로세스의 제어권을 다시 획득하게 될 때
    백업해놨던 context 정보를 돌려주는 것이다.
    이를 적용하여 위의 문제를 다시 생각해보면 동작은 아래와 같다.

    A 가 1 번을 진행하여 a = 3 이다.
    B 로 제어권이 넘어가 a = 4 가 된다.
    다시 A 로 제어권이 넘어오면
    프로세스별로 저장되어 있는 context 를 찾아서 돌려주므로
    A 의 a = 3 으로 유지된다.
    그러므로 프로그램의 동작이 영향받는 것이 없어진다.

    스레드 - Mutex, Semaphore, Critical Section
    이 개념도 전부 Context Switching 에서 온다.
    Spinlock 이라는 개념이 또한 존재하는데 Spinlock는 연산이 단순함.
    Context Switching 을 굳이 할 필요가 없음.
    Context Switching 하는 비용이 더 들어서 손해임. 게임의 경우, 60 배 가량 성능 차이가 날 수 있다.

    결론: 연산이 간단하면 Spinlock 복잡하면 Mutex, Semaphore 써라.

    Mutex vs Spinlock 이 면접 문제에 자주 등장한다.
    누가 더 좋은지를 묻는 형식으로 말이다.
    ->  Context Switching 때문에 그때 그때 마다 다르다.
    Context Switching 무거워서 많이 일어나면 많이 일어날수록 성능이 떨어짐.
    (blocking?) ex) 와이파이 하는 앱이 있고 게임하는 앱이 있다.
    게임할 때 어떤 버튼을 안 눌렀더니 게임만 돌아가고 있음.
    와이파이 끊긴 채로 지혼자 돌아감 -> 게임이 끊김.

    대부분은 Context Switching 써야할 일이 많음.

   메인이 여러개가 돌아가고 있는 것이다.
   여기서 제일 큰 문제:
   A 와 B
   멀티태스킹을 하기 때문에 Context Switching 이 발생.
 */