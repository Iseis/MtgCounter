package com.firerocks.mtgcounter.counter.counter_di

import com.firerocks.mtgcounter.counter.CounterMVP
import com.firerocks.mtgcounter.counter.CounterPresenter
import com.firerocks.mtgcounter.counter.CounterFragment
import dagger.Module
import dagger.Provides

@Module
class CounterModule {

    @Provides
    fun provideCounterPresenter(): CounterMVP.Presenter = CounterPresenter()

    @Provides
    fun provideTwoPlayerFragment(fragment: CounterFragment): CounterFragment {
        return fragment
    }
}