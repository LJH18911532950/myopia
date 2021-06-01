package com.example.classroom.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.classroom.R;


public class BlankFragment2 extends Fragment {


    private TextView tvQingkou;
    private TextView tvNianji2;
    private ImageView ivXuanze1;
    private TextView tvXueke2;
    private ImageView ivXuanze2;
    private TextView tvShuzhangjie2;
    private ImageView ivXuanze3;
    private EditText etTesx;
    private ImageView ivLuyin;
    private Button bofan;
    private ImageView ivTianjia;
    private PopupWindow popupWindow;
    private RelativeLayout relop;
    private TextView tvXueke;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        relop = (RelativeLayout) view.findViewById(R.id.relop);
        tvQingkou = (TextView) view.findViewById(R.id.tv_qingkou);
        tvNianji2 = (TextView) view.findViewById(R.id.tv_nianji2);
        ivXuanze1 = (ImageView) view.findViewById(R.id.iv_xuanze1);
        tvXueke2 = (TextView) view.findViewById(R.id.tv_xueke2);
        ivXuanze2 = (ImageView) view.findViewById(R.id.iv_xuanze2);
        tvShuzhangjie2 = (TextView) view.findViewById(R.id.tv_shuzhangjie2);
        ivXuanze3 = (ImageView) view.findViewById(R.id.iv_xuanze3);
        etTesx = (EditText) view.findViewById(R.id.et_tesx);
        ivLuyin = (ImageView) view.findViewById(R.id.iv_luyin);
        bofan = (Button) view.findViewById(R.id.bofan);
        ivTianjia = (ImageView) view.findViewById(R.id.iv_tianjia);
        ivXuanze1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // btn1.setBackground(getResources().getDrawable(R.drawable.buttonstyle2));
                initPopp();
            }
        });



    }

    private void initPopp() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_popp, null);
        ImageView iv_guanbi = view.findViewById(R.id.iv_guanbi);
        popupWindow = new PopupWindow(view, GridView.LayoutParams.MATCH_PARENT, GridView.LayoutParams.WRAP_CONTENT);
        iv_guanbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.showAtLocation(relop, Gravity.BOTTOM, 0, 0);
        //popupWindow.showAtLocation(frok, Gravity.CENTER, 0, 0);

    }

    private static final String TAG = "BlankFragment2";
}