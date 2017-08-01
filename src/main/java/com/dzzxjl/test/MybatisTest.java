package com.dzzxjl.test;

import com.dzzxjl.dao.SongDao;
import com.dzzxjl.pojo.Song;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //SqlSessionFactoryBuilder
        //用接口去实现一个类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            SongDao songDao = session.getMapper(SongDao.class);
            Song song = songDao.selectSong(1);
            System.out.println(song.getId());
            System.out.println(song.getSongName());
            System.out.println(song);
        } finally {
            session.close();
        }

        System.out.println("连接成功");
    }
}
