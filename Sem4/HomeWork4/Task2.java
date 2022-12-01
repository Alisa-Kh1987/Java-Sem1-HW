//Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

package Sem4.HomeWork4;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        String[] myArray = { "min", "max", "average", "Java", "777", "1987", "A3b4" };
        Queue<String> queueArray = new LinkedList<>();
        for (int i = 0; i < myArray.length; i++) {
            queueArray.add(myArray[i]);
        }

        for (String item: queueArray) {
			System.out.println(item);
		}
    }
}