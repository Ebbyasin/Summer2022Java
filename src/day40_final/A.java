package day40_final;

   public class A {

   protected String isim="Cuneyt";
   final static String OKUL="Yildiz Koleji";
   /*
   Bir varicble final olarak tanimlandiysa
   baska class lardan veya icinde oldugumuz class dan
   bu variable a baska deger atanmasi mumkun degildir

   Madem ki degeri degistirilemiyor
   genelde static de yaparak
    bu variable a erisim kolaylastirilabilir
    ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir
    */

   final void finalMethod(){
      System.out.println("final method'lar override edilemez");
      /*
      bir methodu final olarak isaretlerseniz xbu method degistirilemez demektir
      (override edilemez)
       */
   }
}