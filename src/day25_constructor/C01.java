package day25_constructor;

public class C01 {
    /*
     Java OOP konsept kullandigi icin
     olusturulan her bir class'in ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
     Ama her class'dan obje uretilmeyebilir
     bunun icin Java ihtiyac halinde kullanilmasi icin
     her class'da default bir costructor koymustur.
     bu default constructor
     class'dan obje olusturuldugunda otomatik olarak calisir
     ornegin bu class'da constructor gorunmemesine ragmen
     C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
    */
    int sayi;
    public void deneme(){ // mainin dısında olur,
        System.out.println("C01 den deneme method calisir");

        /*
         1-bizim bir obje olusturabilmek icin mutlaka constructor a ihtiyacımız vardir.
         2-biz constructor a ihtiyocimiz olan ozel parametreleri yazmazsak java bizim icin
          standart bir urun uretir,onu bize yollar.
          istedigimiz spesifik ozellikler varsa bunlari parametreler vasitasiyla soylemem lazim
          3-gorunurde bir constructor yoksa bile java oraya bir yedek lastik stepne koymustur
          ama bu ihtiyac halinde kullaniminiza otomatik olarak gecer.otomatik olarak obje olusturul
          dugunda devreye sokar.

         */
    }
}
