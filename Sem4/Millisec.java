package Sem4;
// посмотреть библиотеку джава JMH

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    
    public class Millisec {
    
        public static void main(String[] args) {        
            List<String> arrayList = new ArrayList<>();       
            List<String> linkedList = new LinkedList<>();     
            fillArray(arrayList);        
            fillArray(linkedList);
        }
        public static void fillArray(List<String> arr) {
            long currentTimeMillis1 = System.currentTimeMillis();
            System.out.println("начальное время " + currentTimeMillis1);
            for (int i = 0; i < 1000000; i++) {
                arr.add(0, String.valueOf(i));
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            System.out.println("конечное время  " + currentTimeMillis2);
            long time = currentTimeMillis2 - currentTimeMillis1;
            System.out.println("итоговое время  " + time);
        }
    }
    
