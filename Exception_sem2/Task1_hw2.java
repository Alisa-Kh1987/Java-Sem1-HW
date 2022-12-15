//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных. В этом задании не используем try catch.
// Пишем регулярное выражение и используем на строке метод matches.

package Exception_sem2;

import java.util.Scanner;

public class Task1_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ibm866");
        System.out.printf("Введите дробное число: ");
        String float_num = sc.next();
        String floatNumbPattern = "-[]<>d+[0-9]*\\.\\d+)[0-9]?";

        while (!float_num.matches(floatNumbPattern)) {
            System.out.print("Необходимо было ввести дробное число! Повторите ввод: ");
            float_num = sc.next();
        }
        System.out.println("Введенное число: " + float_num);
        sc.close();
    }
}
