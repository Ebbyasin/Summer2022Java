package day07_ifStatements;

import java.util.Scanner;

public class C06_İfElseStatements {

    public static void main(String[] args) {
        /*
        soru-3) kullaniciya yasini sorun,eger yas 65 den kucuk ise "emekli olamazsin,calismalisin",
        65 e esit veya buyukse "emekli olabilirsin" yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin,"+(65-yas)+"yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");

        }
    }
}
