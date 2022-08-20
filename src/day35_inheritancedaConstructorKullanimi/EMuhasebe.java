package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe(){
        //Super()
        System.out.println("Muhasebe parametresiz cons");
    }
    EMuhasebe(String isim){

        System.out.println("Muhasee parametreli cons");
    }
}
