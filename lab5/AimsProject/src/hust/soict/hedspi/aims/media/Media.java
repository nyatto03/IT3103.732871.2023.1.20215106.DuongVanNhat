package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia = 0;
	//Khởi tạo các thuộc tính của Media
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();
	//Các thuộc tính comparator
	public Media(String title) {
		super();
		this.title = title;
		setId(++nbMedia);
	}

	public Media(String title, String category, float cost) {
		super();
		
		if (cost < 0) {
	        throw new IllegalArgumentException("Cost cannot be negative.");
	    }
		
		this.title = title;
		this.category = category;
		this.cost = cost;
		setId(++nbMedia);
	}
    //Các constructor
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	// Các getters và setters
	public boolean equals(Object obj) {
		//Kiểm tra xem object có phải null hoặc không phải là 1 instance của media
	    if (obj == null || !(obj instanceof Media)) {
	        return false;
	    }

	    // ép kiểu object thành media
	    Media otherMedia = (Media) obj;

	    try {
	        // kiểm tra xem title có phải là equal
	        return title.equals(otherMedia.title);
	    } catch (NullPointerException e) {
	        // Xử lý NullPointerException
	        return false;
	    }
	}
	
	public boolean isMatch(String tit) {
		//Method để kiểm tra trong title có chứa xâu tit không (chuyển về lowercase)
		return getTitle().toLowerCase().contains(tit.toLowerCase());
		}
	
	public boolean isMatchID(int id) {
		//Method để kiểm tra id có trùng ko
		return (getId() == id);
		}

	public Media() {
		
	}

}
