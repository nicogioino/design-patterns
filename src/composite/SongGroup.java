package composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent{

    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription){
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public ArrayList getSongComponents() {
        return songComponents;
    }

    public void add(SongComponent newSongComponent){
        songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }

    public SongComponent getComponent(int componentIndex){
        return (SongComponent)songComponents.get(componentIndex);
    }

}

