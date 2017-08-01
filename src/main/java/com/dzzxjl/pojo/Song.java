package com.dzzxjl.pojo;

public class Song {
    private Integer id;
    private String songName;
    private String songSinger;
    private String songAddress;

    public Song() {

    }
    public Song(Integer id, String songName, String songSinger, String songAddress) {
        this.id = id;
        this.songName = songName;
        this.songSinger = songSinger;
        this.songAddress = songAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }

    public String getSongAddress() {
        return songAddress;
    }

    public void setSongAddress(String songAddress) {
        this.songAddress = songAddress;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", songSinger='" + songSinger + '\'' +
                ", songAddress='" + songAddress + '\'' +
                '}';
    }
}
