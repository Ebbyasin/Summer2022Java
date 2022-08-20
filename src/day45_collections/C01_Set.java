package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    public static void main(String[] args) {

        //verilen bir array deki tekrar eden elementleri silip
        //tekrarsiz halini array e atayan kod yaziniz

        int[]arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};//array uzunlugu degistirilemez..
        Set<Integer> tekrarsizSet=new HashSet<>();

        for (int each:arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet);

        int[] tekrarsizArr=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArr));

        int i=0;
        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }

        arr=tekrarsizArr;
        System.out.println("Bizim array in son hali : " +Arrays.toString(arr));
    }
}
