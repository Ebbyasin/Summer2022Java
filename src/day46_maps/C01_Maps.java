package day46_maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");
        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}
        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]
        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size()); // 4
        // tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin
        Collection<String> tumValueColl =sinifList.values();
        String[] eachArr;
        int sira=1;
        for (String each : tumValueColl
        ) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren String'ler getiriyor
            eachArr= each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;
        }
        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun
        List<String> sinifIsimSoyisimList= new ArrayList<>();
        for (String each : tumValueColl
        ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);

        /*

        1-Map: Gercek projelerdeki database sistemine en uygun java objesiir.
        2-Maplerde aynı ozelliklere sahip ve ozellikleri aynı bicimde tektiplestirilmis datalar saklayabiliriz
        tek tip demek, 1. öğrencide / koyduysan diğerlerinde de / koy, noktalı virgul koyduysan hepsine ; koy
        aynı özelliklere sahip olacak ve aynı özellikleri yaparken tek tiplestireceğiz
         3-Tektiplestirme sonradan datalara ulasabilmek icin önemlidir.
         4-Biz bir map in icerisinde 20 tane bilgi bulabilirdik, yani biz ne kadar cok özellikl bulundurursak bulunduralım
         hepsini bizim iki parcaya bölmemiz gerek
         Map e ekleyeceğimiz tüm özellikler 2 parcadan (key/value) olusmalidir.
         5-Map olustururken key ve value nun data turune karar vermis olmamız ve bunu deklare etmemiz gerekir.
         6-Map'de tüm islemler key üzerinden yapılır. Bundan dolayı key değerleri unique olmalıdır.
         7-Bir firmada calıstığımızda eger map kullaniliyorsa map'in data yapısı hep aynı olacaktır.
         Bizden istenen herhangi bir görevi yaparken, görevi bağımsız methodlar ile kurgulamak ileride yapacağımız
         görevlerde kolaylık sağlayacaktır.
       */

    }

}
