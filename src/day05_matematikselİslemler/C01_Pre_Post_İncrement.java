package day05_matematikselİslemler;

public class C01_Pre_Post_İncrement {

    public static void main(String[] args) {

        int sayi1= 10;

        int sayi2= sayi1 +1;  // sayi2---> 11

        sayi2 +=5; // sayi2-->16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur.

         */

        int sayi3 = sayi2++;   //  1-sayi2 , sayi3 e atanacak
                              //  2-sayi2 bir arttirilacak

        /*
        ++ veya -- vaiable dan sonra olursa buna post....
        bu durumda o satirda yapilan iki islemden
        arttirma veya azaltma islemi sonuncudur
         */

        System.out.println("sayi3 : " + sayi3); // 16
        System.out.println("sayi2 : " + sayi2);  // 17

        int sayi4=++sayi1;    // 1-sayi1 bir arttirilacak
                              // 2-sayi1 degeri, sayi4 e atanacak
        /*
        eger ++ veya -- variable dan once ise buna pre... denir
        bu durumda o satirda yapilan iki islemden oncelikli olan
        arttirma veya azaltmadir
         */

        System.out.println("sayi4 : " + sayi4);// 11
        System.out.println("sayi1 : " + sayi1);// 11
    }
}
