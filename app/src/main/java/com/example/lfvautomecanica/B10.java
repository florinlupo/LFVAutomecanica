package com.example.lfvautomecanica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10);
        Button bb1 = findViewById(R.id.inainte10);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10.this, B11.class);
                startActivity(intent);
            }
        });
        Button bb2 = findViewById(R.id.inapoi10);
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10.this, B9.class);
                startActivity(intent);
            }
        });

    }
}