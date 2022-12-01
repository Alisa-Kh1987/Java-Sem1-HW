// Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

package Sem4.HomeWork4;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        String[] myArray = {"777", "journey", "level80", "Sun", "waterfall", "1984", "Equipment"};
        Stack<String> myArray2 = new Stack<>();
        
        for (int i = 0; i < myArray.length; i++) {
            myArray2.add(myArray[i]);
        }

        System.out.println(myArray2);
    }
}
