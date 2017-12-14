package com.example.liboah.greendaodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button viewById = (Button) findViewById(R.id.aaa);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A.this, B.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        System.out.println("aaa");
        super.onRestart();
    }

    public static void main(String[] args) {
        long a = 1000;
        long b = 100;
        long c = a / b;
        System.out.println(c);
    }
}
