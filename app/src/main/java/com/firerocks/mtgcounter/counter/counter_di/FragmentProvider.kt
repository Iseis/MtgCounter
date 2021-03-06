package com.firerocks.mtgcounter.counter.counter_di

import com.firerocks.mtgcounter.counter.view.CounterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProvider {

    @ContributesAndroidInjector(modules = [CounterModule::class])
    abstract fun provideCounterFragment() : CounterFragment
}