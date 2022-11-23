//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей (ecли обе сложно). 
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

package Sem1.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива int n = ");
        int n = sc.nextInt();
        int[][] myArray = new int[n][n];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; n = myArray[i].length, j++, n--) {
                if (i == j || i == n - j) {
                    myArray[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray).replace("], ", "]\n"));
        sc.close();
    }
}