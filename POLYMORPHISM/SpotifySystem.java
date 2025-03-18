 class Music {
     String title;

    public Music(String title) {
        this.title = title;
    }

    public void play();
}

class Song extends Music {
    public Song(String title) {
        super(title);
    }

    
    public void play() {
        System.out.println("Playing song: " + title);
    }
}

class Podcast extends Music {
    private String host;

    public Podcast(String title, String host) {
        super(title);
        this.host = host;
    }


    public void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
}

class Playlist extends Music {
    private Music[] tracks;

    public Playlist(String title, Music[] tracks) {
        super(title);
        this.tracks = tracks;
    }


    public void play() {
        System.out.println("Playing playlist: " + title);
        for (Music track : tracks) {
            track.play();
        }
    }
}

public class SpotifySystem {
    public static void main(String[] args) {
        Music song1 = new Song("Shape of You");
        Music song2 = new Song("Blinding Lights");
        Music podcast = new Podcast("Tech Trends", "John Doe");

        Music[] tracks = { song1, song2, podcast };
        Playlist playlist = new Playlist("Morning Vibes", tracks);

        playlist.play();
    }
}
