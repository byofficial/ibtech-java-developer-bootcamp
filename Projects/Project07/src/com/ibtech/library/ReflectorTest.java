package com.ibtech.library;

import com.ibtech.source.MyBean;

import java.lang.reflect.InvocationTargetException;

public class ReflectorTest {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        ClassReflector classReflector = new ClassReflector(MyBean.class);
        Object object = classReflector.newInstance();

        classReflector.setValue(object, "myId", 123);
        System.out.println("Özdeşliğim: " + classReflector.getValue(object, "myId"));

        classReflector.setValue(object, "myName", "Godoro");
        System.out.println("Adım: " + classReflector.getValue(object, "myName"));

        classReflector.setValue(object, "myValue", 98.76);
        System.out.println("Adım: " + classReflector.getValue(object, "myValue"));
    }
}
