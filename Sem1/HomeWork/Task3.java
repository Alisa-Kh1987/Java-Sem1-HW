package Sem1.HomeWork;
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, 
//положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("int a = ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("число положительное");
        }
        else {
            System.out.println("число отрицательное");
        }
        sc.close();
    }
}
