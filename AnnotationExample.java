package io.reactivex.annotations;

import java.lang.annotation.*;

import io.reactivex.schedulers.Schedulers;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface AnnotationExample {
    String NAME = "NAME";
    String value();
}