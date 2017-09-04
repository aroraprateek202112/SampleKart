package com.prateek.samplekart.model;

import com.prateek.samplekart.interfaces.IModel;

import java.util.List;

/**
 * Created by Prateek on 03-09-2017.
 */

public class PopularProductModel extends BaseModel {

    private List<ItemModel> itemList;

    public PopularProductModel(String title, int imageResId, List<ItemModel> itemList) {
        super(title, imageResId, IModel.MODEL_TYPE_POPULAR_PRODUCT);
    }

    public List<ItemModel> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemModel> itemList) {
        this.itemList = itemList;
    }
}
