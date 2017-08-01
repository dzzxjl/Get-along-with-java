package com.dzzxjl.test;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());

        jedis.set("name","yanghaoyu");
        System.out.println(jedis.get("name"));
        jedis.lpush("char","a");
        jedis.lpush("char","b");
        jedis.lpush("char","c");

        List<String> list = jedis.lrange("char",0,2);
        for (String temp : list){
            System.out.println(temp);
        }
    }
}
