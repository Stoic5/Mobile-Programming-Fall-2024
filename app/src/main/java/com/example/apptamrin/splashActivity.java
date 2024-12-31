package com.example.apptamrin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Handler handler1=new Handler();
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                Intent intent1=new Intent(splashActivity.this, MainActivity.class);
                    splashActivity.this.startActivity(intent1);
            }
        };
    handler1.postDelayed(runnable1,3000);
    }
}




