package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {
        /*
        kullanicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce
        sayilari yazdiirin tek sayi girdiginde
        islemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile yapalim
        /*
        looplarda kullanacagimiz variableleri loop tan  once olusturmaliyiz
        whileLoop ta looptan once olusturdugumuz bu variable a atayacagimiz
        degeri iyi dusunmemiz gerekiyor
         */

        while(sayi%2==0){

            System.out.println("Lutfen bir sayi giriniz");//
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen  sayi cift : " + sayi);
            }else {
                System.out.println("Girilen sayi tek,benden bu kadar");
            }

        }
        // do while loop ile yapalim;
        // do while loopta onceden olusturulan  variable a hangi deger atandiginin hicbir
        //onemi yok kodumuz her durumda calisir.


        do {




        }while(sayi%2==0);


    }
}
