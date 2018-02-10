package com.example.android.miwok;

/**
 * Created by genetrinks on 2/7/18.
 */


public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;


    // constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }


    //Getters
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

}
