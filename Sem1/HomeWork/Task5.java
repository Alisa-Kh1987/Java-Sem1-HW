package Sem1.HomeWork;
//Написать метод, которому в качестве аргументов передается строка и число, 
//метод должен отпечатать в консоль указанную строку, указанное количество раз;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ibm866");
            System.out.print("Введите строку: ");
            String str = sc.nextLine();
            System.out.print("Введите количество: n ");
            int n = sc.nextInt();

            for (int i=0; i<n; i++){
                System.out.println(str); //или System.out.print(str), если требуестя вывести n раз через пробел без переноса на следующую строку=)
            }
            sc.close();
    }
}
