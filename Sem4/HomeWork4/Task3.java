//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Sem4.HomeWork4;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        String[] myArray = { "777", "journey", "level80", "Sun", "waterfall", "1984", "Equipment" };
        LinkedList<String> myLinkedList = new LinkedList<String>();

        for (int i = 0; i < myArray.length; i++) {
            myLinkedList.add(myArray[i]);
        }
        System.out.println("Список до переворота: " + myLinkedList);
        myLinkedList = reverseLinkedList(myLinkedList);
        System.out.print("Перевернутый список: " + myLinkedList);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> myLinkedList) {
        LinkedList<String> reverseLlist = new LinkedList<String>();
        for (int i = myLinkedList.size() - 1; i >= 0; i--) {
            reverseLlist.add(myLinkedList.get(i));
        }

        return reverseLlist;
    }
}
