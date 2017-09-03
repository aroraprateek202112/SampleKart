package com.prateek.samplekart.interfaces;

/**
 * Created by Prateek on 03-09-2017.
 */

public interface IModel {

    int MODEL_TYPE_POPULAR_PRODUCT = 1;
    int MODEL_TYPE_CATEGORY = 2;
    int MODEL_TYPE_ITEM = 3;

    String getTitle();
    int getImageResId();
    int getModelType();

}
