package com.prateek.samplekart.model;

import com.prateek.samplekart.interfaces.IModel;

/**
 * Created by Prateek on 04-09-2017.
 */

public class CategoryModel extends BaseModel {

    public CategoryModel(String title, int imageResId) {
        super(title, imageResId, IModel.MODEL_TYPE_CATEGORY);
    }
}
