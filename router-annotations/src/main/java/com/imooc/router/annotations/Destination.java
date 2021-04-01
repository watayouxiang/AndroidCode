package com.imooc.router.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/04/01
 *     desc   :
 * </pre>
 */

/**
 * 说明当前注解可以修饰的元素，此处表示可以用于标记在类上面
 */
@Target({ElementType.TYPE})
/**
 * 说明当前注解可以被保留的时间
 */
@Retention(RetentionPolicy.CLASS)
public @interface Destination {
    /**
     * 当前页面的url，不能为空
     *
     * @return 页面的url
     */
    String url();

    /**
     * 对于当前页面的中文描述
     *
     * @return 例如："个人主页"
     */
    String description();
}
