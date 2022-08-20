package day05_matematikselİslemler;

public class C02_Pre_Post_İncrement {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment : " +  ++sayi); // iki islem var;yazdirma ve arttirma. ,pre oldugu icin
                                                          // once arttirip sonra yazdiracak.11

        System.out.println("post-increment : " +  sayi++);// burda da önce sayiyi yazdiracak sonra arttiracak ve sayinin
                                                          // son hali bir artacak. 11

        System.out.println("post-incremen ten sonra : " + sayi);// 12

        sayi++; // 13
        ++sayi; // 14




    }
}
