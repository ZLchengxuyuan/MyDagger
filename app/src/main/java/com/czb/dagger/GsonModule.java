package com.czb.dagger;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2018/5/15.
 */
@Module
public class GsonModule {

    @Provides
    public Gson provideGson(){
        return new Gson();
    }

}
