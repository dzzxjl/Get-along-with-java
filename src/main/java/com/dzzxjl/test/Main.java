package com.dzzxjl.test;


import java.io.Serializable;
import java.util.Formatter;

import static spark.Spark.get;
import static spark.Spark.port;


class A {
    int a;
    A(int a ) {
        this.a = a;
    }
}

class B extends A {
    B(int a) {
        super(a);
    }
}

public class Main implements Serializable{

    public static void main(String[] args) {
//        port(8080);
//        get("/hello",(req,res) -> "Hello World");
//        get("/test/:name",(req,res) -> "Hello " + req.params(":name") + req.ip());

        final int a;
        a = 5;
        System.out.println(a);

    }

}
