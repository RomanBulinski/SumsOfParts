

public class Main {


    public static int[] sumParts(int[] ls) {

        int[] result = new int[ls.length + 1];

        int posytion = ls.length-1;
        int sum=0;
        for( int i = result.length-1; i>=0; i--){
            result[i]=sum;

            if(posytion>=0){
                sum =sum + ls[posytion];
                posytion--;
            }
        }
        return result;
    }





}
