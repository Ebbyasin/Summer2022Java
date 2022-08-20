package day34_inheritance;

public class Isci extends Personel {

    /*
    Normal hayatimizyda parent cocuk sahibi olmaya karar verebilir.
    Java da ise child class lar ozelliklerini inherit etmek istedikleri class i
    kendilerine parent edinirler.parent classlarin parent olma hakki bile yok.
    cok guzel ozellikleri varsada yuzlerce child class i olabilir.

    mesela isci clasini olusturunca nelere  ihtiyaci var diye dusunsek,personel
    class indaki tum variable  ve methodlara  ihtiyaci old.gorebiliriz.bu durumda
    yeniden o variable ve methodlari olusturmak yerine personel class ini kendimize
    parent ediniriz.

    bir class i parent edinmek icin extends keyword kullanmaliyiz.

    bir class baska bir parent i parent edindiginde
    1-parent class taki tum ozelliklere(variable+method)otomatik olarak
    sahip olur
    2-parent class taki ozelliklerden bazilarini kendine uyarlayabilir.
    3-parent class ta olmayan bazi yeni ozellikler olusturabilir.
    NOT=parent class taki ozelliklerden hicbiriini reddedemez,ama
    degistirebilir.onu parent olarak kabul ettikten sonra ordaki variable lari
    ozellikleri reddedemez.alir ,degistirebilir,ama reddedemez.

    child once kendisine bakar variable var mi diye varsa kullanir yoksa parent a gider

     */
    int persNo = 1001;


    public static void main(String[] args) {
        Isci isci1 = new Isci();//ben isci olusturuyorum
        System.out.println(isci1.isim);//Isim belirtilmedi,kendi class imizda isim
        // variable yok,onun icin parent a gideriz
        isci1.isim = "Selim";
        System.out.println(isci1.persNo);//1001 kendi class imizda varsa onu
        // kullanir
        isci1.maas();//Tum personelin maasi vardir
    }
    public  void maas(){
        System.out.println("Isciler  minumum 15 euro saat ucreti alir");
    }
    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}

