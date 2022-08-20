package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println( a<0 && b<20 && c>=b); // false

        /*
        java and operatoru konusunda bize iki secenek sunar
        && kullanırsak  ilk false buldugunda, artik sonucun false olacagini bilir
        ve geriye kalan  sartlari incelemez

        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler

        bu calisma usulunden  dolayu & operatorune gore daha  yavas olabilir.

         */
        System.out.println(a<0 & b<20 & c>=b); // false
    }
}
