package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {

    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7};
        // array'in tamamini yazdiralim
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]
        // array'in tum elementlerini yazdirin
        for (int i = 0; i < sayilar.length ; i++) {
            if (i< sayilar.length-1){
                System.out.print(sayilar[i] + ", ");
            }else
                System.out.println(sayilar[i]);
            //  elementler forloop la yazdirilir.tum Array i isterse toString le yazdiriyoruz
            // if (i!=sayilar.lenght-1){
            //    System.out.print(sayilar[i] + ", ")
            // }else
            //    sout(sayilar[i];   boylede olabilirdi virgulsuz direk soyle yazilir:
            // if ten sonra    System.out.print(sayilar[i] + " ") ta olabilirdi ,hoca bu sekilde yapti

        }
    }

}
