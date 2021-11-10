import java.util.Arrays;
import java.util.Random;

// в каждой строчке найти минимальный элемент
public class Massiv_03_11_3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[] array2 = new int[array.length * array[0].length];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();}

        System.out.println();

            for ( int n = 0, k=0; n < 5; n++) {
                int minim = array[n][0];
                for (int j = 0; j < 5; j++,k++) {
                    if (array[n][j]<minim){
                        minim=array[n][j];
                    }

                }
                System.out.println(minim);
        }}}




