// Если необходимо, исправьте данный код 
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

package Exception_sem2;

public class Task2_hw2 {
    public static void main(String[] args) {
        int intArray[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
        int d = 1;
        try {
            double catchedRes1 = intArray[10] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
