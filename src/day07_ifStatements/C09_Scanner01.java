package day07_ifStatements;

import java.util.Scanner;

public class C09_Scanner01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayiyi giriniz : ");
        int sayi2= scan.nextInt();

        System.out.println("iki sayinin toplami : " + (sayi1+sayi2));

    }
}
