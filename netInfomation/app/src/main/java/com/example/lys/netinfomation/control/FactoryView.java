package com.example.lys.netinfomation.control;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Gt on 2017/5/5.
 */

//主管视图的工厂类
public class FactoryView {
    /**
     *从一个视图跳转到另外一个视图
     * @param srcView 当前视图的对象
     * @param cls  欲跳转视图的对象的class
     */
    public static void toView(Context srcView, Class<?> cls){
        Intent mIntent = new Intent();
        mIntent.setClass(srcView,cls);
        srcView.startActivity(mIntent);

    }
}
