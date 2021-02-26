package com.watayouxiang.myandroid.handler;

import com.watayouxiang.demoshell.ListActivity;
import com.watayouxiang.demoshell.ListData;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/02/19
 *     desc   :
 * </pre>
 */
public class HandlerDemo extends ListActivity {
    @Override
    protected ListData getListData() {
        return new ListData()
                .addClick(new Handler_basicUse())
                .addClick(new Handler_basicUse2())
                .addClick(new Handler_runOnUIThread())
                .addClick(new Handler_post())
                .addClick(new Handler_showToastOnThread())
                .addClick(new HandlerThread_basicUse())
                .addClick(new HandlerThread_basicUse2())
                ;
    }
}