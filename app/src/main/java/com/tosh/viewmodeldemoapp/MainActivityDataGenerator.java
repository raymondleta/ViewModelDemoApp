package com.tosh.viewmodeldemoapp;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityDataGenerator extends ViewModel {
    private String TAG = this.getClass().getSimpleName();
    private String myRandomNumber;

    public String getNumber(){
        Log.i(TAG, "Get number");

        if (myRandomNumber == null){
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber(){
        Log.i(TAG, "Get number");
        Random random = new Random();
        myRandomNumber = "Number: " + (random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();

        Log.i(TAG, "ViewModel Destroyed");
    }
}
