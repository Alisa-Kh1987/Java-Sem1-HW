package Sem6;
    // 1-3
    // Set<Integer> a = new TreeSet<>(); // [0, 1, 2, 3, 4, 5]
    // Iterator<Integer> iterator = a.iterator();
    // //   [1, 2, 3, 4, 5]
    // //       ^
    // while (iterator.hasNext()) {
    //   int x = iterator.next();
    //   int counter = 0;
    //   // for each in array if x == a[i] counter++
    //   iterator.remove();
    // }

   

// 1. Создать массив размера 1000
    // 2. Заполнить массив рандомными значениями от 0 до 24 включительно
    // 3. Понять, какие значения там есть. Обозначим через A
    // 4. Для каждого из тех, которые есть есть в A, смотрим,
    // сколько раз оно встретилось в массиве
    // 5. Если оно встретилось больше 1 раза, то выкидываем его
    // ->> Теперь имеется набор из уникальных значений
    // 6. Вычисляем процент уникальных чисел


 import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Two {
    public static void main() {
        int len = 250;
        int[] arr = new int[len];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < len; i++) {
            int random = ThreadLocalRandom.current().nextInt(25);
            arr[i] = random;
            set.add(arr[i]);

        }
    
        // System.out.println("Array: " + Arrays.toString(arr));
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            int counter = 0;
            for (Integer y : arr) {
                if (y == x) {
                    counter++;
                    if (counter > 1) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }
        System.out.println("Set: " + set.toString());
        double ans = set.size();
        System.out.println(ans / len * 100);
    }
}

// Set<Integer> unique = new HashSet<>();
//     int[] array = new int[1000];
//     ///
    
//     // 1 2 3 4 1 5 7
//     f: for (int i = 0; i < array.length; i++) {
//       int a = array[i];
//       for (int j = i + 1; j < array.length; j++) {
//         int b = array[j];
//         if (a == b) {
//           continue f;
//         }
//       }
      
//       unique.add(a);
//     }
