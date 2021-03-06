package org.zgl.http.desc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @作者： big
 * @创建时间： 2018/6/6
 * @文件描述：
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProxyService {
    String value() default "";//类说明
}
