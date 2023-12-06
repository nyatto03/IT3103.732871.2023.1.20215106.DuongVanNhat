import java.util.ArrayList;
import media.*;

public class TestCart {

    public static void main(String[] args) {

        // Create sample media objects
        ArrayList<String> authors = new ArrayList<>();
        authors.add("J.K. Rowling");
        Book book = new Book("Harry Potter", "Fiction", 10, authors);

        CompactDisc cd = new CompactDisc("Album", "Music", 15, 80, "Director", "Artist");

        DigitalVideoDisc dvd = new DigitalVideoDisc("Movie", "Movies", "Director", 120, 20);

        // Create cart
        Cart cart = new Cart();

        // Add media to cart
        cart.addMedia(book);
        cart.addMedia(cd);
        cart.addMedia(dvd);

        // Test total cost
        System.out.println(cart.totalCost());

        // Test author of Book
        System.out.println(book.getAuthors());

        // Test artist of CompactDisc
        System.out.println(cd.getArtist());

        // Test find by title
        if (cart.findByTitle("Harry Potter") == book) {
            System.out.println("Found book by title");
        }

        // Test remove by object
        cart.removeMedia(dvd);

        // Test find remaining items
        if (cart.findByTitle("Harry Potter") == book && cart.findByTitle("Album") == cd) {
            System.out.println("Removed DVD, found others");
        }

    }

}
