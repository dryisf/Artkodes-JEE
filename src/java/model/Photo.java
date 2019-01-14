package model;

public class Photo {
    private static int id = 0;
    private String name;
    private Category category;
    private String path;
    
    public Photo(String name, Category category, String path) {
        this.setName(name);
        this.setCategory(category);
        this.setPath(path);
        id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
}
