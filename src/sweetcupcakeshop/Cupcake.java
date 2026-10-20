/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sweetcupcakeshop;

/**
 *
 * @author omash
 */
public class Cupcake {
    private String name;
    private double price;
    
    public Cupcake(String name,double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName() {return name;}
    public double getprice() {return price;}
    
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
}
