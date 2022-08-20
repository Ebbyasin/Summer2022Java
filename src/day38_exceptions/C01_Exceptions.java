package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
         bir sorunla karsilasmayi beklediginiz noklarda
        if else ile sorunu yakalayıp onunla ilgili
        cozum uretebilirsiniz

        ama sorunu her zaman if else ile cozemeyecegimizden
        Java try-catch bloklar'i olusturmustur.
         */

        int a=1000;
        int b=50;

        int sayac=1;
        while (sayac<100){//1000 kucuk oldugu surece

            if (b==0){
                System.out.println("islem yapilirken payda 0 oldu,dikkat etmelisiniz");
            }else{
                System.out.println(a/b);
            }

            b--;
            sayac++;
        }

        /*
         1. TRY KISMI: yapilmak istenen islem.
         2. Yakalanmasi istenen EXCEPTION turu ve yakalaninca icine konacak obje.
         3. CATCH BLOGU: problem yakalandigindan ne yapilacagi belirtilen bolum.
       */
    }
}
