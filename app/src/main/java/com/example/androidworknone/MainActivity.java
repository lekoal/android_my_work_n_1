package com.example.androidworknone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // активация макета задания 1
        setContentView(R.layout.activity_main_2); // активация макета задания 2
    }
}