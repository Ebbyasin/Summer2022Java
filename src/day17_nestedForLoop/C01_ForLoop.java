package day17_nestedForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {

        //verilen  String deki kullanilan harfleri
        //tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini eren bir method yaziniz

        String input="taka tuka";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1));//J //ilk harfi yazdirmamizin sebebi sonda virgul kalmamasi.
        benzersizInput+=islenecekKelime.substring(0,1);//J


        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){// benzersiz input siradaki harfi icermiyorsa
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);


            }

        }
        System.out.println("");
        System.out.println("inpt: " + input); // bunu neden yazdirdik??
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("Kelimede verilen farkli harf sayisi : " +benzersizInput.length());


    }
}

