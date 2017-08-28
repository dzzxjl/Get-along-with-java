package com.dzzxjl.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dog {
    private String name;
    private Integer age;
    public Integer id = 1;

    Dog() {
        System.out.println("haha");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("dzzxjl");
        dog.setAge(15);
        Class<?> clazz = dog.getClass();
        try {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
//            System.out.println(clazz.getConstructor());
            Method method = clazz.getMethod("getAge");
            Method method1 = clazz.getMethod("getName");
//            Field field = clazz.getField("id");
            System.out.println(method.getParameterCount());
            System.out.println(method.getReturnType());
            try {
                method.invoke(dog);
                method1.invoke(dog);
                System.out.println(method.invoke(dog));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
