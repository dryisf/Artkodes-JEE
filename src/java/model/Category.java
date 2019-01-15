package model;


public class Category {
    private int catId;
    private String name;
    private String description;
    
    public Category (int catId, String name, String description) {
        this.name=name;
        this.description=description;
        this.catId=catId;
    }

    public int getCatId() {
        return catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
