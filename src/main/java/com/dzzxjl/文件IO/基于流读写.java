package com.dzzxjl.文件IO;

import java.io.*;

public class 基于流读写 {
    public static void main(String[] args) {
        File file = new File("/Users/dzzxjl/Desktop/run.sh");
//        byte[] buffer = new byte[1024];
        byte[] buffer = new byte[128];
        try {

            FileInputStream inputStream = new FileInputStream(file);

            // read()的底层是由c++实现的，返回的是unsigned byte，取值范围为[0~255]
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);


            InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String temp;

            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
            bufferedReader.close();



//
//            int byteRead = 0;
//            // while循环内部仅执行了一次,buffer作为缓冲区
            // read()方法的返回值是每次调用成功读取的字节数
//            while ((byteRead = bufferedInputStream.read(buffer)) != -1) {
//                String temp = new String(buffer, 0, byteRead);
//                System.out.println(temp);
//                System.out.println("************");
//            }



            bufferedInputStream.close();

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
