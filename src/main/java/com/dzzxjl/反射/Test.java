package com.dzzxjl.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);

        try {
            Method method = intList.getClass().getDeclaredMethod("add", Object.class);

            try {
                method.invoke(intList, "string1");
                method.invoke(intList, 0.5f);
//                method.getParameterCount()
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        for (Object i : intList) {
            System.out.println(i.toString());
        }
    }
}
