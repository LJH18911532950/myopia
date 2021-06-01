package com.example.classroom.personter;


import com.example.classroom.Mdelo.RecommendModel;
import com.example.classroom.interfacer.Classback;
import com.example.classroom.interfacer.IHome;

public class RecommendPersenter implements IHome.Persenter {
    IHome.View view;
    IHome.Mdelo mdelo;

    public RecommendPersenter(IHome.View view) {
        this.view = view;
        this.mdelo =new RecommendModel();
    }



}
