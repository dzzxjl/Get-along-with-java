package com.dzzxjl.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dog {
    private String name;
    private Integer age;

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
        dog.setAge(15);
        Class<?> clazz = dog.getClass();
        try {
            Method method = clazz.getMethod("getAge");
            try {
                method.invoke(dog);
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
