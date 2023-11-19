public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    public int getId (){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }  
    public DigitalVideoDisc(){

    }
    public DigitalVideoDisc(String title){
        this.id =Update();
        this.title = title;
    }
    public DigitalVideoDisc(String title , String category, float cost){
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director , float cost){
        this(title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director , int length, float cost){
        this(title, category, director, cost);
        this.length = length;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setCost (float cost){
        this.cost = cost;
    }
    public void setLength (int length){
        this.length = length;
    }
    public boolean equals(DigitalVideoDisc disc1){
        if (disc1 == null || this == null) 
        return false;
        if (!disc1.title.equals(this.title))
        return false;
        return true;
    }
    private int Update(){
        nbDigitalVideoDiscs ++;
        return nbDigitalVideoDiscs;
    }
}
