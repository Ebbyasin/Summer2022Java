package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array olusturup,
         //       bu array’i bize donduren bir method olusturun

        int[] sayilar=arrayOlustur(); //int bir array dondursun bize(data turu onemli,en basta yazdik int diye) adida
                                     //sayilar olsun.peki bunu nerden getirecek,arrayOlustur metodundan..parantezin ici
                                     // bos kalir,cunku birsey gonderemeyiz,birsey yok ,o gondercek
        System.out.println(Arrays.toString(sayilar));



    }

    public static int[] arrayOlustur() { //int bir array dondurecek,
        Scanner scan=new Scanner(System.in);//scanner olusturalim.uzunlugunu girmem icin kullanicidan almam lazim
        System.out.println("Kac elemanli bir array olusturmami istersiniz");// kullaniciya mesaj verelim.
        int uzunluk=scan.nextInt();  // bir sayi girecek,bunu alalim.
        int[] olusturulan=new int[uzunluk]; // bunu olusturmam icin new int diyecem ama yetmez,koseli parantezin
                                            //  icine uzunluk girmeliyim
                                            // ,21.satira don ***boylece aldigimiz uzunluga gore int array olusturduk

        int sayi=0;

        for (int i = 0; i < uzunluk ; i++) {
            System.out.println(i +". index icin sayi giriniz" );
            olusturulan[i]=scan.nextInt();

        }
        return olusturulan;

    }
}
