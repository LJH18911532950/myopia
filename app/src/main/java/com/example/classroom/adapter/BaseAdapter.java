package com.example.classroom.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<D> extends RecyclerView.Adapter {
    private List<D> mData;
    private Context context;

    public BaseAdapter(List<D> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(getLatyou(viewType), parent, false);
        return new VH(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        bind(mData.get(position), (VH) holder,position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textClass!=null){
                    textClass.TextClass(position);
                }
            }
        });

    }
    //接口回调
    public interface TextClass{
        void TextClass(int position);
    }
    private TextClass textClass;

    public void setTextClass(TextClass textClass) {
        this.textClass = textClass;
    }
    //数量
    @Override
    public int getItemCount() {
        return mData.size();
    }

    //xml
    protected abstract int getLatyou(int viewType);
    //适配器
    protected abstract void bind(D date, VH vh,int position);

    class VH extends RecyclerView.ViewHolder {
        SparseArray sparseArray = new SparseArray();

        public VH(@NonNull View itemView) {
            super(itemView);
        }

        public View getViewByid(int id) {
            View view = (View) sparseArray.get(id);
            if (view == null) {
                view = itemView.findViewById(id);
                sparseArray.append(id, view);
            }
            return view;
        }
    }

}
