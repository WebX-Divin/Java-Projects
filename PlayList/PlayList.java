package PlayList;

import java.util.*;

public class PlayList {
    private LinkedList<Song> songs;
    private ListIterator<Song> playlistIterator;

    public PlayList(){
        this.playlistIterator = null;
        this.songs = new LinkedList<>();
    }

    public void addSongToPlayList(Song song){
        songs.add(song);
    }

    public void printPlaylist(){
        System.out.println("------------Playlist------------");
        for(Song song : songs){
            System.out.println(song);
        }
    }

    public boolean playNext(){
        if(playlistIterator == null){
            playlistIterator = songs.listIterator();
        }
        if(playlistIterator.hasNext()){
            System.out.println("Now Playing: " + playlistIterator.next());
            return true;
        } else {
            System.out.println("End of the playlist");
            return false;
        }
    }

    public boolean playPrevious(){
        if(playlistIterator == null){
            playlistIterator = songs.listIterator(songs.size());
        }
        if(playlistIterator.hasPrevious()){
            System.out.println("Now Playing: " + playlistIterator.previous());
            return true;
        }else{
            System.out.println("Start of the Playlist");
            return false;
        }
    }

    public void replayCurrent(){
        if (playlistIterator != null) {
            if(playlistIterator.hasPrevious()){
                System.out.println("Replaying: " + playlistIterator.previous());
                playlistIterator.next();
            } else{
                System.out.println("Cannot replay the current song");
            }
        } else{
            System.out.println("No song is currently playing");
        }
    }

    public void removeCurrentSong(){
        if (playlistIterator != null) {
            playlistIterator.remove();
            System.out.println("Current song removed from the playlist");
        } else{
            System.out.println("No song is currently playing");
        }
    }
}
