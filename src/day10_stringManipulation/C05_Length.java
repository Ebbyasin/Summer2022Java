package day10_stringManipulation;

public class C05_Length {

    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length());// str ın karakter sayisini dondurur 19
        System.out.println(str.charAt(str.length()-1)); // son karakterini yazdiralim p
        System.out.println(str.charAt(str.length()-3)); // sondan 3.karakteri yazdiralim

        /*
        Java da null pointer( isaretleyici) bir deger degil,
        karsisina yazildigi variable in hic bir deger olmadiginin isaretcisidir


        */

        String str2="" ;  // str2 ye bir deger atanmiz midir EVET
                          //bu deger nedir :hiclik
        System.out.println(str2.length()); // 0      ( = assign isareti )

        String str3=null; // str3 e bir deger atanmis midir HAYİR
                          // null bu deger atamamayi isaret etmektedir

        System.out.println(str3.length());// bir deger atanmamis ki nasil uzulugu olsun
                                          // NullPointerException olarak  hata verir

    }
}
