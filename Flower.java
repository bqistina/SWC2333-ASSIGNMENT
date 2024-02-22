/**
 * Program description: 
 * programmer:BQ
 * Date:22 February 2024
 */
public class Flower
{
    // instance variables - replace the example below with your own
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    // Normal constructor with parameter
    public Flower(String name, String color, double price, int quantity){
    this.name = name;
    this.color = color;
    this.price = price;
    this.quantity = quantity;
    }
    
    //Constructor without parameter
    public Flower(){
        this.name = "";
        this.color = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    //retrievers (accessors / getters) for each data member
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    //Mutators (setters) that sets all data members
    public void setName(String name) {
        this.name = name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    //toString() method that displays all information about the magazine object
    public String toString(){
        return "Name:" + name + "\nColor:" + color + "\nPrice:" + price + "\nQuantity: " + quantity;
    }
}