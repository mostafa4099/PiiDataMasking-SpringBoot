package com.mostafa.mask;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.mask.MaskData.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 3:53 PM
 */
@JacksonAnnotationsInside
@JsonSerialize(using = DataSerializer.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MaskData {
}
