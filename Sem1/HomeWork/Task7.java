package Sem1.HomeWork;
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
//С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] myArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 1 };
        System.out.print("Исходный массив: " + Arrays.toString(myArray));
        System.out.println("");
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } 
            else {
                myArray[i] = 1;
            }
        System.out.print("Конечный массив: " + Arrays.toString(myArray));
    }
}
