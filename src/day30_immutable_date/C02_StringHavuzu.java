package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat("");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false

        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false  icerikleri ayniysa equals methodu true oluyordu,== oyle degil

        System.out.println("s1-s4 " + str1.equals(str4)); // true
        System.out.println("s1-s4 " + (str1==str4)); // true


        /*
        1-)yeni bir string deger olustururken
        esitligin sagında new keyword u olursa java direk yeni bir obje ve referans olusturur
        2-)eger esitligin sagında bir method calisiyor veya + islemi yapılıyorsa
        String immutable old.degisikligi  kaydetmek uzeere hemen
        biir kopya String ve ref. olusturu,sonra degeri hesaplayıp
        bu yeni kopya objenin icine koyar
         */

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5));// true
        System.out.println(str5==str1);//true

        System.out.println(str1.equals(str6));//true
        System.out.println(str1=str6);//true

        System.out.println(str5.equals(str6));
        System.out.println(str5==str6);

        /*
        eger yeni bir String objesi olusturulurken
        new kelimesi kullanilmaz veya
        esitligin saginda bir + islem olmazsa Java bakar

        eger daha once olusturulan String objelerden (String Havuzu)
        bire-bir ayni String varsa
        o objeyi ve referansini kullanir.eger birebir aynisi
        yoksa yeni bir obje ve yeni bir referans olusturur..
         */
    }
}
