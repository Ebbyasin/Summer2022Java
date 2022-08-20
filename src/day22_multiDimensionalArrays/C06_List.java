package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {


        /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>();
        System.out.println(isimler); // [] isimler listesini yazdırmak istersek hicbir yerden yardim almamiza
                                     // gerek yak.arrays de ArraysToString deyip String den yardim aliyorduk
        // bir list'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); // true doner
        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         ama ArrayList te boolean dondurdugu icin ve isim eklendigi icin true doner
         yukarida isimler.add("Basak") eklemesinden sonra liste degisir,Listlerde atama yapmasakta method calisir
         */

        System.out.println(isimler); // [Basak, Ayse]
        /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */

    }
}
