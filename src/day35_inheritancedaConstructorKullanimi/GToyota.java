package day35_inheritancedaConstructorKullanimi;

public class GToyota {
    GToyota() {
        System.out.println("GToyota parametresiz calisir");
    }

    GToyota(String isim){
        //super (isim); extends oldugu icin  olmaz
        System.out.println("GToyota parametreli calisir");
    }
}