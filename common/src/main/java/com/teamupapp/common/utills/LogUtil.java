package com.teamupapp.common.utills;

import android.util.Log;

import com.teamupapp.common.BuildConfig;

/**
 * author: Lotus
 * time: 18-10-20
 * description: 日志工具
 **/

public class LogUtil {

    private static final String TAG = "TeamUpApp";

    private static boolean isOpen = false;

    public static void d(String msg) {
        if (isOpen || BuildConfig.DEBUG)
            Log.d(TAG, msg);
    }

    public static void e(String msg) {
        if (isOpen || BuildConfig.DEBUG)
            Log.e(TAG, msg);
    }

    public static void e(String msg, Throwable tr) {
        if (isOpen || BuildConfig.DEBUG)
            Log.e(TAG, msg, tr);
    }

    public static void setOpen(boolean isOpen) {
        LogUtil.isOpen = isOpen;
    }

}