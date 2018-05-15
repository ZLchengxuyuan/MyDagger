package com.czb.dagger;

import dagger.Component;

/**
 * Created by Frank on 2018/5/15.
 */
//// TODO: 2018/5/15 将MainActivity与A联系起来
@Component(modules = {AModule.class, GsonModule.class})
public interface AComponent {

    void inject(MainActivity activity);


}
