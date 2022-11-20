//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//пройти по нему циклом, и числа меньшие 6 умножить на 2;

package Sem1.HomeWork;

import java.util.Arrays;
public class Task9 {
    public static void main(String[] args) {
        int[]myArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(myArray));
        for (int i = 0; i<myArray.length;i++){
            if (myArray[i]<6){
                myArray[i] = myArray[i]*2;
            }
        }
        System.out.println("Конечный массив: " + Arrays.toString(myArray));
    }
}
