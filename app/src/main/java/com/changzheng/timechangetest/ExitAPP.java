package com.changzheng.timechangetest;

import android.app.Activity;
import android.app.Application;

import java.util.Stack;

/**
 * Created by changzheng on 16/3/21.
 * 完成退出app的操作,activity栈的添加与删除
 */
public class ExitAPP extends Application{
    private Stack<Activity> stack;
    @Override
    public void onCreate() {
        stack=new Stack<Activity>();
    }
//添加activity实例到栈中
    public void addStack(Activity activity){
        stack.addElement(activity);
    }

//    把activity实例栈出栈
    public void delActivity(Activity activity){
        stack.remove(activity);
    }
//   退出系统时,遍历stack栈中引用的activity实例,并且结束activity生命周期
    public void exitSystem(){
        for (Activity activity:stack){
            if (activity!=null){
                activity.finish();
            }
        }
    }
}
