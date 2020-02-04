package com.example.daggerpractice.dagger;

import com.example.daggerpractice.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
