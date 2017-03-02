package com.vinkel.remindmewheniamthere.config.di.components;

import com.vinkel.remindmewheniamthere.config.di.modules.ActivityModule;
import com.vinkel.remindmewheniamthere.config.di.modules.AppConfigModule;
import com.vinkel.remindmewheniamthere.config.di.modules.AppModule;
import com.vinkel.remindmewheniamthere.config.di.modules.ModelFactoryModule;
import com.vinkel.remindmewheniamthere.config.di.modules.UtilsModule;
import dagger.Component;

@Component(modules = {AppModule.class, ModelFactoryModule.class, AppConfigModule.class, UtilsModule.class})
public interface AppComponent {
  ActivityComponent getActivityComponent(ActivityModule activityModule);
}
