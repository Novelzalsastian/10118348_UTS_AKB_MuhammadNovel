package com.example.tugas_uts_10118348.ui.notifications;

//NIM :10118348
//Nama :Muhammad Novel Z
//Kelas:IF8
//Tanggal Pengerjaan :05-06-2021

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Program Ini Dibuat Untuk Menyelesaikan Tugas UTS MataKuliah AKB,Dan Berfungsi Untuk Mencatat Segala Kegiatan Harian" +
                "Yang Akan Dan Nanti Akan Dilakukan Ketika Nanti Teringat Lagi Oleh Catatan Yang Telah Dibuat Dalam Program Ini.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}