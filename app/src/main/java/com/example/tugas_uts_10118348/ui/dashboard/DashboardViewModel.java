package com.example.tugas_uts_10118348.ui.dashboard;

//NIM :10118348
//Nama :Muhammad Novel Z
//Kelas:IF8
//Tanggal Pengerjaan :05-06-2021

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tekan Tombol Untuk Menambah Note");
    }

    public LiveData<String> getText() {
        return mText;
    }
}