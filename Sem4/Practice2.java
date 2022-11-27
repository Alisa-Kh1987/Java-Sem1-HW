package Sem4;

/**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    
    // >>hello
    // >>world,
    // >>java
    // >>print
    // <<[print, java, world,, hello]
    // >>revert
    // <<print
    // >>print
    // <<[java, world,, hello]


    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    
    public class Practice2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);       
            List <String> arrayList = new ArrayList(); 
            String str = "";
            while (!str.equals("-1")){ 
                str = sc.nextLine(); 
                if (str.equals("print")){
                    System.out.println(arrayList);
                }
                else if (str.equals("revert") && arrayList.size() == 0){
                    System.out.println("Введи другое");}

                else if (str.equals("revert") && arrayList.size() > 0){
                    arrayList.remove(0); 
                }
                else{
                    arrayList.add(0, str);
                }                        
            }
            sc.close();
        }
    }
    
    // import java.util.ArrayList;
    // import java.util.List;
    // import java.util.Scanner;
    // public class Practice2 {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);       
    //         List <String> arrayList = new ArrayList(); 
    //         String str = "";
    //         while (!str.equals("-1")){ 
    //             str = sc.nextLine(); 
    //             if (str.equals("print")){
    //                 System.out.println(arrayList);
    //             }
    //             else if(str.equals("revert")){
    //                 if (arrayList.size() > 0){
    //                     arrayList.remove(0); 
    //                 }
    //             }
    //             else {
    //                     arrayList.add(0, str);
    //             }                        
    //         }
    //         sc.close();
    //     }
    // }
    // }
    