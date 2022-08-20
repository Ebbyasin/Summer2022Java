package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {


        /* tek katli arraylerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirilamayabilir(misal array yazdırmıyor,list yazdırıyor,ikiside non-primitive)
        ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu veya String elementler kullaniliyordu.
        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur
         */
        int[][] sayilar= {{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]
        ancak en icerdeki elementlere ulasairsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]); // [I@58ceff1  //sayilar outer arrayinin 0. elementini(o da bir array)yazdiriyor
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5].

        System.out.println(sayilar[0][1]); // 2 // [1, 2, 4, 5]//sayilar arrayinin 0.inner arrayinin 1.
                                                // indexindeki elementi.
        System.out.println(sayilar[1][0]); // 3
        System.out.println(Arrays.toString(sayilar)); // [[I@58ceff1, [I@7c30a502]//bu arrayin içinde iki tane daha
                                                     // array var diyor ve referanslarını yazdırıyor
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]// 29.satirdaki problemi de
                                                          // deepToString metoduyla çozuyoruz.3 de 4 te olsa kat yazar
        /*
         array'i iki sekilde declare edebiliyorduk
         1- elemanlari direk yazabiliriz
         int[][] sayilar= {{1,2,4,5},{3,4}};
         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar= new int[3][4];boyle yazarsak deger atamazsak java otomatik olarak atama yapar.
         ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz
         */
    }
}
