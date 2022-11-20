//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий 
//одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

package Sem1.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("int len = ");
        int len = sc.nextInt();
        System.out.print("int initialValue = ");
        int initialValue = sc.nextInt();
        int[] myArray = new int[len];
       
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = initialValue;
        }
        System.out.print(Arrays.toString(myArray));
        sc.close();
    }
}
