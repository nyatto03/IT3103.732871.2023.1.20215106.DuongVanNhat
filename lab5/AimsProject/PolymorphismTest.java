import media.*;
import java.util.ArrayList;

public class PolymorphismTest {

    public static void main(String[] args) {

        ArrayList<Media> mediaList = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        authors.add("J.K. Rowling");
        Book book = new Book("Harry Potter", "Fiction", 10, authors);

        CompactDisc cd = new CompactDisc("Album", "Music", 15, 80, "Director", "Artist");

        authors.add("J.K. Rowling_2");
        Book book2 = new Book("Harry Potter 2", "Fiction 2", 10, authors);

        DigitalVideoDisc dvd = new DigitalVideoDisc("Movie", "Movies", "Director", 120, 20);

        // Add different media types
        
        mediaList.add(book);
        mediaList.add(cd);
        mediaList.add(book2);
        mediaList.add(dvd);

        // Iterate and print using toString()
        for (Media m : mediaList) {
            System.out.println(m.toString());
        }

    }

}
