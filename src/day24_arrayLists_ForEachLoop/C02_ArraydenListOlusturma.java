package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {

    public static void main(String[] args) {
       /*
        icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list olusturun.
        kullanicidan bir sayi isteyip listede var olup olmadığını kullaniciya yazalim
         */

        //java da scanner gibi calısan random class ı var
        //random un özelligi sayi üretmesidir.

        //rastgele 200 sayının bir list e nasıl ekleneceğini öğrenelim, bunun icin random class ı olusturduk.
        Random rnd = new Random();//scanner gibi olusturduk,
        int sayi = 0; //bunlari koymak icin bir tane de list lazım
        List<Integer> sayiListesi = new ArrayList<>();

        //asil atamayi while icinde yapıyoruz

        while (sayiListesi.size() < 200) { //sayilistesi size 200 oldugu müddetce calıssın, 200 e kadar sayı üretsiz listeye eklesin
            //eğer listenizde yoksa ekleyeceksiniz var ise eklemeyeceksiniz seceneği koymak gerekli ,unique olmasını istiyorsan

            sayi = rnd.nextInt(1000);//rnd em 1000 den kucuk integerları üretecek
            //rnd nextın() olan 0 ile 1 arasında sayı üretir rnd int bound olan sınıra kadar sayı üretir.
            if (!sayiListesi.contains(sayi)) { //üretilen sayı listemde varsa eklesin yoksa eklemesin.
                sayiListesi.add(sayi);

            }

        }
        System.out.println(sayiListesi);//her calıstırdığımızda farklı değerler üretir.


        boolean bildiMi = false; //baslangicta false olsun
        //adım sayısını kac kerede bildigini bir yerde tutmak istiyormusunuz, kac kerede buldun 3 mü 5 mi
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);
        while (!bildiMi) {//bildiMi ==false oldugu müddetce calıs seklinde de yapabiliriz
            //while loop ici true olmazsa calısmaz o yüzden ünlem ile true yapıyoruz.

            System.out.println("lutfen bir sayi tahmininde bulunun");
            sayi = scan.nextInt();
            //simdi bu listede var mı yok mu, yani listemde bir sayı buldu mu bulmadı mı karar vermem lazım
            if (sayiListesi.contains(sayi)) {
                //bu if diyor ki eğer sayı listesi kullanicinin girdigi sayiyi iceriyiorsa oyun bitmistir,
                System.out.println("tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi = true; //oyun tahmini bilirse bitiyor bunu da bildi=true dedigimizde bitiriyoruz.
            } else {
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");//bilemezse hala bilemedin
                tahminSayisi++;//tahmini bir arttırıp devam ediyoruz.

            }
        }
    }
}
