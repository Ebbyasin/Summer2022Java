package day15_OverLoading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) { //burasi 1.satir calısmaya baslar,main  methodla
        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun
        // reiquirement ta ne yazıyorsa onu yap

        int sayi1=10; // burasi 2.satir  , calisti atama yapti
        int sayi2=5;  // burasi 3.satir ,  calisti atama yapti

        int sonuc=carpGetir(sayi1,sayi2);// burasi 4.satir,   burada assignment(essaymınt) var
                                         // method call..once degere bakiyoruz,carpGetir
                                         // diye metod var,oraya git diyor,giderkende sayi1 ve sayi2
                                         // yi oraya gotur diyor
                                         //bizi asagiya gönderen bu deger kismindaki carpGetir metodu
                                            // en son 7.satirdan sonra sonuc 50 olarak buraya doner ve 8.satir olur
                                          // int sonuc=50; seklinde,,
                                          //4.satir da method call varken,8.satir da atama var..
        System.out.println("Illa da sonucu goreyim diyenlere main method icinde : " + sonuc); // bunu yapmak zorunda değiliz,cunku dondu
                                                                           //artık,ister simdi yerim ister sonra


    }

    public static int carpGetir(int sayi1, int sayi2) { //  burasi 5.satir

        int sonuc= sayi1*sayi2;// burasi 6.satir
        System.out.println("Illa da sonucu goreyim diyenlere diger method icinde : " + sonuc);
        return sonuc;                   // 7.satir..main methoda döndürür...
        // söylede olur    int sonuc=sayi1*sayi2;
        //         return sonuc;


    }
}
