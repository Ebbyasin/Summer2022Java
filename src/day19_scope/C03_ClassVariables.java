package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        farkli bir class ta calisirken herhangi bir class adini yazip noktaya basarsak
        static adini yazdigimiz class ta ki tum static class uyelerini gorebilir ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();//10  (çünkü burada METHOD CALL vardir.C02.StaticVariables taki methoda gider
                                           // sadece static methodu calistirir.
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);// 0

        /*
        class level variable lara deger atayip atamamak bize kalmistir,istersek deger atariz ,deger atamasi yaparız
        istemezsek deger atamayiz,
        eger deger atamissak java atadigimiz o degeri kabul eder,deger atamazsak o zaman java bu variable lara
        defoul bir deger atamasi yapar.
        int---->0
        String--->null
        boolean--->false
        char--->'' hiclik  (ama String olarak degel char olarak)
         */

        /*
        baska class taki instance variable lara obje olusturarak ulasabiliriz.
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();// 10

        // bu method icinde static sayi =20 oldu..
        System.out.println(obje1.isim);// Mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0

        System.out.println(C02_StaticVariables.staticSayi);//20

        /*
        farkli bir class tan C02 clasindan metod ve variable lari kullandigimda C02 clasinin tamami degel
        sadece benim cagirdigim kisim class uyeleri calisir.
         */


    }
}
