package com.example.prob22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReinforcementActivity {


    public class MenuActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rf);

            Button backBtn = (Button) findViewById(R.id.backBtn);
            backBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                /* Context 를 저장하는 것은 Intent 인데 비어져있다?
                   finish() 로 끝나기 때문에 저장이 필요 없기 때문.
                   그리고 다시 원래 Activity 로 귀환할 때
                   name 에 대한 값으로 back 을 전달한다.
                   (되돌아가기)를 눌렀다는 의미가 된다.
                   그리고 resultCode 로 RESULT_OK 를 전달한다.

                   --화면간의 전환--
                 */
                    Intent intent = new Intent();
                    intent.putExtra("name", "back");
                    setResult(RESULT_OK, intent);

                    finish();
                }
            });
        }
    }
}