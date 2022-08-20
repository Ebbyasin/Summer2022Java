package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";
    static int degersizStaticVar;
    int degersizInstanceVariable;

    /*
    class level daki variable lara deger atamasakta java kabul ediyor
     */

    public static void main(String[] args) {
        /*
        eger bir variable static olusturulduysa
        objeler icin degil  class icin gecerlidir
         */
        System.out.println(staticSayi); //10
        staticMethod();  // METHOD CALL(staticMethod methoduna gider)22.satira
        staticSayi=12;
        System.out.println(staticSayi); //12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20
        /*
        instance bir variablenin  degerini bulmak icin objenin olusturulmasindan itibaren  istenen
        satira kadar kodu takip  etmeliyiz,
        static variable de ise classin en basindan baslayarak istenen satira kadar kodu takip edip
        static variablenin son degerini bulmamiz gerekir.
         */

    }

    public static void staticMethod(){
        System.out.println(staticSayi); //10

    }

    public void staticOlmayanMethod(){
        System.out.println(staticSayi); //12
        staticSayi=20;


    }
}
