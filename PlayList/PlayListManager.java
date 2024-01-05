package PlayList;

import java.util.Scanner;

public class PlayListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayList playlist = new PlayList();
        Album album = new Album("My Album");

        album.addSong("Song 1", 3.5);
        album.addSong("Song 2", 4.2);
        album.addSong("Song 3", 2.8);
        album.addSong("Song 4", 5.1);
        album.addSong("Song 5", 3.3);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting the playlist manager");
                    return;
                case 1:
                    album.addToPlayList(getSongTitle(scanner), null);
                    break;
                case 2:
                    playlist.playNext();
                    break;
                case 3:
                    playlist.playPrevious();
                    break;
                case 4:
                    playlist.replayCurrent();
                    break;
                case 5:
                    playlist.printPlaylist();
                    break;
                case 6:
                    playlist.removeCurrentSong();
                    break;
            
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6 ");
            }
        }
    }

    private static void printMenu(){
        System.out.println("------------Options------------");
        System.out.println("0 - Quit");
        System.out.println("1 - Add song to playlist");
        System.out.println("2 - Skip forward to the next song");
        System.out.println("3 - Skip backward to a previous song");
        System.out.println("4 - Replay the current song");
        System.out.println("5 - List the songs in the playlist");
        System.out.println("6 - Remove the current song from the playlist");
        System.out.println("------------Enter your choice------------");
    }

    private static String getSongTitle(Scanner scanner){
        System.out.println("Enter the title of the song: ");
        return scanner.nextLine();
    }
}
