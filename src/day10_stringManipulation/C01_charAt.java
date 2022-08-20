package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str="java ogrenmek ne guzel";

        System.out.println(str.charAt(0));// ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7)); //R

        System.out.println(str.charAt(21));// bize l yi verir

       // System.out.println(str.charAt(22)); // StringIndexOutOfBoundsExcetion
       // son harfi bulmak icin str in uzunlugunun 1 eksigini index olarak gireriz
       // eger index olarak uzunlugu veya daha bir sayiyi girersek  Java exception verir

       //
    }
}
