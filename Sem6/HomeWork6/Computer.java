package Sem6.HomeWork6;

public class Computer {
    protected String brand;
    protected int RAM;
    protected int SSD;
    protected String OS;
    protected String color;
    protected double price;

    public Computer (String brand, int RAM, int SSD, String OS, String color, double price){
        this.brand = brand;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public int getRAM(){
        return RAM;
    }

    public int getSSD(){
        return SSD;
    }
    
    public String getOS(){
        return OS;
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return String.format(brand, RAM, SSD, OS, color, price, getBrand(), getRAM(), getSSD(), getOS(),getColor(), getPrice());
    }
}