// import java.util.Scanner;
// public class Compress {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введите исходную строку: ");
//         String source = sc.next();
//         String result = compress(source);
//         System.out.println("Результат: " + result);
//       }
    
      // aaaabbbcdd -> a4b3c1d2
    //   public static String compress(String source) {
        // заводим счетчик
        // итерируемся по строке
        // если текущий символ совпадает с предыдущим, то увеличиваем счетчик
        // если нет, то сохранили в какую-то (результирующую) строку и обнулили счечик
        // в конце вернули результирующую строку
        
    //    char[] chars = source.toCharArray();
    //    for (int i = 0; i < chars.length; i++) {
    //      char aChar = chars[i];
    //    }
    //
    //    int length = source.length();
    //    for (int i = 0; i < length; i++) {
    //      char c = source.charAt(i);
    //    }
//         return null;
//       }
    
// }
// Наше решение
import java.util.Scanner;
public class Compress {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner (System.in);
        System.out.println("введите строку ");
        str = sc.next();
        System.out.println(countLetters(str));
        sc.close();
    }
public static String countLetters(String str) {
        int counter = 1;
        StringBuilder result = new StringBuilder();
        char[] array = str.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i]){
                counter ++;
                System.out.println("counter= " + counter);
                System.out.println(array[i]);
            }
            else{
                result.append(array[i-1]).append(counter);
                System.out.println(result);
                counter = 1;
            }             
        }
        result.append(array[array.length-1]).append(counter);             
        return result.toString();
        }       
}

//еще вариант
// public static String compress(String source) {
//     char[] chars = source.toCharArray();
//     char aChar = chars[0];
//     int count = 1;
//     String result = "";
//     for (int i = 1; i < chars.length; i++) {

//         if (chars[i] == aChar) {
//             count++;
//         } else {
//             if (count == 1) {
//                 result += "" + aChar;

//             } else {
//                 result += "" + aChar + count;

//             }
//             aChar = chars[i];
//             count = 1;
//         }
//     }
//     if (count == 1) {
//         result = result + aChar;
//     } else {
//         result = result + aChar + count;
//     }
//     return result;
// }
// }

//и еще вариант
// public static String strCompr(String a) {
//     char[] chars = a.toCharArray();
//     int count = 1;
//     StringBuilder builder = new StringBuilder();
//     builder.append(chars[0]);
//     for (int i = 1; i < chars.length; i++) {
//         if (chars[i] == chars[i - 1]) {
//             count++;
//         } else {
//             builder.append(count);
//             count = 1;
//             builder.append(chars[i]);
//         }

//     }
//     builder.append(count);
//     return builder.toString();
// }
