package Exception_sem1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        if (!input.matches("\\d+")) {
            throw new RuntimeException("Некорректный ввод: " + input);
            
        }
        
    }
    

}
