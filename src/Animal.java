public abstract class Animal {
    private String name, type, description;
    private double price;
    private boolean isInStock;

    public Animal(){
    }

    public Animal(String name, String type, String description, double price, boolean isInStock){
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    abstract String getPet();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public boolean getIsInStock(){
        return this.isInStock;
    }
}
