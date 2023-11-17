public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Your name", "Romance",20.21f);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.totalCost();

        anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.totalCost();

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Be home", "Dramma",20.22f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Love", "Civil",20.23f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Twinkling Watermelon", "Civil",22.22f);
        DigitalVideoDisc[] List = {dvd5, dvd6, dvd7};
        anOrder.addDigitalVideoDisc(List);
        anOrder.totalCost();

        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Titanic", "Dramma",10.19f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Lonely", "Host",18.19f);
        anOrder.addDigitalVideoDisc(dvd8, dvd9);
        anOrder.totalCost();
        
    }
}
