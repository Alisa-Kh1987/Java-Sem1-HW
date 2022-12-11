package Exception_sem1;

public class One {
    public static void main(String[] args) {
        int[][] nums = {{1,0}, {0,2}};
        sumOf(nums);
    }

    private static int sumOf(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array.length != array[0].length) {
            throw new RuntimeException("Количество строк должно быть равно количеству столбцов!");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1 && array[i][j] != 0) {
                    throw new RuntimeException("Значения могут быть только 0 или 1.");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}
