package com.example.andre.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void test() {
        int i = 6;
        i = i + 4;
    }

    private void test2() {
        int i2 = 5;
        int i3 = i2 + 3;

    }

    private void test3() {
        int i1 = 8;
        int i2 = i1 +5;
    }
}
