package com.czb.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Frank on 2018/5/15.
 */
//// TODO: 2018/5/15 实体类
public class A {
    public String field;

    @Inject
    public A(){

    }
    public void doSomething(){
        Log.e("TAG", "do something");
    }
}
