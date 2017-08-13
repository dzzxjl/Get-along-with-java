package com.dzzxjl.泛型;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static <T extends Comparable<T>> void sort1(List<T> list){
        Collections.sort(list);
    }
    public static <T extends Comparable<? super T>> void sort2(List<T> list){
        Collections.sort(list);
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        sort1(animals);
        sort2(animals);


        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(1));
        dogs.add(new Dog(2));

        //无法使用，因为Comparable<T>中T需要的是Animal,而不是Dog
//        sort1(dogs);
        sort2(dogs);



    }

    static class Animal implements Comparable<Animal>{
        private int age;
        Animal(int age){
            this.age = age;
        }
        @Override
        public int compareTo(Animal o) {
            return this.age - o.age;
        }
    }
    static class Dog extends Animal {
        Dog(int age) {
            super(age);
        }
    }
}
