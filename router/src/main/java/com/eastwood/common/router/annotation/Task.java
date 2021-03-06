package com.eastwood.common.router.annotation;

import com.eastwood.common.router.IRouterTask;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(METHOD)
@Retention(RUNTIME)
public @interface Task {
    Class<? extends IRouterTask>[] value();
}