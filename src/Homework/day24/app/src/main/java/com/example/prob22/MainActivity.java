package com.example.prob22;

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

        Button rfBtn = (Button)findViewById(R.id.btn1);
        rfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ReinforcementActivity.class);

                startActivityForResult(
                        intent,
                        REQUEST_CODE_MENU
                );

            }
        });
    }

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

