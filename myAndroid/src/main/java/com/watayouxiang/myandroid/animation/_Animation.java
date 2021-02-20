package com.watayouxiang.myandroid.animation;

import com.watayouxiang.common.Const;
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
public class _Animation extends ListActivity {
    @Override
    protected ListData getListData() {
        return new ListData()
                .addWeb(this, "「view code」", Const.animation_url)
                .addSection("Knowledge Point")
                .addActivity(this, AnimationDrawableActivity.class)
                .addActivity(this, AnimationActivity.class)
                .addActivity(this, AnimatorActivity.class)
                .addSection("Exercises")
                .addActivity(this, TidaAnimatorActivity.class)
                .addSection("Summary")
                .addWeb(this, Const.animation_url + "/动画概括.txt")
                ;
    }
}