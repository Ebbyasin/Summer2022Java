package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {

    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");//su dosya yolunda bir text
            // dosyasi var.

            while ((k=fis.read()) !=-1) {
                System.out.print((char)k);

            }

        } catch (FileNotFoundException e) {  //IOexpection filenotfoundexception un babasi..yani fileNotFoundExc.
                                            // child oldugu icin ustte olmali.buyuk elek yukarda olur.
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {//ya okuyamazsam catchi ..kucuk elek altta olur.yada tek catch olarak yukarda olur
                                  // ve cozulur...
            System.out.println("Dosyadan bilgiler okunamadi");
        }

    }
}
