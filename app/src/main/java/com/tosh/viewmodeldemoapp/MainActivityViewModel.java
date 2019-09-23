package com.tosh.viewmodeldemoapp;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {
    private String TAG = this.getClass().getSimpleName();
    private MutableLiveData<String> myRandomNumber;

    public MutableLiveData<String> getNumber(){
        Log.i(TAG, "Get number");

        if (myRandomNumber == null){
            myRandomNumber = new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }

    public void createNumber(){
        Log.i(TAG, "Get number");
        Random random = new Random();
//        myRandomNumber = "Number: " + (random.nextInt(10-1)+1);
        myRandomNumber.setValue("Number: " + (random.nextInt(10-1)+1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();

        Log.i(TAG, "ViewModel Destroyed");
    }
}
