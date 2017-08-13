package com.dzzxjl.接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Runner {
    void run();
}

class Person implements Runner{
    public void run() {
        System.out.println("person run");
    }
}

class Dog implements Runner {
    public void run() {
        System.out.println("dog run");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<Runner>();
        Person person = new Person();
        Dog dog = new Dog();
        runners.add(person);
        runners.add(dog);
        Iterator<Runner> iterator = runners.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
    }
}
