package com.czb.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    A a;
    @Inject
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAComponent.builder().build().inject(this);

        a.field = "test";
        String aStr = gson.toJson(a);
        Log.e("mainactivity","astr = "+aStr);

        a.doSomething();


    }
}
