package composite;

public class SongMain {

    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "Description 1");
        SongComponent MetalMusic = new SongGroup("Heavy Metal", "Description 2");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "Description 3");

        SongComponent everySong = new SongGroup("Song list", "All songs");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("TNT", "desc", 1998));

        DiscJockey rodriDj = new DiscJockey(everySong);

        rodriDj.getSongComponent();
    }
}
