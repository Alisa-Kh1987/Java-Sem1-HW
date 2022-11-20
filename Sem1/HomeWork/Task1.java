package Sem1.HomeWork;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int factorialNumb = 1;
        int triangNumb = n * (n + 1) / 2;

        System.out.println("n-ное треугольное число = " + triangNumb);

        for (int i = 1; i <= n; i++) {
            factorialNumb = factorialNumb * i;
        }

        System.out.print("n! = " + factorialNumb);
        sc.close();

    }
}
