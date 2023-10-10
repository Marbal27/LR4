package com.example.lr4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityNight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
    }

    public void btn_click(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityNight.this);
        builder.setTitle("Спишь?")
                .setIcon(R.drawable.s)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dialogInterface.cancel();
                        Intent intent = new Intent(ActivityNight.this, MainActivity.class);
                        intent.putExtra("FROM","перешли на главный экран");

                        startActivity(intent);

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}