package CTCI.CH7.q7_3;

import java.util.Date;
import java.util.List;

public class Album {
    private String albumName;
    private int releaseDate;
    private List<Song> songs;

    public Album(String albumName, int releaseDate, List<Song> songs){
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.songs = songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(Song song){
        songs.add(song);
    }

}
