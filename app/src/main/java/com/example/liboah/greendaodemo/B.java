package com.example.liboah.greendaodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B extends AppCompatActivity implements View.OnClickListener {

    private Button viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        viewById = ((Button) findViewById(R.id.bbb));
        viewById.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, A.class);
        startActivity(intent);
    }
}
