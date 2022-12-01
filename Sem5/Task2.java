package Sem5;

import java.util.Scanner;
import java.util.Stack;

/**
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * () - true
     * [() - false
     * [()] - true
     * {}[]{()} - true
     * <{}{()}> - true
     * {]}{()} - false
     * 
     * Пример 1: a+(d*3) - истина
     * Пример 2: [a+(1*3) - ложь
     * Пример 3: [6+(3*3)] - истина
     * Пример 4: {a}[+]{(d*3)} - истина
     * Пример 5: <{a}+{(d*3)}> - истина
     * Пример 6: {a+]}{(d*3)} - ложь
     */


public class Task2 {
     static Scanner sc = new Scanner(System.in, "ibm866");
     public static void main(String[] args) {
          System.out.print("Inser first word: ");
          String inp1 = sc.nextLine();
          boolean ans = isomorph(inp1);
          System.out.println(ans);
          sc.close();
     }

public static boolean isomorph(String str1) {
     Stack<Character>stack=new Stack<>();
     for (int i = 0; i < str1.length(); i++) {
         if (str1.charAt(i) == '{' || str1.charAt(i) =='[' ||str1.charAt(i) == '<' ||str1.charAt(i) == '(') {
             stack.add(str1.charAt(i));
         }
         if (str1.charAt(i) == '}'){
             Character abc = stack.pop();
             if(abc != '{'){
                break;   
             }
         }
         if(str1.charAt(i) ==']'){
             Character abc = stack.pop();
             if(abc != '['){
                break;   
             } 
         } 
         if(str1.charAt(i) == '>'){
             Character abc = stack.pop();
             if(abc != '<'){
                break;   
             } 
         }
 if(str1.charAt(i) == ')') {
             Character abc = stack.pop();
             if(abc != '('){
                break;   
             }    
         }
     }
         if (stack.isEmpty()){
             return stack.isEmpty();
         }
     return false;
 }
}