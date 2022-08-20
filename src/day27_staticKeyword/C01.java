package day27_staticKeyword;

public class C01 {

    static  int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        class level da iki tur variable olusturabiliriz
        static (class) variable
        instance (obje) variable
        static variablelar tum class tan kullanilabilirken
        instance olanlar static olmayan method lardan  kullanilabilir.
        instance variable lara static method dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable lar obje variable i oldugu icin herhangi
        bir sairda instance variable in  degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATİRDAN itibaren  kod incelenmelidir

        static variable lar class variable i oldugu icin
        herhandgi bir satirda static variable in degerini bulmak icin
        CLASS İN BASİNDAN  itibaren  kod incelenmelidir.
         */

        C01 obj1=new C01();//obje üzerinden gidersek obje OLUSTURULDUKTAN SONRA bir değer atandımı diye bakarız
        System.out.println("obj1'in rakam degeri : " + obj1.rakam);//5
        System.out.println("obj1 in sayi degeri : " + obj1.sayi);//10 bunun degeri icin obje ye bakilmaz,main den itibare
        // bakariz yoksa class taki en bastaki degere bakariz ..direk sayi yazarakta ulasabiliriz, obj1 yazmamıza gerek
        // yok cunku static.
        obj1.rakam+=1;//5+106  /obj1 üzerinden rakam+=1 diyebiliriz ama tek basına rakam+=1 diyemeyiz cunku bu
        // instance  5+1
        obj1.sayi+=1;//10+1=11 bagli oldugu class a gider orda sayi var.//direk sayi+=1 diyebiliriz cunku static
        // olusturduk  //sayinin değeri bir arttırılmıs, eski değeri 10 du, 1 arttırdık

        System.out.println("1 arttirdiktan sonra obj1'in rakam degeri : " + obj1.rakam);//6
        System.out.println("1 arttirdiktan sonra obj1 in sayi degeri : " + obj1.sayi);//11 //objeye bakma, class ın
        // basından itibaren sayi ile ilgili bir islem varmı bak //11

        C01 obj2=new C01();

        System.out.println("obj2'in rakam degeri : " + obj2.rakam);//5 //5 --rakam instance idi yani static değil,
        // instance demek obje variable ı demektir,
        //yani instance ise objeye bağlıdır.
        //soru su olacak obje olusturulduktan sonra rakama bir değer ataması yapılmıs mı? hayır,
        // obj2 burada olusturuldu o yüzden yukarıda yapılanlar bizi ilgilendirilmez, takibe buradan baslarız
        //yukarıda instance olarak rakama bir değer atanmıs mı evet o zaman 5 yazdırır
        System.out.println("obj2 in sayi degeri : " + obj2.sayi);//11 //11 --sayi static bir değerdir, yani class
        // variable ıdır.

        obj2.rakam++;//5+1=6
        obj2.sayi++;// 11+1=12

        // o yüzden objeden değil classtan alacağız, en bastan baslarız sayi var mi diye kontrol
        // ederiz, sayiyi 11 yaptığımız icin burada 11 yazar.
        /*
        STATIC --CLASS--classın basından itibaren bak
        INSTANCE-- OBJECT --objeyi olusturduktan sonra bak
         */

        System.out.println("1 arttirdiktan sonra obj1'in rakam degeri : " + obj2.rakam);//6
        System.out.println("1 arttirdiktan sonra obj1 in sayi degeri : " + obj2.sayi);//12











    }
}
