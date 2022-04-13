package com.example.schoolplanner.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SubjectsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SubjectsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is subjects fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}