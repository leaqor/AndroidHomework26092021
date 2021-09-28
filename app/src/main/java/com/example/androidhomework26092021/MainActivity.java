package com.example.androidhomework26092021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button evaluateBtn = findViewById(R.id.evaluate_btn);

        evaluateBtn.setOnClickListener (v -> {
            setContentView(R.layout.activity_main2);
    });
    }

}
