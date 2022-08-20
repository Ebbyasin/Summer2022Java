package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();//burda object te yazabilirdik,Courses in yerine,ama list i
        // kullanamam,yavas calisir,bircok methodu kullanamayiz.
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println("ortalamaPuanlarVerilenSayidanBuyukMu :"+ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,92));
        System.out.println("kelimeKursAdlariIcindeVarMi(coursesList:"+kelimeKursAdlariIcindeVarMi(coursesList,"x"));
        ortalamasiEnYuksekKursunAdiniYazdir(coursesList);
        System.out.println(ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList, 3));
    }
    //1-)Tum ortalama puanlarin verilen sayidan buyuk olup olmadigini kontrol etmek icin bir method olusturun.

    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses>list,double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);

    }

    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun

    public static boolean kelimeKursAdlariIcindeVarMi(List<Courses>list,String kelime){
        return list.stream().anyMatch(t->t.getCourseName().contains(kelime));
    }

    //3-)ortalama puani en yuksek olan kursu yazdirmak icin bir yontem olusturun
    public static void ortalamasiEnYuksekKursunAdiniYazdir(List<Courses>list){

        String sonuc= list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(sonuc);
    }

    //4) Liste öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın

    public static List<Courses>ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses>list,int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
    }


}
