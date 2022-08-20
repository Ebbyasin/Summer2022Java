package day15_OverLoading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir  tamsayi icin faktoryel hesaplayip yazdiran
        bir  method olusturun

        verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin  faktoryeli hesaplanamaz"
        uyarisi yazdirin

         */

        int input=6;
        faktoryeHesapla(input);
    }

    public static void faktoryeHesapla(int input) {  // 5!=1*2*3*4*5

        int faktoryel=1;

        if (input<0 || input>20){
            System.out.println("verilen sayi icin faktoryel hesaplanamaz");
        }else if (input==0){
            System.out.println("0!=1'dir");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("faktoryel degeri : " + faktoryel);
        }
    }
}
