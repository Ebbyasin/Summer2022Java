package day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyota {

    HCorolla() {
        System.out.println("HCorolla parametresiz calisir");
    }

    HCorolla(String isim){

        super(isim);
        System.out.println("HCorolla parametreli calisir");
    }

    }

