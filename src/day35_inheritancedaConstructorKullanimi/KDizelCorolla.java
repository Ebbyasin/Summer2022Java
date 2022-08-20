package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {

    KDizelCorolla() {
        System.out.println("KDizelCorolla parametresiz calisir");
    }

    KDizelCorolla(String isim){
        // burda super (); olmaz ,cunku bu parametreli KDizelCorolla cans. unda parametreli super(isim) olusturduk.
        // ve de boylece default olan super(); cons. u oldu.
        super(isim);
        System.out.println("KDizelCorolla parametreli calisir");
    }
    KDizelCorolla obj1=new KDizelCorolla();


}
