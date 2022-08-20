package day32_stringBuilder;

public class C03_Reverse {

    public static void main(String[] args) {

        //verilen ir input u tersine cevirip,
        //bize donduren bir method olusturun

        String input="Hey gidi for loop gunleri";

        String tersInput=tersineCevir(input);
        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);//burda yukaridaki String ifadeyi SBuilder la daha basit bir sekilde
        // ters yazdirabilmek icin yeni bir StringBuilder olusturuyoruz.sonra altta bu SB yi String e cevirecez

        return  sb.reverse().toString();//burda toStrignle StringBuilder i String e ceviriyoruz.sadece sb.reverse
        // ile return etseydik alti kirmizi cizili olurdu.toString =Stringe cevirme isine yarar.hoca String value of
        // ta var dedi,onu arastir.value of la nasil yapiliyor


        /*
        javayla ugrasirken encok karsimiza cikacak problemlerden biri;casting meseleleri.yani data turleriinni birbirine c
        cevirme meseleleri.cunku arkadaslar biz string gonderdik ve string bekliyoruz ama biz tersine cevirme islemini ney
        le yapmak istiyoruz,stringbuilderla yapmak istiyoruz, kolayimiza geldigi icin..iste burada arkadaslar fakli data
        turleri var,stringBuilder..sizin napmaniz lazim,strign gonderdim en sonunda da bana string donmesi lazim,bunu
        casting le ayarlamamiz gerekiyor,
         */


    }
}
