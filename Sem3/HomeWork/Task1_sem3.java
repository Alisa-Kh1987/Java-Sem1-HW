//Пусть дан произвольный список целых чисел, удалить из него четные числа

package Sem3.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Task1_sem3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер списка int n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(-25, 50);
            myArray.add(number);
        }

        System.out.println("Исходный список: " + myArray);
        sc.close();

        for (Iterator<Integer> iterator = myArray.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                // System.out.println("This is Even Number: " + number);
                iterator.remove();
            }
        }

        System.out.println("Конечный список: " + myArray);

    }
}
