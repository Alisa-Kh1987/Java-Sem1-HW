// Реализовать консольное приложение, которое:
//  * Принимает от пользователя строку вида
//  * text~num
//  * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//  * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//  * Если ввод не содержит символа ~, то завершает программу с ошибкой.
//  * Если введено -1, то выходим

package Sem4.HomeWork4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные формата <text~num>: ");
        String newStr = "";
        Map<String, String> thisMap = new HashMap<>();
        String[] array;
        while (!newStr.equals("-1")) {
            newStr = sc.nextLine();
            if (newStr.contains("~")) {
                if (newStr.contains("print")) {
                    array = newStr.replace("~", " ").split(" "); // рассплитили строку
                    String result = thisMap.get(array[1]); // получили значение по ключу
                    System.out.println(result);

                } 
                else {
                    array = newStr.replace("~", " ").split(" ");
                    thisMap.put(array[1], array[0]);
                }
            } 
            else if (newStr.equals("-1")) {
                break;
            } 
            else {
                System.out.print("Ошибка ввода. Программа завершена.");
                break;
            }
        }

        sc.close();
    }
}
