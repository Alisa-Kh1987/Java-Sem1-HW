package Sem1;
public class Counter {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 0, 1, 1, 0, 1, 0, 1 };
        int result = method(array);
        System.out.println(result);
    }

    public static void name() {

    }

    private static int method(int[] array) {
        int counter = 0; // 4
        int bestCounter = 0; // 2
        for (int x : array) {
            if (x == 1) {
                counter++;
            } else {
                if (counter > bestCounter) {
                    bestCounter = counter;
                }
                counter = 0;
            }
        }

        if (counter > bestCounter) {
            bestCounter = counter;
        }

        return bestCounter;
    }

}
