package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {

    public static void main(String[] args) throws FileNotFoundException {//bu method calisirken File..firlatabilir diyor

        /*
        Java dan bilgisayaramizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class indan yardim aliriz.
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time da altini kirmizi cizen her durum
        CTE degildir.
        Java da bazi exceptionlar da
        Compile Time Exception dur.
        ozellikle dosya okuma ve yazma ile ilgili exception lar
        Compile Time Exception dur..

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1-try-catch ile cevrelemek
        2-method signature ina throws keyword ile beklenen exception turunu yazmak

        throws Exception ,sadece olayin farkinda oldugumuzun deklarasyonudur
        exception in handle edilmesinde hicbir rolu yoktur
        yani try catch ile handle yani kontrol altina aldigimiz exceptionlar da
        kod calismaya devam ediyordu.
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hicbir sey yapmamisiz gibi hata mesaji yayinlayp,calismayi durdurur.
         */
    }
}
