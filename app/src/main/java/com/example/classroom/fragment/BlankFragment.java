package com.example.classroom.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.classroom.R;
import com.example.classroom.adapter.InfoAdapter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment extends Fragment {


    private Toolbar toobled;
    private RecyclerView recylr1;
    private ImageView ivTushuziyuan;
    private TextView tvMore;
    private RecyclerView recylr2;
    private ImageView ivJingpinkecheng;
    private TextView tvMore2;
    private RecyclerView recylr3;
    private ImageView ivShuzijiaoyu;
    private TextView tvMore3;
    private RecyclerView recylr4;
    private LinearLayoutManager linearLayoutManager;
    private LinearLayoutManager linearLayoutManager1;
    private LinearLayoutManager linearLayoutManager3;
    private LinearLayoutManager linearLayoutManager4;
    private Banner banneres;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank, container, false);
        initView(inflate);
        initDate();
        initBannerte();
        return inflate;
    }

    private void initDate() {
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        linearLayoutManager1 = new LinearLayoutManager(getContext());
        linearLayoutManager1.setOrientation(RecyclerView.HORIZONTAL);

        linearLayoutManager3 = new LinearLayoutManager(getContext());
        linearLayoutManager3.setOrientation(RecyclerView.HORIZONTAL);

        linearLayoutManager4 = new LinearLayoutManager(getContext());
        linearLayoutManager4.setOrientation(RecyclerView.HORIZONTAL);


        recylr1.setLayoutManager(linearLayoutManager);
        recylr2.setLayoutManager(linearLayoutManager1);
        recylr3.setLayoutManager(linearLayoutManager3);
        recylr4.setLayoutManager(linearLayoutManager4);
//        int[] i=new int[]{R.mipmap.ic_launcher};
//        List<int[]> list=new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            //list.add(i);
            list1.add(R.drawable.shuxue1);
        }
        Log.d(TAG, "initView: " + list1);
        InfoAdapter adapter = new InfoAdapter(list1, getContext());
        recylr1.setAdapter(adapter);
        recylr2.setAdapter(adapter);
        recylr3.setAdapter(adapter);
        recylr4.setAdapter(adapter);
    }

    private void initBannerte() {
        List<Integer>lists=new ArrayList<>();
        for(int i=0;i<5;i++){
            lists.add(R.drawable.yindaoye1);
        }
        banneres.setImages(lists);
        banneres.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Integer integer= (Integer) path;
                Glide.with(context).load(integer).into(imageView);
            }
        }).start();
    }

    private void initView(View inflate) {
        toobled = (Toolbar) inflate.findViewById(R.id.toobled);
        recylr1 = (RecyclerView) inflate.findViewById(R.id.recylr_1);
        tvMore = (TextView) inflate.findViewById(R.id.tv_more);
        recylr2 = (RecyclerView) inflate.findViewById(R.id.recylr_2);
        tvMore2 = (TextView) inflate.findViewById(R.id.tv_more_2);
        recylr3 = (RecyclerView) inflate.findViewById(R.id.recylr_3);
        tvMore3 = (TextView) inflate.findViewById(R.id.tv_more_3);
        recylr4 = (RecyclerView) inflate.findViewById(R.id.recylr_4);
        banneres = (Banner) inflate.findViewById(R.id.banneres);

    }

    private static final String TAG = "BlankFragment";
}