package com.dzzxjl.ser;

import java.io.*;

class Data implements Serializable{
    int a;
    Data(int a) {
        this.a = a;
    }
}

class Worm implements Serializable{
    String name;
    Data[] data = new Data[]{
            new Data(1),
            new Data(2),
            new Data(3)
    };
    Worm(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        Worm worm = new Worm("test");
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("worm.out")
        );
        out.writeObject("Worm Storage!");
        out.writeObject(worm);
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("worm.out")
        );
        String s = (String) in.readObject();
        worm = (Worm) in.readObject();
        System.out.println(worm);
    }
}
