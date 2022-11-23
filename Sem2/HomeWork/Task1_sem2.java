//Напишите метод, который принимает на вход строку (String) и определяет,
//является ли строка палиндромом (возвращает boolean значение)

/*
// public static boolean Palindrome(String text) {
// String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
// String reversed = new StringBuffer(replaced).reverse().toString();
// return reversed.equals(replaced);
// }
 */

package Sem2.HomeWork;

import java.util.Scanner;

public class Task1_sem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String myStr = sc.nextLine();
        isPalindrome(myStr);
        sc.close();
    }

    public static String reverseString(String myString) {
        String result = "";
        for (int i = myString.length() - 1; i >= 0; --i)
            result += myString.charAt(i);
        return result;
    }

    public static Boolean isPalindrome(String myString) {
        if (myString.equals(reverseString(myString))) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

        return myString.equals(reverseString(myString));
    }
}