package day03_scanner;

import java.util.Scanner;

public class C08_ScannerİlkHarf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);

    }

}
