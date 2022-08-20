package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        /*
         List primitive data turlerini kabul etmez
         (Type argument cannot be of primitive type)
         ne yani olusturamayacakmiyiz,int olup non primitive olan data turu yokmu;var Integer wrapper class
         */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5, 3, 7]
        // sadece add() kullanirsak Java sona ekler.add elementi update yapmaz,ekleme yapar,yani sayiyi
        // ekledigi yerdeki diger sayiyi atmaz,silmez,ona ve digerlerine az kaykilin der.
        sayilar.add(2,10); // indexi 2 olan yere 10 elementini ekleyelim
        System.out.println(sayilar); // [5, 3, 10, 7]
        // add(index,element) istedigimiz index'e istegimiz elementi yerlestirir
        // add methodu eski elementleri silmez veya update etmez, yeni element ekler


    }
}
