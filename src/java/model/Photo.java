package model;

public class Photo {
    private int photoId;
    private String name;
    private Category category;
    private String path;
    
    public Photo(int photoId, String name, Category category, String path) {
        this.setName(name);
        this.setCategory(category);
        this.setPath(path);
        this.photoId=photoId;
    }

    public int getPhotoId() {
        return photoId;
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
