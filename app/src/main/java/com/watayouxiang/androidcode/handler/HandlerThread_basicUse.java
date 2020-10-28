package com.watayouxiang.androidcode.handler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;

import java.util.Locale;

public class HandlerThread_basicUse implements View.OnClickListener {
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;

    public HandlerThread_basicUse() {
        // 创建并开启 handlerThread
        mHandlerThread = new HandlerThread("<<MyThread>>");
        mHandlerThread.start();

        // 只有开启线程后，调 handlerThread.getLooper() 才有值
        mHandler = new Handler(mHandlerThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                ToastUtils.showShort(String.format(Locale.getDefault(),
                        "%s: what = %d",
                        Thread.currentThread().getName(),
                        msg.what
                ));
            }
        };
    }

    @Override
    public void onClick(final View v) {
        mHandler.sendEmptyMessage(1001);
    }

    /**
     * 关闭 HandlerThread
     */
    public void closeHandlerThread() {
        // handlerThread 线程变量中的 Looper 关闭，线程也会退出
        // 方法1
        mHandler.getLooper().quit();
        // 方法2
        mHandlerThread.quit();
    }

}
