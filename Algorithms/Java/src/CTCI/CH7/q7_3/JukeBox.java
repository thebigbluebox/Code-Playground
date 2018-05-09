package CTCI.CH7.q7_3;

import java.util.List;

/**
 * This class outlines the JukeBox
 */
public class JukeBox {
    private List<Song> allSongs;
    private Song currentlyPlaying;
    private JukeBox jukeBoxInstance;
    private boolean isPlaying;

    public JukeBox(List<Song> allSongs) {
        this.allSongs = allSongs;
        if (getJukeBoxInstance() == null) {
            jukeBoxInstance = new JukeBox(allSongs);
        }
    }

    public JukeBox getJukeBoxInstance() {
        if (jukeBoxInstance != null) {
            return jukeBoxInstance;
        }
        return null;
    }

    public void addSong(Song song) {
        allSongs.add(song);
    }

    public List<Song> getAllSongs() {
        return allSongs;
    }

    public void playSong(int index) {
        try {
            if (allSongs.get(index) != null) {
                currentlyPlaying = allSongs.get(index);
                System.out.print("Currently playing" + currentlyPlaying.getName() + " By " + currentlyPlaying.getArtists().get(0).getName());
                isPlaying = true;
            }
        } catch (Exception e) {
            System.out.print("That song is not available");
        }
    }

    public void pauseSong() {
        isPlaying = false;
    }

    public void skipSong() {
        try{
            int index = allSongs.indexOf(currentlyPlaying);
            currentlyPlaying = allSongs.get(index+1);
        } catch (Exception e) {
            System.out.print("Encountered problem when skipping");
        }
    }

    public void prevSong() {
        try{
            int index = allSongs.indexOf(currentlyPlaying);
            currentlyPlaying = allSongs.get(index-1);
        } catch (Exception e) {
            System.out.print("Encountered problem when trying to play previous");
        }
    }
}
