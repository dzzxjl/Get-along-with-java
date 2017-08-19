package com.dzzxjl.reflection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/dzzxjl/Desktop/spring.txt");

        Properties springConfig = new Properties();
        try {
            springConfig.load(new FileInputStream(file));
            String className = (String) springConfig.get("class");
            String methodName = (String) springConfig.get("method");
            try {
            Class clazz = Class.forName(className);
                Method method = clazz.getMethod(methodName);
                Constructor c = clazz.getConstructor();
                Object service = c.newInstance();
                method.invoke(service);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
