package com.prateek.samplekart.model;

import com.prateek.samplekart.interfaces.IModel;

/**
 * Created by Prateek on 03-09-2017.
 */

public class BaseModel implements IModel {

    private String title;
    private int imageResId;
    private int modelType;

    public BaseModel(String title, int imageResId, int modelType) {
        this.title = title;
        this.imageResId = imageResId;
        this.modelType = modelType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public int getModelType() {
        return modelType;
    }

    public void setModelType(int modelType) {
        this.modelType = modelType;
    }
}
