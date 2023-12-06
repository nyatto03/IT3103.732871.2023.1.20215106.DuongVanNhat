import media.*;
import java.util.ArrayList;

public class Store {

    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media with name " + media.getTitle() + " has been added");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been deleted");
        }
    }

    // other methods like find, print inventory

}
