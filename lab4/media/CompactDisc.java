package media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {

  private String artist;
  private List<Track> tracks = new ArrayList<>();

  public String getArtist() {
    return artist;
  }

  public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
    super(title, category, cost, length, director);
    this.artist = artist;
  }

  public void addTrack(Track track) {
    if (tracks.contains(track)) {
      System.out.println("Track already exists");
    } else {
      tracks.add(track);
    }
  }

  public void removeTrack(Track track) {
    if (tracks.contains(track)) {
      tracks.remove(track);
    } else {
      System.out.println("Track does not exist");
    }
  }

  public int getLength() {
    int totalLength = 0;
    for (Track track : tracks) {
      totalLength += track.getLength();
    }
    return totalLength;
  }

  public void play() {
    System.out.println("Playing CD: " + this.getTitle());

    for (Track track : tracks) {
      track.play();
    }
  }

  public String toString() {
    return "CompactDisc" + " [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost()
        + "]";
  }

}
