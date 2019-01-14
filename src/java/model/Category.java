
package model;


public class Category {
    private static int id = 0;
    private String name;
    private String description;
    
    public Category (String name, String description) {
        this.setName(name);
        this.setDescription(description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
}
