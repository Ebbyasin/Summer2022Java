package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";// kucuk ı yla yazarsam oluyor


        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*
        Eger buyuk-kucuk harf donusumunde local bir dili esas olmak isterseniz
        bu method kullanilabilir
         */
    }
}
