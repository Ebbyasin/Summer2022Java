package day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : " + (30*gunlukMesai*saatUcreti) + "maas alir");

    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");

    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();//burda cons. Disci,,biz isci olusturuyoruz..ama iscinin muhasebe clasindaki
        // herkesle beraber hak ettigi haklari gormek istiyoruz
        /*
        Bir obje olusturulurken
        Data turu ve cons. ayni class dan ise
        direk o class a gidiyorduk

        eger data turu ve cons. farkli ise
        Obje cons. in oldugu  class in objesidir
        ancak,bizden isteen
        Isci class indai spesifik ozellikler degil
        bir  iscinin muhasebe classindaki
        tum calisanlarla beraber sahip oludugu
        genel ozellikleri yazdirir.
         */
        System.out.println(isc1.gunlukMesai);// M 8
        System.out.println(isc1.saatUcreti);//M 10
        isc1.maas();//M
        isc1.ozelSigorta();//M
        isc1.sigorta();//P
        System.out.println(isc1.isim);//P
        System.out.println(isc1.soyisim);//P
        System.out.println(isc1.departman);//P

        Apersonel isc2=new DIsci();

        //System.out.println(isc2.gunlukMesai);// M 8
        //System.out.println(isc2.saatUcreti);//M 10
        //personel classinda gunluk maastan saat ucretinden ve özel sigortadan bashedemezsin diyor cunku
        //burada yok geriye de gidemezsin diyor
        isc2.maas();//M
        //isc2.ozelSigorta();//M
        isc2.sigorta();//P
        System.out.println(isc2.isim);//P
        System.out.println(isc2.soyisim);//P
        System.out.println(isc2.departman);//P

        /*
        Eger data turu olan class ta aradigimiz ozellik yoksa
        varsa onun parentina gidebilir,ama childe a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir.
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        // list bir interface dir. bunun yerine list in child i olan arraylistten constructer kullaniyoruz burada
        //yani aslinda arraylist aynı zamanda list in cocugu gibi

        /*
        ikisinde de sağ tarafta linked list var bu linked list class inda bir obje olusturdum demek
        ama sağ tarafta data turu olarak bunlari kullanabiliyoruz
        3 tane linked list olusturduk hepside constructer classından kullanabiliyor
         ama data turleri farklı hepsi linked list olsa da list1 list gibi davranır
         list2 deque gibi davranır  ve list3 queue gibi davranır
         linked merve olsun merveyi babasına ithaf edince kız cocuğu merve oldu List
         abisine ithaf edince kız kardes merve oldu deque
         abisinin cocuguna söyleyince hala gibi oldu queue
         yani aynı objelere farklı özellikler katabiliriz.
         */

    }
}
