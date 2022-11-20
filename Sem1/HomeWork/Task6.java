package Sem1.HomeWork;
//Написать метод, который определяет, является ли год високосным, 
//и возвращает boolean (високосный - true, не високосный - false). 
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите год: ");
    int year = sc.nextInt();
      
    if (year%400 == 0){
        System.out.print(true);
    } 
    else if (year % 100 == 0) {
        System.out.print(false);}
    else if (year%4==0) {
        System.out.print(true);
    } 
    else {
        System.out.print(false);
    }
    
    sc.close();
    }
}

