public class Metody_08_11_3 {
    public static void main(String[] args) {

        System.out.println(sum(one(),two(),three()));
    }
        public static int sum (int... a){
            int sum = 0;
            for (int i=0; i<a.length; i++){
                sum += a[i];
            }
       return sum;
        }
    public static int one (){
        return 1;
    }
    public static int two (){
        return 2;
    }
    public static int three (){
        return 3;
    }
       }

