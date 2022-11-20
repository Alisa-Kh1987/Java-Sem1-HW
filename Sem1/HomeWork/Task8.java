package Sem1.HomeWork;
//Задать пустой целочисленный массив длиной 100. 
//С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
import java.util.Arrays;
public class Task8 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        int a = 1;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = a;
            a = a + 1;
        }
        System.out.print(Arrays.toString(myArray));
    }
}
