public class Store {

    private DigitalVideoDisc[] itemsInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[100];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("The disc with name " + dvd.getTitle() + " has been added");
                break;
            }
        }
    }
    

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].equals(dvd)) {
                itemsInStore[i] = null;
                System.out.println( dvd.getTitle() + "has been deleted");
                break;
            }
        }
    }

}
