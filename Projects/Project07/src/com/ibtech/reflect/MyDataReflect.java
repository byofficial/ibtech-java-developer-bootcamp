package com.ibtech.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyDataReflect {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException, NoSuchMethodException {

        Class<?> clazz = Class.forName("com.ibtech.source.MyData");
        Constructor<?> constructor = clazz.getConstructor();
        Object object = constructor.newInstance();

        for (Field field : clazz.getFields()) {
            System.out.println(field.getName() + " " + field.getType().getName());
        }

        Field myDoubleField = clazz.getField("myDouble");
        myDoubleField.set(object, 98.76);

        Object myDoubleValue = myDoubleField.get(object);
        System.out.println("İkişerim Değeri: " + myDoubleValue);

    }
}
