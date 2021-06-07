package com.example.tugas_uts_10118348.ui.home;

//NIM :10118348
//Nama :Muhammad Novel Z
//Kelas:IF8
//Tanggal Pengerjaan :05-06-2021

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nim :10118348");
    }

    public LiveData<String> getText() {
        return mText;
    }
}