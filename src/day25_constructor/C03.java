package day25_constructor;

public class C03 {

    /*
     proje olustururken bazi class'lar run etmek icin degil
     variable ve method olusturup
     bunlari baska class'lardan kullanmak icin olusturulur
      */
    /*
    bu class i kaliphane gibi kullanmisiz..
     Default constructor, parametresizdir
     goremezsek bile ihtiyac oldugunda calisir
    4- Class icerisinde parametreli veya parametresiz
     herhangi bir constructor olusturursak
     java default constructor'i siler(onceki classta soyledegimiz 3
     dorduncusu)
     */
    C03(){
    }
    /*
     Olusturdugumuz parametresiz bu(C03 Constructor i) constructor
     Default constructor ile 1-1 aynidir.
     ama biz olusturdugumuz icin buna
     default constructor demeyiz
     parametresiz constructor deriz.
     cons. class in icerisinde main methodun disinda yada herhangi bir
     methodun  disinda olur.

     */




    String isim="Etka";
    public void method01(){
        System.out.println("C03 method calisti");
    }
}