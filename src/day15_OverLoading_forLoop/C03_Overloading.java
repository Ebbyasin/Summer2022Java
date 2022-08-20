package day15_OverLoading_forLoop;

public class C03_Overloading {

    public static void main(String[] args) {

        topla(5,7);// 12
        topla(5.2,3);// 8.2
        topla(3.4,6.1);//9.5
        topla(5,6.2);//

        /*
        java hangi metodun  calisacagina karar verirken optimizasyo yapar
        eger hic cast yapmadan kullanabilecegi bir  method varsa onu kullanir
        eger cast yapmadan kullanacagi bir method yoksa, en az cast yaparak  kullanabilecegi
        methodu  tercih eder
         */


    }





    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integer in toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1,int sayi2) {
        System.out.println("bir integer ve bir double in toplami : " + (sayi1 + sayi2));

    }
    public static void topla(double sayi1,double sayi2) {
        System.out.println("iki double in toplami : " + (sayi1 + sayi2));
    }

    public static void topla(int sayi1,int sayi2,int sayi3) {
        System.out.println("3 integerin toplami : " + (sayi1 + sayi2));
    }

}
