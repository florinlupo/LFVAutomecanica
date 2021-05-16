package com.example.lfvautomecanica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cfinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfinal);
        Button bb1 = findViewById(R.id.paginap);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cfinal.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button bb2 = findViewById(R.id.reiab);
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cfinal.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        Button bb3 = findViewById(R.id.reiadela3);
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cfinal.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}