package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {

    public static void main(String[] args) {

        // verilen kac integer olursa olsun
        //hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplamYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplamYazdir(sayi1,sayi2,sayi3,sayi4);
        toplamYazdir(sayi1,sayi2,sayi3);
        toplamYazdir(sayi1,sayi2);

    }

    public static void toplamYazdir(int...sayi) {
        /*
        int... sayi bu gosterim integer variable lardan  olusan bir varargs demektir
        varargs array alt yapisini kullanir

         */
        int toplam=0;
        int sayiAdedi= sayi.length;
        for (int each: sayi
             ) {
            toplam+=each;

        }
        System.out.println("Girilen " + sayiAdedi + "adet sayinin taoplami : " + toplam);
    }
}
