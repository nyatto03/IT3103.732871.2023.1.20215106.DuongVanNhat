public class testCart {
  public static void main(String[] args) {

    Cart cart = new Cart();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

    cart.addDigitalVideoDisc(dvd1);
    cart.addDigitalVideoDisc(dvd2);
    cart.addDigitalVideoDisc(dvd3);

    cart.totalCost();

    System.out.println(cart.toString());

    cart.printDVD(cart.findById(2));

    cart.printDVD(cart.findByTitle("The Lion King"));

  }
}
