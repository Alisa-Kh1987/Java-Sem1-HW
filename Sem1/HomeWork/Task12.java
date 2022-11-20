//Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

package Sem1.HomeWork;

public class Task12 {
    public static void main(String[] args) {
        int[]myArray = new int[]{26, 15, 6, 56, 2, 8, 15, 37};
        int maxnumb = myArray[1];
        int minnumb = myArray[1];
        for (int i=1; i<myArray.length;i++)
            if (myArray[i]>maxnumb){
                maxnumb = myArray[i];
            }
        System.out.println("Максимальный элемент массива: " + maxnumb);
        for (int i=1; i<myArray.length;i++)
        if (myArray[i]<minnumb){
            minnumb = myArray[i];
        }
        System.out.println("Минимальный элемент массива: " + minnumb);
}
}
