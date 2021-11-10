import java.util.Arrays;

public class Metody_1 {

    public static void main(String[] args) {
     //mas(new int[]{57, 68, 36}, new int[]{1, 5, 8});
     int[]array1 = new int []{2,3,4};
     int []array2 = new int[]{5,6,7,8};
     int [] m = mas(array1, array2);
     int summa = s (array1);
        System.out.println(Arrays.toString(m));
        System.out.println(summa);
    }
        public static int [] mas (int [] array1, int []array2 ){
            int []array3 = new int [array1.length+ array2.length];

            for (int i=0; i< array1.length; i++){
                array3[i]=array1[i];
                           }
            for (int i= array1.length, j=0; i< array3.length; i++, j++){
                array3[i]=array2[j];

            }
            return array3;

        }
    public static int s (int [] array1){
       int k =0;
        for (int i=0; i< array1.length; i++){
            k=k+array1[i];           }
        return k;
    }
}


