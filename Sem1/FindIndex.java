package Sem1;

// Задан массив, например, nums = [1,7,3,6,5,6]. 
// Написать программу, которая найдет индекс i для этого массива такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i.
/**
 * program
 */
public class FindIndex {

    public static void main(String[] args) {
        int[] numbers = { 1, 7, 3, 6, 5, 6 };
        int median = findMedian(numbers);
        System.out.println(median);
    }

    private static int findMedian(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += numbers[j];
            }
            for (int f = numbers.length - 1; f > i; f--) {
                sum2 += numbers[f];

            }
            if (sum1 == sum2) {
                return i;
            }
        }

        return -1;
    }
}

// public static void main(String[] args) {
// int[] numbers = {1, 7, 3, 6, 5, 6};
// int median = findMedian(numbers);
// System.out.println(" ывафвыа ф ");
// }

// private static int findMedian(int[] numbers) {
// // [a1, a2, a3, a4, a5, a6, a7]

// int left = 0;
// for (int i = 1; i < numbers.length - 1; i++) {
// left += numbers[i - 1];

// int right = 0;
// // i + 1, i + 2, ... number.length - 1
// for (int j = i + 1; j < numbers.length; j++) {
// right += numbers[j];
// }

// if (left == right) {
// return i;
// }
// }

// return -1;
// }
