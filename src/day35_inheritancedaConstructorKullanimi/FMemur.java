package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {

    /*
    Extence keyword kullanilan classlarda
    ister  default constructor bulunsun
    istersek de biz yeni constructor(lar)olusturalim
    java constructor in ilk satirina
    super(); constructor call yazar


     super(); constructor call .default construtor a benzer
     gorunmese arada vardir ve calisir
     ancak biz ilk satira farkli bir cons call yazarsak
     java super(); i siler.

     Eger biz mudahele edip  kendi cons.umuzu olusturmazsak
     java nin default olarak olusturdugu cons.coll her zaman
     parametresizdir.super();
     */
     FMemur(){
        //Super();

        System.out.println("Memur parametresiz cons");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli cons");


    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur("ali");
    }
}
