package com.prateek.samplekart.adapters.viewholders;

import android.view.View;

import com.prateek.samplekart.interfaces.IModel;
import com.prateek.samplekart.model.PopularProductModel;

/**
 * Created by Prateek on 04-09-2017.
 */

public class HomePagePopularProductListViewHolder extends HomePageGenericRecyclerViewHolder {

    public HomePagePopularProductListViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindValues(IModel model) {
        PopularProductModel popularProductModel = (PopularProductModel)model;
    }
}
