package com.dzzxjl.dao;

import com.dzzxjl.pojo.Song;

/**
 * 映射器实例，映射器是创建用来绑定映射语句的接口
 *
 */
public interface SongDao {
    Song selectSong(Integer  id);
}
