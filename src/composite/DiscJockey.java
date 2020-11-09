package composite;

public class DiscJockey {

    SongComponent songComponent;

    public DiscJockey(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    public SongComponent getSongComponent() {
        return songComponent;
    }
}
