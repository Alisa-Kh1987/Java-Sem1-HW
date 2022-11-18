package Sem1;
public class ReversAndPrint {
    public static void main(String[] args) {
        reverseAndPrint("Добро пожаловать на курс по Java");
        reverseAndPrint("I am like Java programs");
    }

    private static void reverseAndPrint(String str) {
        String[] words = str.split(" "); // 6
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

}
