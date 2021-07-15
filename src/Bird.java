public class Bird extends Animal{
    public Bird(){
    }

    public Bird(String name, String type, String description, double price, boolean isInStock){
        super(name, type, description, price, isInStock);
    }

    public String getPet(){
        return String.format("Name: %s \nType: %s \nDescription: %s", this.getName(), this.getType(), this.getDescription());
    }
}
