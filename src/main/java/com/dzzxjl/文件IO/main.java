package com.dzzxjl.文件IO;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException{
        // IO源
        File file = new File("/Users/dzzxjl/Desktop/run.sh");
        try {
            // 水管
            FileReader fileReader = new FileReader(file);
            // 水池缓冲器
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //临时存取读取的每一行的值
            String temp;
            while ( (temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
            /*
            关闭操作
             */
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
