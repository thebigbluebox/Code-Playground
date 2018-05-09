package CTCI.CH7.q7_3;

import java.util.List;

/**
 * This class represents a single song
 */
public class Song {
    private String name;
    private List<Artist> artists;
    private Album album;

    public Song(String name, Album album, List<Artist> artists){
        this.name = name;
        this.album = album;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public Album getAlbum() {
        return album;
    }

    public List<Artist> getArtists() {
        return artists;
    }
}
