package com.changzheng.timechangetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by changzheng on 16/3/21.
 */
public class TimeChange extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        收到广播后做处理
        if (intent.getAction().equals(Intent.ACTION_TIME_CHANGED)){
            Toast.makeText(context,"时间改变",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context,"时区改变",Toast.LENGTH_SHORT).show();

        }
    }
}
