import media.*;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public Media findById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null;
    }

    public void printItem(Media media) {
        System.out.println(media.getTitle() + " - " + media.getCost());
    }

    public Media findByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void removeByTitle(String title) {
        Media mediaToRemove = findByTitle(title);

        if (mediaToRemove != null) {
            itemsOrdered.remove(mediaToRemove);
        }
    }

}
