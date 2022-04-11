package com.sun.common_library.util;

import android.util.Log;

public class LogUtil {

    public static void e(String tag, String message) {
        Log.e("ME_" + tag, message);
    }
}
