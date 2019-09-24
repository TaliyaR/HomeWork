package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        findViewById(R.id.button4).setOnClickListener(v -> {
            Intent intent = new Intent(this, FifthActivity.class);
            startActivity(intent);
        });
    }
}
