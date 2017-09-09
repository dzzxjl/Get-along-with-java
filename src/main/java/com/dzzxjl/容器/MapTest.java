package com.dzzxjl.容器;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<>();
        map.put("name", "yanghaoyu");
        map.put("age", "12");
        map.put("sex", "male");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
