package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
        String [] sinifListesi= {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";
        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi)); //yeniSinifListesi yazmiyoruz cunku 10.satirda sinifListesine
                                                             //yeni bir deger atadik,onuda methodla yaptik,method
                                                           // dondugunde sinifListesi eklenmis haline donuyyor.
    }
    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi= new String[sinifListesi.length+1]; // [null, null, null, null].yeni bir array(sinif
                                                                    //listesi olusturuyoruz,degerleri belli
                                                                    // degil o yuzden null null null null yazdiriyor
                                                   // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        // son index'e ise eklenecek ismi atadim,yeni listenin son indexine ekledim
        return yeniSinifListesi;


    }
}
