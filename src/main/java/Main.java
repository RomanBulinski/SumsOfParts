import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static int[] sumParts(int[] ls) {

        int[] result = new int[ls.length + 1];
        int[] tempArr = new int[ls.length ];

        int position = 0;
        for(int i = ls.length-1; i>=0; i--){
            tempArr[position] = ls[i];
            position++;
        }
        int posytion2 = 0;
        int sum=0;
        for( int i = result.length-1; i>=0; i--){
            result[i]=sum;
            if(posytion2<tempArr.length){
                sum =sum + tempArr[posytion2];
                posytion2++;
            }
        }
        return result;
    }



//    public static void main(String[] args) {
//
//        int[] ls = {1,2,3};
//
//        int[] tttt = sumParts(ls);
//
//        for(int n : tttt){
//            System.out.println(n);
//        }
//
//
//    }

}
