package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends  LOgretmen{

    Matematikciler(){
        //burda super(); cons. vardir javanin otomatik atadigi...DİKKATTTT KACİRMA...
        System.out.println("Matematikciler parametresiz cons");
    }
    Matematikciler(String isim){
        this();//yukaridaki extends yazisi varsa
        // super()'de vardir,onun  yerine this() yazilmis,super olmaz.
        System.out.println("Matematikciler parametresiz cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this() cons call,icinde bulunulan class taki cons lari,super
    cons call ise parent class da bulunan cons. lari cagirir

    this() veya super() parametre yapisina uygun bir  constructor bulama
    Java CTE verir.

    constructor  konusunda gordugumuz this.
    o class taki instance variable lari refere ediyordu.

    inharitance dada super. vardir.super.parent class taki instance lari  refere
    eder.
     */


}
