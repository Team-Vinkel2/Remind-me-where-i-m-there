package com.vinkel.remindmewheniamthere.config.di.modules;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import com.vinkel.remindmewheniamthere.config.di.annotations.ActivityContext;
import com.vinkel.remindmewheniamthere.providers.IntentFactory;
import com.vinkel.remindmewheniamthere.providers.base.IIntentFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Inject;

@Module
public class ActivityModule {
  private final Activity activity;
  private final FragmentManager fragmentManager;

  public ActivityModule(Activity activity, FragmentManager fragmentManager) {
    this.activity = activity;
    this.fragmentManager = fragmentManager;
  }

  @Provides
  Activity provideActivity() {
    return this.activity;
  }

  @Provides
  @ActivityContext
  Context provideActivityContext() {
    return this.activity;
  }

  @Provides
  FragmentManager provideFragmentManager() {
    return this.fragmentManager;
  }

  @Inject
  @Provides
  IIntentFactory provideIntentFactory(@ActivityContext Context context) {
    return new IntentFactory(context);
  }
}