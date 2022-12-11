package Exception_sem1.HW_excep1;
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("double a = ");
        double a = sc.nextDouble();
        System.out.println("double b = ");
        double b = sc.nextDouble();
        int[] myArray = {75, 88, 95, 14, 27, 33};
        System.out.println("int index = ");
        int index = sc.nextInt();
        System.out.println("String myStr = ");
        String myString = sc.nextLine();
        Div(a, b);
        FindNumberByIndex(myArray, index);
        FindStringLength(myString);
        sc.close();
    }
    
    public static void Div(double a, double b) {
        if (b == 0){ 
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        else {
            System.out.println(a/b);
        }
    }

    private static void FindNumberByIndex(int[] myArray, int index) {
        if(index > myArray.length-1){
            throw new ArrayIndexOutOfBoundsException("Индекс больше длины массива. Элемента с таким индексом не существует");}
        else{
            System.out.print("Элемент с введенным индексом равен: " + myArray[index]);
        }
    }
    
    private static int FindStringLength(String myString) {
        if (myString == null){
            throw new NullPointerException();
        }
        else{
            return myString.length();
        }
    }
}