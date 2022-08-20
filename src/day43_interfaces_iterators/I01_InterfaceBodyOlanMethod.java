package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu dusunsek
    iki tane access modifier kullanma ihtimali OLAMAZ.

    asagidaki method da gorecegimiz gibi interface'de istisnai olarak
    body'si olan methodlar olusturulabilir.
    Bu ozellik Java 8 den sonra kullanilmaya baslanmistir.
     Bu ozellikten once,bir interface e yeni
    bir method eklememiz gerektiginde eskiden beri
    bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi.

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
   bu method'un child classlar tarafindan override edilme MECBURİYETİ olmaz
   Ve eskiden implement etmis classlari degistirmemiz gerekmez

   Bu istisnai bir durumdur ve interface icin olusturulan
   genel kurallari bozmaz.

   Bu methodlarin body'si olsada bunlara concrete method denmez
  ama override edilme mecburiyetleri yoktur.

  buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi
  icindir.

  O zaman nicin 2 keyword yani static ve default tanimlanmistir?
  Bu iki parkli kelimenin amaci
  child class'lardan bu method'a nasil erisilebilicegini belirlemek icindir.
  static keyword kullanilirsa,child class'dan bu method' a eerismek icin
  InterfaceAdi.methodAdi yeterli olur.

  default keyword kullanilirsa,method'a erismek icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");

    }

    public static void direksiyon(){
        System.out.println("tum arabalarin direksiyonu vardir");
    }
}
