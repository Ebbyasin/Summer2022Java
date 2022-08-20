package day42_abstractClass_Interface;

public interface I02_Interfaces {

    /*
    Interface bir class degildir

    Abstract class'lar java da abstraction(soyutlastirma/ kural koyma)islevini yapiyordu,
    abstract bir class da abstract olmayan methodlar da olabilir.
    Bu da full abstraction yapmaya izin vermez.

    Eger Java da icinde hic concrete method olmasin
   dedigimiz bir class olusturmak istiyorsaniz
   bunu class degil Interface yapmalisiniz

   1-INTERFACE LERDE CONCRETE METHOD OLMAZ.
   2-ıNTERFACE'LAR FULL ABSTRACTİON yaptigindin Interface'lerden obje olusturulamaz

   Hatirladiginiz gibi Interface olan List ten direk obje olusturamiyorduk
   List<String> liste:new List<>() calismaz
   Bunun yerine constructor i List in childa i olan ArrayList den seceriz
   Last<String> liste=new ArrayList<>();
   3-Class larda bir child birden fazla parent edinemez.ancak interfacelerde
   concrete method olmadigindan
   biz her mmethodu child calass da override etmek zorundayiz.
   Override ederken kimin soyledigini override ettigimizin onemi yok.
   4-Interfaceler neyin yapilmasi gerektigini soyler.
   ama nasil yapilacagina karismaz.
     */
}
