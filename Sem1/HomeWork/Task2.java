package Sem1.HomeWork;
//Написать метод, принимающий на вход два целых числа и проверяющий, 

//что их сумма лежит в пределах от 10 до 20 (включительно), 
//если да – вернуть true, в противном случае – false.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("int a = ");
        int a = sc.nextInt();
        System.out.printf("int b = ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        if (sum >= 10 & sum <= 20) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        sc.close();
    }
}