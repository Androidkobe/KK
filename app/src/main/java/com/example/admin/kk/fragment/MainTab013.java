package com.example.admin.kk.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.admin.kk.Mapplication;
import com.example.admin.kk.R;

/**
 * Created by lihongl on 2017/6/24.
 * emile is 24107661@qq.com
 * @see 首页关注界面主体。显示了一个滚动vire
 */

@SuppressLint("ValidFragment")
public class MainTab013 extends BaseFragment{


    @Override
    protected void initViews() {
    }

    @Override
    protected void initEvents() {


    }

    @Override
    protected void init() {

    }

    @SuppressLint("ValidFragment")
    public MainTab013(Mapplication application, Activity activity, Context context)  {
        super(application, activity, context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.main_tab_013,null);
        return super.onCreateView(inflater, container, savedInstanceState);

    }

}
