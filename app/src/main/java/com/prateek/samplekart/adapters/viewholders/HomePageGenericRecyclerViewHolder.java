package com.prateek.samplekart.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.prateek.samplekart.R;
import com.prateek.samplekart.interfaces.IModel;

/**
 * Created by Prateek on 04-09-2017.
 */
public abstract class HomePageGenericRecyclerViewHolder extends RecyclerView.ViewHolder {
    public HomePageGenericRecyclerViewHolder(View itemView) {
        super(itemView);
    }

    abstract public void bindValues(IModel model);
}
