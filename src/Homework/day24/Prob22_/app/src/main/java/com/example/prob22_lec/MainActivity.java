package com.example.prob22_lec;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menuBtn = (Button)findViewById(R.id.btn1);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*  Intent 는 Activity 의 Context 를 저장한다.
                    저번 시간에 학습한 Context Switching 개념에 입각하여
                    getApplicationContext() 를 통해서
                    현재 Context 를 백업하고
                    MenuActivity 로 제어권을 넘기도록 Intent 를 만든다.
                 */
                Intent intent = new Intent(
                        getApplicationContext(),
                        EnhanceActivity.class
                );
                /* 만든 Intent 를 통해 MenuActivity 를 호출한다.
                   Request Code 는 REQUEST_CODE_MENU 가 된다.
                 */
                startActivityForResult(
                        intent,
                        REQUEST_CODE_MENU
                );
            }
        });
    }

    @Override
    protected void onActivityResult(
            int requestCode,
            int resultCode,
            @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /*
                    REQUEST_CODE_MENU 같은 제어메시지!
                    제대로 동작하고 있는가?
                    하고 있는지 쉽게 알 수 있게 하기 위해서 개발할 때 작성.

         */

        if(requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(
                    getApplicationContext(),
                    "onActivityResult Called: " + requestCode,
                    Toast.LENGTH_SHORT
            ).show();

            if(resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                Toast.makeText(
                        getApplicationContext(),
                        "Response name: " + name,
                        Toast.LENGTH_SHORT
                ).show();
            }
        }
    }
}

