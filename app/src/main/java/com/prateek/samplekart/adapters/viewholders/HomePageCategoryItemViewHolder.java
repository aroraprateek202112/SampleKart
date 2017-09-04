package com.prateek.samplekart.adapters.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.prateek.samplekart.R;
import com.prateek.samplekart.interfaces.IModel;

/**
 * Created by Prateek on 04-09-2017.
 */

public class HomePageCategoryItemViewHolder extends HomePageGenericRecyclerViewHolder {
    public TextView categoryTitleTv;
    public ImageView categoryIv;
    public HomePageCategoryItemViewHolder(View itemView) {
        super(itemView);

        categoryIv = itemView.findViewById(R.id.category_iv);
        categoryTitleTv = itemView.findViewById(R.id.category_title);
    }

    @Override
    public void bindValues(IModel model) {
        //                categoryIv.setImageResource(model.getImageResId());
        categoryTitleTv.setText(model.getTitle());
    }
}
