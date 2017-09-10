package com.dzzxjl.文件IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) {
        try {
            try (RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/dzzxjl/Desktop/run.sh", "r");
            )
            {
                byte[] buf = new byte[1024];
                int bytesRead;

                while ((bytesRead = randomAccessFile.read(buf)) != -1) {
//                System.out.println(buf.toString());
                    String temp = new String(buf, 0, bytesRead);
                    System.out.println(temp);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
