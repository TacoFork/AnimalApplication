public class Cat extends Animal{
    public Cat(){
    }

    public Cat(String name, String type, String description, double price, boolean isInStock){
        super(name, type, description, price, isInStock);
    }

    public String getPet(){
        return String.format("Name: %s \nType: %s \nDescription: %s", this.getName(), this.getType(), this.getDescription());
    }
}
