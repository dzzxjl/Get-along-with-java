package com.dzzxjl.test;


import java.io.Serializable;
import java.util.Formatter;

import static spark.Spark.get;
import static spark.Spark.port;


public class Main implements Serializable{

    public static void main(String[] args) {
//        port(8080);
//        get("/hello",(req,res) -> "Hello World");
//        get("/test/:name",(req,res) -> "Hello " + req.params(":name") + req.ip());
        Formatter f = new Formatter();
        System.out.println(f.format("hello, %s ","world"));

    }

}
