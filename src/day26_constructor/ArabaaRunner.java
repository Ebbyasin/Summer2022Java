package day26_constructor;

import day25_constructor.Car;

public class ArabaaRunner {
    public static void main(String[] args) {
        Car carr1=new Car();
        System.out.println(carr1.fiyat);

        Arabaa arabaa1=new Arabaa();
        arabaa1.fiyat=100000;
        arabaa1.marka="Mercedes";
        arabaa1.yil=2011;
        arabaa1.model="C180";
        System.out.println("Arabaa1 bilgileri\nMarka : " + arabaa1.marka +"\nModel : " + arabaa1.model
                +"\nYil : " + arabaa1.yil+ "\nFiyat : " + arabaa1.fiyat);
        Arabaa arabaa2=new Arabaa("BMW","kma",2011,15000);

        System.out.println("Arabaa2 bilgileri\nMarka : " + arabaa2.marka +"\nModel : " + arabaa2.model
                +"\nYil : " + arabaa2.yil+ "\nFiyat : " + arabaa2.fiyat);
        Arabaa arabaa3=new Arabaa("opel","astra",2015,78000);

        System.out.println("Arabaa3 bilgileri\nMarka : " + arabaa3.marka +"\nModel : " + arabaa3.model
                +"\nYil : " + arabaa3.yil+ "\nFiyat : " + arabaa3.fiyat);
        Arabaa arabaa4=new Arabaa("Mazda","S20",2017,50000);
        System.out.println("Arabaa4 bilgileri\nMarka : " + arabaa4.marka +"\nModel : " + arabaa4.model
                +"\nYil : " + arabaa4.yil+ "\nFiyat : " + arabaa4.fiyat);

    }
}
