package CTCI.CH7.q7_3;

import java.util.ArrayList;
import java.util.List;

public class testJukeBox {
    public static void main (String [] args){
     //Generate Artists and Songs
     Artist kanye = new Artist("Kanye West");
     Artist nelly = new Artist("Nelly Furtado");
     Artist nicki = new Artist("Nicki Minaj");

     Album graduation = new Album("Graduation", 2007, null);
     List<Artist> listOfKanye = new ArrayList<>();
     listOfKanye.add(kanye);

     Song stronger = new Song("Stronger", graduation, listOfKanye);


     List<Song> allSongs = new ArrayList<>();
     allSongs.add(stronger);

     JukeBox jukeBox = new JukeBox(allSongs);
     jukeBox = jukeBox.getJukeBoxInstance();

     jukeBox.playSong(0);

    }
}
