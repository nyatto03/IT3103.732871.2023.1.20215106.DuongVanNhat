import java.util.Scanner;

public class Aims {

    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            showMenu();

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

        }

        System.out.println("Thank you for using AIMS!");

    }

    public static void showMenu() {
        // display main menu options
    }

    public static void viewStoreMenu() {
        // display store items
        displayStoreSubmenu();
    }

    public static void updateStoreMenu() {
        // add/remove items from store
    }

    public static void viewCartMenu() {
        // display cart items
        displayCartSubmenu();
    }

    public static void displayStoreSubmenu() {
        // display store submenu options
    }

    public static void displayCartSubmenu() {
        // display cart submenu options
    }

    public static void addToCart() {
        // add item to cart
    }

    public static void removeFromCart() {
        // remove item from cart
    }

    // other methods

}
