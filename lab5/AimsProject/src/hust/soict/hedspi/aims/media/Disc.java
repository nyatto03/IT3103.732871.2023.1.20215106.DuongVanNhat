package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	//Các thuộc tính của Disc
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	//Các getter
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Các setter
	public Disc(String title) {
        super(title);
    }
	
	public Disc(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public Disc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}
	
	public Disc() {
        super();
    }
	//Các constructor
}
