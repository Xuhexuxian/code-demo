package com.demo.util;

import org.dozer.Mapper;

public class DozerBeanMapperUtil {
    private DozerBeanMapperUtil() {
    }

    ;

    private final static Mapper mapper = new org.dozer.DozerBeanMapper();

    public static <T> T dozerBeanMapper(Object obj1, Class<T> obj2) {
        return mapper.map(obj1, obj2);
    }
}