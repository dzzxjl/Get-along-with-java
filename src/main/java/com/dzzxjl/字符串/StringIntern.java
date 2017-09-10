package com.dzzxjl.字符串;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringIntern {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 200; i++) {
            char[] data = new char[128 * 1024];
            for (int j = 0; j < data.length; j++) {
                data[j] = (char)random.nextInt(32768);
            }
            list.add(new String(data).intern());
        }

//        Runnable
        // 检查字符串池里是否存在"abc"这么一个字符串，如果存在，就返回池里的字符串；如果不存在，该方法会把"abc"添加到字符串池中，然后再返回它的引用
    }
}
