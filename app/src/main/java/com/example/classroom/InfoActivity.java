package com.example.classroom;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.classroom.fragment.BlankFragment;
import com.example.classroom.fragment.BlankFragment2;
import com.example.classroom.fragment.BlankFragment3;
import com.example.classroom.fragment.BlankFragment4;
import com.google.android.material.tabs.TabLayout;

public class InfoActivity extends AppCompatActivity {

    private FrameLayout fragment;
    private TabLayout tab;
    private BlankFragment blankFragment;
    private BlankFragment2 blankFragment2;
    private BlankFragment3 blankFragment3;
    private BlankFragment4 blankFragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("课堂").setIcon(R.drawable.ketang));
        tab.addTab(tab.newTab().setText("答疑").setIcon(R.drawable.danyi));
        tab.addTab(tab.newTab().setText("活动").setIcon(R.drawable.houdong));
        tab.addTab(tab.newTab().setText("我的").setIcon(R.drawable.wode));
        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();
        blankFragment3 = new BlankFragment3();
        blankFragment4 = new BlankFragment4();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment,blankFragment)
                .add(R.id.fragment,blankFragment2)
                .add(R.id.fragment,blankFragment3)
                .add(R.id.fragment,blankFragment4)
                .show(blankFragment)
                .hide(blankFragment3)
                .hide(blankFragment4)
                .hide(blankFragment2)
                .commit();
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        getSupportFragmentManager().beginTransaction()
                                .show(blankFragment)
                                .hide(blankFragment3)
                                .hide(blankFragment4)
                                .hide(blankFragment2)
                                .commit();
                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction()
                                .show(blankFragment2)
                                .hide(blankFragment3)
                                .hide(blankFragment4)
                                .hide(blankFragment)
                                .commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction()
                                .show(blankFragment3)
                                .hide(blankFragment)
                                .hide(blankFragment4)
                                .hide(blankFragment2)
                                .commit();
                        break;
                    case 3:
                        getSupportFragmentManager().beginTransaction()
                                .show(blankFragment4)
                                .hide(blankFragment3)
                                .hide(blankFragment)
                                .hide(blankFragment2)
                                .commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}