package Sem1.HomeWork;
//Написать метод, которому в качестве параметра передается целое число. 
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//*как в задаче 3, я посчитала, что 0 - положительное число */

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("int a = ");
        int a = sc.nextInt();
        if (a < 0){
           System.out.println(true); 
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
