package day32_stringBuilder;

public class C01_OlusturmaYontemleri {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();//bos bir SB verirsek 16 capacity verir,uzunlugu verirsek ona gore verir
        StringBuilder sb2=new StringBuilder("Java Candir...");
        StringBuilder sb3=new StringBuilder(10);


          System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16-->hicbir sey soylemezsek java 16 karakter sigcak sekilde capacity olusturur

          System.out.println(sb2.length());//14--java candir...length 14 old.icin yazdi.
        System.out.println(sb2.capacity());//30

          System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//10

        sb1.append("Java");
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//16

        sb1.append(" candir");
        System.out.println(sb1.length());//11    burda ilk basta 0 ken sonra (once java sonrada candir ekledigimiz icin
        System.out.println(sb1.capacity());//16  --16 yi gecmediginden capaciti degismedi 16 kaldi

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity());//34((16*2)+2)

        StringBuilder sb4=new StringBuilder();
        sb4.append("Java candir");

        System.out.println(sb4.length());//11  sb2 yle bunun arasindaki fark:sb2 de ilk basta java candir seklinde olus
        System.out.println(sb4.capacity());//16 --turuldugu icin daha fazla capacity veriliyor.bunda sonradan
        // eklendigi icin ayni görunsede bunda 16 capacity i gecmedigi icin 16 olarak daha az kapasite veriiliyor



    }
}
