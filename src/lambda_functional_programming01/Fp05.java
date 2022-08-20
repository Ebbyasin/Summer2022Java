package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,92));
    }
    //1-)Tum ortalama puanlarin verilen sayidan buyuk olup olmadigini kontrol etmek icin bir method olusturun.

    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses>list,double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);

    }
}
