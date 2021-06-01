package com.example.classroom.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.example.classroom.R;

import java.util.List;

public class TushuAdapter extends BaseAdapter {
    public TushuAdapter(List mData, Context context) {
        super(mData, context);
    }



    @Override
    protected int getLatyou(int viewType) {
        return R.layout.layout_hovle;
    }

    @Override
    protected void bind(Object date, VH vh, int position) {
//        Result result= (Result) date;
        ImageView viewById = vh.itemView.findViewById(R.id.iv_horiz);
        viewById.setBackgroundResource(R.mipmap.ic_launcher);

    }

}
