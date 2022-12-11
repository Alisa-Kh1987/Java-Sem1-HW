package Sem6.HomeWork6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop = new Laptop("Lenovo", 8, 512, "Windows11", "серый матовый", 55_000);
        Laptop laptop1 = new Laptop("MSI", 4, 512, "Linux", "черный", 50_000);
        Laptop laptop2 = new Laptop("HP", 6, 1, "WindowsXP", "черный", 65_000);
        Laptop laptop3 = new Laptop("DELL", 8, 512, "Linux", "серый", 50_000);
        Laptop laptop4 = new Laptop("Asus", 6, 1, "Windows11", "черный", 60_000);
        Laptop laptop5 = new Laptop("Lenovo", 8, 512, "Windows11", "серый матовый", 55_000);

        laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        System.out.println(laptops);
    }

    
}
//     Cat cat = new Cat("Гав", 2, igor);
//     Cat cat2 = new Cat("Гав", 3, igor);
//     Dog dog = new Dog("Белка", 3, igor); brand, RAM, SSD, OS, color, price);