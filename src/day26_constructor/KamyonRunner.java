package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri: " + kamyon1.toString());//yazdırmak icin kamyon1.toString demek yeterli oluyor.

        System.out.println();

        Kamyon kamyon2=new Kamyon("Mercedes", "4140", 2005,5000000); //kamyon classından yeni bir kamyon olusturayim ama özelliklerini de ben yazayım diyorsak
        System.out.println("kamyon2 bilgileri :"+kamyon2.toString());//toString demeesk bile toString özelliginden dolayı yazdırıyor.

        System.out.println();

        Kamyon kamyon3=new Kamyon("MAN", "as900", 2007,4000000); //kamyon classından yeni bir kamyon olusturayim ama özelliklerini de ben yazayım diyorsak
        System.out.println("kamyon3 bilgileri :"+kamyon3);//toString demeesk bile toString özelliginden dolayı yazdırıyor.

        System.out.println();

        Kamyon kamyon4=new Kamyon("Scania","s540");//iki parametreli bir constructer olmadığı icin java kabul etmez
        System.out.println("kamyon4 bilgileri :" +kamyon4); //kamyon4 te marka model olur, ama yıl ve fiyat default değer alır


    }
}
