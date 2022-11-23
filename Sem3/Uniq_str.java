package Sem3;

// С консоли вводятся 10 слов
// Нужно их прочитать и вывести только уникальные
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uniq_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextWord = "";
        Set<String> stringList = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            // System.out.print("Введите слово: ");
            nextWord = sc.nextLine();
            stringList.add(nextWord);
        }
        sc.close();
        System.out.println(stringList);
        // for (int i = 0; i < stringList.length; i++) {
    }
}
