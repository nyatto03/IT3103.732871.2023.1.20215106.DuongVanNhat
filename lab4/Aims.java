import java.util.Scanner;
import media.*;
public class Aims {

    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {

        showMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 0) {

            switch (choice) {
                case 1:
                    viewStoreMenu();
                    break;
                case 2:
                    updateStoreMenu();
                    break;
                case 3:
                    viewCartMenu();
                    break;
            }

            showMenu();
            choice = scanner.nextInt();

        }

        System.out.println("Thank you for using AIMS!");

    }

    // Menu methods

    public static void showMenu() {
        // Display main menu
    }

    public static void viewStoreMenu() {
        // Display store menu
    }

    public static void viewCartMenu() {
        // Display cart menu
    }

    // Other methods to handle each menu option
    // e.g. add/remove from store/cart, view details, filter, sort etc

}
