package day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseİfStatements {

    public static void main(String[] args) {

        /*
        bir onceki soruda, kullanici negatif deger girerse uyaralim

        NOT: birden fazla if - else if birbirine baglanmissa
        son durum oemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen gecerli bir yaz giriniz");
        } else if (yas < 65) {
            System.out.println("emekli olamazsin,"+(65-yas)+"yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");
        }
    }
    }
