package Sem2;
    // Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, 
    //причем длина этой строки равна n (n - четное)

    import java.util.Scanner;
    public class BuildString {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("введите количество n ");
            int n = sc.nextInt();
            System.out.println(buildString('A', 'B', n));
            sc.close();
        }   
        public static String buildString(char c1, char c2, int n) {
            String str = "";
            for (int i = 0; i < n; i++) {
                str += String.valueOf(c1)  + String.valueOf(c2);           
            }
        return str;
        }
    }
    
    // public static String buildString(char c1, char c2, int n) {
    //     if (n == 0 || n % 2 != 0) {
    // //      return "";
    // //      return null;
    //       throw new IllegalArgumentException("Значение n " + n + " некорректное");
    //     }
    
    //     StringBuilder builder = new StringBuilder();
    // //    String res = "";
    //     for (int i = 0; i < n / 2; i++) {
    //       builder.append(c1).append(c2);
    // //      res += c1 + "" + c2;
    //     }
    
    //     return builder.toString();
    //   }
    