package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * gunlukMesai * saatUcreti) + "maas alir");

    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class taki bir methodun parent class taki
        ayni isimdeki methodu etkisiz hale getirerek
        kendisinin spesifik ozelligii ortaya
        cikarmasidir

        Overridingi nerede dikkate aliyoruz?
        Bir obje olusturulurken data turu ve  construcor
        farkli ise..

        eger bir obje olusturulurken data turu ve  constructor
        farkli ise objenin  ozelliklerini belirlerken 3 konuya
        dikkat cekmeliyiz.
        1-Obje constructor in oldugu class da olusur
        2-objenin ozelliklerini aramaya data turunun  oldugu class dan baslariz
        bu class da aranan  ozellik bulunamazsa  parent class lara bikilir
        ordada bulamazsak CTE verir.

        3- eger aranan ozellik variable ise overriding ihtimali olmadiği icin
        buldugumuz ilk degeri yazdiririz
        aranan  ozellik method ise
        degeri yazdirmadan once override
        edilmismi diye control etmemiz gerekir.
        eger override edildiyse en guncel degeri yazdiririz.

         */

        BMuhasebe yh1=new EYanHizmetler();
        System.out.println(yh1.gunlukMesai);//M 8 // variable oldugu  icin muhasebe den alir.
        System.out.println(yh1.saatUcreti);//M 10  variable oldugu  icin muhasebe den alir.
        yh1.maas();// YH
        yh1.ozelSigorta();//M
        yh1.sigorta();//P..once muhasebeye bakar,bulamaz,sonra personele bakar,override edilmediyse alir.
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departman);//P
        //System.out.println(yh1.issizlikSigorta);
        //aramaya muhasebeden basladigimizdan
        //issizlikSigorta yi bulamadi,parent yani muhasebeye bakti bulamadi,CTE verdi.

    }
}
