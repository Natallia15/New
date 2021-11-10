import java.util.Random;

// 15 примеров из таблицы умножения
public class Massiv_03_11_4 {
    public static void main(String[] args) {
        int[][] array = new int[100][100];
        int[] arrayA = new int[15];
        int[] arrayB = new int[15];
        Random random = new Random();

        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                array[i][j] = i * j;

                System.out.println(i + " * " + j + " = " + array[i][j] + " ; ");
            }
            System.out.println();
        }
        for (int a=0; a<15;a++) {
            arrayA[a] = random.nextInt(7) + 2;
            arrayB[a] = random.nextInt(7) + 2;
            for (int b = a - 1; b >= 0; b--){
            {
           // if() array2[a+1]!=
        }
    }
}}}








