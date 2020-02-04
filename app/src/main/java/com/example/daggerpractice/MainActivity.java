package com.example.daggerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerpractice.car.Car;
import com.example.daggerpractice.dagger.CarComponent;
import com.example.daggerpractice.dagger.DaggerCarComponent;
import com.example.daggerpractice.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(200))
                .build();
        carComponent.inject(this);

        car.drive();
    }
}
