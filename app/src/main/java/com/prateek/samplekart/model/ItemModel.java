package com.prateek.samplekart.model;

import com.prateek.samplekart.interfaces.IModel;

/**
 * Created by Prateek on 03-09-2017.
 */

public class ItemModel extends BaseModel {

    private int categoryId;

    public ItemModel(String title, int imageResId, int categoryId) {
        super(title, imageResId, IModel.MODEL_TYPE_ITEM);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
