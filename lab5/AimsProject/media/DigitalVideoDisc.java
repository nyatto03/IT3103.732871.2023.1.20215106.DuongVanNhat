package media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public String toString() {
        return "DigitalVideoDisc" + " [id=" + getId() + ",title=" + getTitle() + 
            ", category=" + getCategory() + 
            ", director=" + getDirector() +
            ", length=" + getLength() +
            ", cost=" + getCost() + "]";
      }

}
