package com.example.liboah.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liboah.greendaodemo.proxy.ProxyHandler;
import com.example.liboah.greendaodemo.proxy.ProxyImpl;
import com.example.liboah.greendaodemo.proxy.RealSubject;
import com.example.liboah.greendaodemo.proxy.Subject;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
