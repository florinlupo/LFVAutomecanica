package com.example.lfvautomecanica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Efinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efinal);
        Button bb1 = findViewById(R.id.pagp);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Efinal.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button bb2 = findViewById(R.id.BcaroserieE);
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Efinal.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        Button bb3 = findViewById(R.id.reiadela3);
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Efinal.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}