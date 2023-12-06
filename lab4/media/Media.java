package media;

// import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Media(String title, String categoty, float cost) {
        this.id = updateId();
        this.title = title;
        this.category = categoty;
        this.cost = cost;
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

    public boolean equals(Media media) {
        if (media == null || this == null)
            return false;

        if (!media.title.equals(this.title))
            return false;

        return true;
    }

    public int updateId() {
        return nbMedia++;
    }

    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }

}
