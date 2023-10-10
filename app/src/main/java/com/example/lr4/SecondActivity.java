package com.example.lr4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void btn_day(View view) {
        Intent intent = new Intent(SecondActivity.this, ActivityDAY.class);
        intent.putExtra("FROM","перешли на ДЕНЬ");

        startActivity(intent);
    }
}