package com.tvd12.properties.file.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates file or method is mapping to a property in properties file 
 * or properties object, or map. Can be used in conjunction with PropertyWrapper classes    
 * 
 * @author tavandung12
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Property {

    /**
     * Map to name of property
     * 
     * @return string value
     */
    public String value() default "";
    
}
