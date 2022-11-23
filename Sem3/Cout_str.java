package Sem3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Cout_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextWord = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i < 4; i++) {
            nextWord = sc.nextLine();
            if (map.containsKey(nextWord) == true) {
                int valueOfRepeat = map.get(nextWord);
                map.put(nextWord, valueOfRepeat + 1);
            } else {
                map.put(nextWord, 1);
            }
        }
        sc.close();
        System.out.println(map);
    }
}

// //еще вариант
// import java.util.*;

// public class Main2 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Insert list's length: ");
//         int len = iScanner.nextInt();
//         scanWords(len);
//         iScanner.close();
//     }

//     public static void scanWords(int len) {
//         Scanner iScanner = new Scanner(System.in);
//         Map<String, Integer> words = new HashMap<>();
//         for (int i = 0; i < len; i++) {
//             System.out.println("Insert word: ");
//             String word = iScanner.next();
//             if (words.containsKey(word)) {
//                 int count = words.get(word);
//                 words.put(word, count+1);
//             }
//             else {
//                 words.put(word, 1);
//             }
            
//         }

//         iScanner.close();
//         System.out.println(words.toString());

//     }
// }

//лаконичный вариант Игоря
// Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     Map<String, Integer> map = new HashMap<>();
//     for (int i = 0; i < n; i++) {
//       String word = sc.next();

//       Integer count = map.get(word);
//       count = (count != null) ? count + 1 : 1;

// //      Object value = expression ? trueValue : falseValue;
// //      if (count != null) {
// //        count = count + 1;
// //      } else {
// //        count = 1;
// //      }

//       map.put(word, count);
//     }

//     System.out.println(map)
