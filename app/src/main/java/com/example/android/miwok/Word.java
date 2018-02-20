package com.example.android.miwok;

/**
 * Created by genetrinks on 2/7/18.
 */

public class Word {

    private static final int NO_IMAGE_ASSIGNED = 0;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mDrawableImageResourceID;

    // constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        // we'll leave the resourceID as 0 in this case
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mDrawableImageResourceID = imageResourceID;
    }


    //Getters
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getDrawableImageResourceID() {
        return mDrawableImageResourceID;
    }

    public boolean hasImage() {
        return (mDrawableImageResourceID != NO_IMAGE_ASSIGNED);
    }

}
