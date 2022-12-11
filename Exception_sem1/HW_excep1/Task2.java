package Exception_sem1.HW_excep1;

//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class Task2 {
    public static int sum2d(String[][]arr){
        int sum = 0;
        CountExceptions(arr);
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
    return sum;
    }

    public static void CountExceptions(String[][]arr){
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j < 5; j++){
                if (arr[i][j] == null){
                    throw new NullPointerException();
                }
                else if (i > arr.length || j > 5){
                    throw new IndexOutOfBoundsException();
                }
                
            }
        }
    }
}