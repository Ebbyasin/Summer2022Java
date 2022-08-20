package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : " +(30*saatUcreti*gunlukMesai)+ " maas alir");

    }
    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();//data turu ve constructor ayniysa memur classina gidiyoz.yoksa babasina,
        // yoksa grandbabasina gideriz
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//Memurlar : 3240 maas alir
        mmr1.ozelSigorta();//;Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Tum personelimiz sigorta yapilir
        System.out.println(mmr1.isim);//Isim belirtilmedi
        System.out.println(mmr1.soyisim);//Soyisim belirtilmedi
        System.out.println(mmr1.departman);//departman belirtilmedi

        BMuhasebe mhsb1=new BMuhasebe();//burdada data turu ve cons.ayni once mhsb classina gideriz,yoksa baba ......
            //ustte BMuhasebe ayni zamanda data turu,normalde class biliyoruduk
        /*
        her ne kadar  Memur class inin icinde olsak da
        olusturdugm obje Muhasebe class indan
        cunku data turu ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        'Bmuhasebe' class i da obje olusturulabilen bir class tir
        yani bir data turudur.obje olusturdugumuzda obje isminden
        once yazilan her class ayni zamanda bir data turudur.

         */

        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas();//Muhasebe
        mhsb1.ozelSigorta();//Muhasebe
        mhsb1.sigorta();//Personel
        System.out.println(mhsb1.isim);//Personel
        System.out.println(mhsb1.soyisim);//Personel
        System.out.println(mhsb1.departman);//Personel


    }
}
