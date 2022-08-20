package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class ta gorunmese bile bir constructor vardir
    bu class tan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor i gozlemleyemeyecegimize icin
    onun yerine kullanilabilecek parametresiz constructor olusturalim.

     */
    protected String granpaKluAdi="Grandpa Klubu";
    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }


}
