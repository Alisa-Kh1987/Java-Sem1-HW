//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Sem3.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task2_sem3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер списка int n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(-10, 75);
            myArray.add(number);
        }
        System.out.println("Наш список: " + myArray);
        sc.close();

        System.out.println("Максимальное значение списка: " + Collections.max(myArray));
        System.out.println("Минимальное значение списка: " + Collections.min(myArray));

        int sum_numbers = 0;
        for (int i = 0; i < n; i++) {
            sum_numbers += myArray.get(i);
        }
        System.out.println("Сумма чисел списка: " + sum_numbers); //для удобства подсчета
        double average_value = (double) sum_numbers / n;
        System.out.printf("Среднее: " +"%.3f",average_value);
    }
}
