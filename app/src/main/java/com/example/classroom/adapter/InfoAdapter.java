package com.example.classroom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.classroom.R;
import com.example.classroom.base.Result;
import com.youth.banner.Banner;

import java.util.List;

public class InfoAdapter extends BaseAdapter {
    public InfoAdapter(List mData, Context context) {
        super(mData, context);
    }



    @Override
    protected int getLatyou(int viewType) {
        return R.layout.layout_hovle;
    }

    @Override
    protected void bind(Object date, VH vh, int position) {
        //Result result= (Result) date;
        Integer integer= (Integer) date;
        ImageView viewById = vh.itemView.findViewById(R.id.iv_horiz);
        viewById.setBackgroundResource(integer);

    }

}
