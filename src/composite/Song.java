package composite;

public class Song extends SongComponent{

    String songName;
    String bandName;
    int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
