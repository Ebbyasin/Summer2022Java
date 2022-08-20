package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";
    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        //bu objeyi olusturmak icin  Granpa Cons. calisir,
        //parent veya Child cons calismaz

        Child child1=new Child();
        child1.granpaKluAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi icin Child cons calisir
        /*
        Jcva da bir class i kullanabilmek icin
        o classdan obje olusturur,dolayisiyla
        o class in constructor ini kullanirdik

        Java inheritance da parent clas lardaki ozellikleri kullanabilmek
        icin o class larin constructorlarini otomatik calistiran bir
        yapi kurmustur.

        Ornegin biz child class inda kendi class imizdan
        Child class indan bir obje olusturmak istedigimizde child constructorini
        kullaniriz,

        java Child () constructor ini gordugunde once
        parent in constructor ini calistirmam lazim der
        buradan parent constructor a gider
        Parent class inda Parent (){} ini constructor ini gorunce
        once bunun parent inin yani Granparent cons.
        calismasi gerekir der.(Artik extence i gormeyene kadar gider.)
        Boylece extence keyword olmayan class a kadar gider
        ve oradan baslayarak tum constructorlari asagi dogru calistirir

        STATİC METHODS VEYA VARİABLE LAR İNHERİT EDİLEMEZLER.
        STATİC DEGİLSE OBJEYE BAGLİDİR,SADECE CHİLD1 İCİN KULLANİLİR.
         */

    }
}
