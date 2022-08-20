package day43_interfaces_iterators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);//(10,20,30)

        //listedeki tum elementleri INDEX KULLANMADAN 3 artirin.

        for (Integer each: liste  //listeden integerlarla ugrasacaz,adi each olsun,nereden listeden alalim
             ) {                   //index kullanamadigimiz icin atamada yapamayiz,loopun disina cıkıldığnda liste
                                  //tekrar eski haline gelir atama yapilmadigi icin

            each+=3;// atama yapilsada asagida liste eski haline geliyor,each loopunun icinde olan bir atama disari ckmz
            System.out.print(each + " ");
        }
        System.out.println("");
        System.out.println(liste);//atama olmadigi icin liste 3 artirilmasina ragmen eski halini aldi.

        /*
        Java index yapisi olmayan collection'lardaki elemenlere
        ulasmak ve degistirmek icin Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator donduren liste.iterator() method
        kullaniyoruz.
         */
        System.out.println(liste);//(10,20,30)

        Iterator it1= liste.iterator();//iterator interface ini kullaniyoruz,adi it1 olsun.sagtaraf sadece iterator
        // olsa interface old.icin obje olusturamayz.ya childi olacak yada nerede kullanacaksak(collection)ordaki collec
         //tionlar dan biri uzerinden (yani liste)ulasarak iterator dondururuz.yani bazen sol taraftaki variableye uygun
        //bir deger getiricek obje getirecek method kullaniiz.yani bu abstract olan iterator methodu bir yerde override
        //edildi ki(arraylist te) concrete hale gelmis.ve biz cagırabiliyorz
        System.out.println(it1.next());//10..yanindakini soyle demek.it1 olusturuldugu anda 10 sayisinin soluna koyar
        // iteratoru.it1.next deyince sagındikini soyle demis oluruz.ustunden atlar,atladigini yazdirir,20 nin soluna
        // gelir
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//30'dan sonra eleman kalmadigindan next methodu CTE verir

        //Iterator da geri donus yok,adim adim sona ulastiktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir.

        //(10,20,30)
        Iterator it2=liste.iterator();
        //yeni it2'yi kullanarak listenin tum elementlerini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);//iterator ile elementleri gezip,remove yapinca
                                  // liste kalici olarak degisti
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);
        Iterator it3=liste.iterator();
        while (it3.hasNext()) {// yaninda eleman oldugu muddetce devam et demek bu...
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste : "+liste);

        /*
        goruldugu gibi Iterator kullanarak yapabilgim
        1-tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        Bu da bize yetmez
         */

        }


    }

