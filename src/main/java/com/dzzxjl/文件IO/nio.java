package com.dzzxjl.文件IO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/*
通道是Java NIO对I/O操作提供的另外一种新的抽象方式
 */
public class nio {
    public static void main(String[] args) {
        try {
            // 第一个参数是要打开的文件的路径
//            FileChannel channel = FileChannel.open(Paths.get("my.txt"),
//                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            FileChannel channel = FileChannel.open(Paths.get("my.txt"));

            ByteBuffer buffer = ByteBuffer.allocate(64);

            int bytesRead = channel.read(buffer);


//            buffer.putChar('A').flip();
            System.out.println(buffer.getChar());
//            channel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
