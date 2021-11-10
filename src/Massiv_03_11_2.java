import java.util.Arrays;
import java.util.Random;

// преобразовать массив в одномерный
public class Massiv_03_11_2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[] array2 = new int[array.length * array[0].length];
        Random random = new Random();

        for (int i = 0, k = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++, k++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "  ");
                array2[k] = array[i][j];

            }
            System.out.println();

        }
        System.out.println(Arrays.toString(array2));
    }
}

