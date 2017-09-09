package com.dzzxjl.文件IO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class 管道同时写与读 {
    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(32 * 1024);
        try {
            try (FileChannel src = FileChannel.open(Paths.get("my.txt"), StandardOpenOption.READ);
                 FileChannel dest = FileChannel.open(Paths.get("dest.txt"), StandardOpenOption.WRITE,
                         StandardOpenOption.CREATE);)
            {
//                while (src.read(buffer) > 0|| buffer.position() != 0) {
//                    buffer.flip();
//                    dest.write(buffer);
//                    buffer.compact();
//                }


//              FileChannel中的传输方法
                src.transferTo(0, src.size(), dest);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
