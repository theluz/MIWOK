package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Luz on 20/03/2018.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private Context mContext;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;
    private int mAudioResourceId;


    public Word (String defaultTranslation, String miwokTranlation, int audioResourceId){
        mMiwokTranslation = miwokTranlation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    public String getDefaultText (){
        return mDefaultTranslation;
    }

    public int getImageResourceId () { return mImageResourceID;}

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
        }

    public int getAudioResourceId() {return mAudioResourceId;}

}

