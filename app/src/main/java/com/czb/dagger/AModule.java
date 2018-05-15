package com.czb.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2018/5/15.
 */

@Module//// TODO: 2018/5/15 生成实例
public class AModule {

    @Provides//// TODO: 2018/5/15 对外提供实例方法的注解
    public A provideA(){
        return new A();
    }

}
