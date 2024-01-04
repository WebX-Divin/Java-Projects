package PlayList;

import java.util.*;
public class Album{
    
    private ArrayList<Song> songs;

    public Album(String name){
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String name, double duration){
        if(findSong(name) == null){
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String name){
        for(Song song : songs){
            if (song.getName().equals(name)) {
                return song;    
            }
        }
        return null;
    }

    public boolean addToPlayList(String name, LinkedList<Song> playlist){
        Song song = findSong(name);
        if(song != null){
            playlist.add(song);
            return true;
        }
        return false;
    }
}
