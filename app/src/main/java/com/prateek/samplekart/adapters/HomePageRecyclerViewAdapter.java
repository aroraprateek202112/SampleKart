package com.prateek.samplekart.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prateek.samplekart.R;
import com.prateek.samplekart.adapters.viewholders.HomePageCategoryItemViewHolder;
import com.prateek.samplekart.adapters.viewholders.HomePageGenericRecyclerViewHolder;
import com.prateek.samplekart.adapters.viewholders.HomePagePopularProductListViewHolder;
import com.prateek.samplekart.interfaces.IModel;

import java.util.List;

/**
 * Created by Prateek on 03-09-2017.
 */

public class HomePageRecyclerViewAdapter extends RecyclerView.Adapter<HomePageGenericRecyclerViewHolder> {

    private final Context mContext;
    private final LayoutInflater mInflater;
    private List<IModel> mList;

    public HomePageRecyclerViewAdapter(Context context, List<IModel> list) {
        mContext = context;
        mList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null && mList.size() > 0) {
            return mList.get(position).getModelType();
        }
        return super.getItemViewType(position);
    }

    @Override
    public HomePageGenericRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomePageGenericRecyclerViewHolder holder = null;
        View view = null;
        switch (viewType) {
            case IModel.MODEL_TYPE_CATEGORY:
                view = mInflater.inflate(R.layout.home_page_category_item_layout, parent, false);
                holder = new HomePageCategoryItemViewHolder(view);
                break;
            case IModel.MODEL_TYPE_POPULAR_PRODUCT:
                view = mInflater.inflate(R.layout.home_page_popular_product_list_layout, parent, false);
                holder = new HomePagePopularProductListViewHolder(view);
            default:
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(HomePageGenericRecyclerViewHolder holder, int position) {
        holder.bindValues(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    public void updateData(List<IModel> list) {
        mList = list;
        notifyDataSetChanged();
    }

}
