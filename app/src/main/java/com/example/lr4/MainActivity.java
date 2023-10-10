package com.example.lr4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn_morning(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("FROM","перешли на УТРО");

        startActivity(intent);
    }


    public void btn_day(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityDAY.class);
        intent.putExtra("FROM","перешли на ДЕНЬ");

        startActivity(intent);
    }

    public void btn_evening(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityEvening.class);
        intent.putExtra("FROM","перешли на ВЕЧЕР");
        startActivity(intent);
    }

    public void btn_night(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityNight.class);
        intent.putExtra("FROM","перешли на НОЧЬ");
        startActivity(intent);
    }
}