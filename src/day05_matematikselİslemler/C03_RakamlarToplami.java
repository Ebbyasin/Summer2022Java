package day05_matematikselİslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
        // kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan= new Scanner(System.in); //burda neden scanner scan girdik başka bir sey giremiyormuyduk?sor
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");// kullanicidan ne istedigimizi soylememiz
                                                                             // lazim

        int sayi= scan.nextInt(); // 5267 // bir variable ye atama yapmamiz lazim.(neden scan.nextInt kullandık sor?
          // burdan sonra iki konteyner acmamiz lazim.birler basamagini birine,kalani bir yere yazmak icin



        int birlerBasamagi=0;  // ihtiyacimiz olan konteyner lar bu ve alttaki.bir deger girmemiz gerekiyor.
        int rakamlarToplami=0; // 0 etkisiz eleman oldugu icin 0 giriyoruz
        int ilkGirilenSayi=sayi;

        // su anda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi % 10; // 7
        rakamlarToplami += birlerBasamagi;    // bu increment,bu islemin sonucunda rakamlar top.kont.ı 0+7=7 olur
        sayi /=10;     // bu kodla 7 yi atıyoruz 7 den kurtuluyoruz

        // su anda sayi 526 bb 7  rt 7

        birlerBasamagi = sayi % 10; //6
        rakamlarToplami += birlerBasamagi; // 7+6=13
        sayi /=10;

        // su anda sayi 52 bb 6 rt 13

        birlerBasamagi = sayi % 10; // 2
        rakamlarToplami += birlerBasamagi; //13+2=15
        sayi /=10; //5

        // su anda sayi 5 bb 2 rt 15
        birlerBasamagi = sayi % 10 ; // 5
        rakamlarToplami += birlerBasamagi; // 15+5 =20
        sayi /= 10; //0    // int oldugu icin 0.5 cikan sonuc 0 olur.

        // su anda sayi 0 bb 5 rt 20

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

        // ilk girilen sayiyi neden ekledik tam anlamadim,sor


    }
}