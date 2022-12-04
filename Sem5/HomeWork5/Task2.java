//Написать метод, который переведёт данное целое число в римский формат.

package Sem5.HomeWork5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите арабское число: ");
        int arabian_num = sc.nextInt();
        System.out.println(convertToRoman(arabian_num));

        sc.close();
    }

    public static String convertToRoman(int arabian_num) {

        Map<Integer, Character> arabMap = new HashMap<>();

        arabMap.put(1000, 'M');
        arabMap.put(500, 'D');
        arabMap.put(100, 'C');
        arabMap.put(50, 'L');
        arabMap.put(10, 'X');
        arabMap.put(5, 'V');
        arabMap.put(1, 'I');

        StringBuilder romanianNumber = new StringBuilder();

        while (arabian_num > 0) {
            while (arabian_num / 1000 >= 1) {
                romanianNumber.append(arabMap.get(1000));
                arabian_num -= 1000;
            }
            while (arabian_num / 100 >= 1) {
                if (arabMap.containsKey(arabian_num - arabian_num % 100)) {
                    romanianNumber.append(arabMap.get(arabian_num - arabian_num % 100));
                    arabian_num = arabian_num % 100;
                }
                if (arabian_num >= 500) {
                    romanianNumber.append(arabMap.get(500));
                    arabian_num = arabian_num - 500;
                } else {
                    if (arabian_num >= 100) {
                        romanianNumber.append(arabMap.get(100));
                        arabian_num -= 100;
                    }
                }
            }
            while (arabian_num / 10 >= 1) {
                if (arabMap.containsKey(arabian_num - arabian_num % 10)) {
                    romanianNumber.append(arabMap.get(arabian_num - arabian_num % 10));
                    arabian_num = arabian_num % 10;
                }
                if (arabian_num >= 50) {
                    romanianNumber.append(arabMap.get(50));
                    arabian_num -= 50;
                } else {
                    if (arabian_num >= 10) {
                        romanianNumber.append(arabMap.get(10));
                        arabian_num -= 10;
                    }
                }
            }
            while (arabian_num > 0) {
                if (arabMap.containsKey(arabian_num)) {
                    romanianNumber.append(arabMap.get(arabian_num));
                    arabian_num = 0;
                }
                if (arabian_num >= 5) {
                    romanianNumber.append(arabMap.get(5));
                    arabian_num -= 5;
                } else {
                    if (arabian_num >= 1) {
                        romanianNumber.append(arabMap.get(1));
                        arabian_num -= 1;
                    }
                }
            }
        }
        return romanianNumber.toString();
    }
}

