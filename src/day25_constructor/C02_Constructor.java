package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {
          C01            obj1        =   new         C01()    ;//bu obje C01 classın kopyası olur.
        // class adi  objenin adi     keyword    constructor// burada C01 clasindan bir obje urettik
        Scanner scan = new Scanner(System.in);           //ve bu objeyi(obje1)kullanarak o kalipta
        Random rnd= new Random();                     //verilen bilgilere ulastik.
        List<String> list= new ArrayList<>();
        // List<String> list2=new List<>();  list bir interface,interfacelerinde contructoru
                                    // yoktur,oyuzden new list<> olmuyor.ArrayList<>oluyor,
                                  // obje olusturmak icin constructor olmali.
        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */
        System.out.println(obj1.sayi); // 0
        obj1.deneme(); //ojb1 uzerinden C01 den deneme methodunu
                       // calisir.bunu sout un
                      // icine koymama gerek yok,cunku void,bana birsey
                      // dondurmuyor

        /*
        biz bir classtan(kalip) farkli constructorlar kullanarak farklıymıs gibi
        gorunen objeler uretebiliriz.gercekten disardan  baktiginda bu
        objelerbirbirinin aynısı degildir.kalip aynı desenler farkli.
        Butun objeler kalibin ozelliklerini tasır.aynı kalip kullanilarak
        birden fazla obje uretilebilir
        Obje olusturmayi siparis vermeye benzetebiliriz.
         */
    }






}
