package day07_ifStatements;

public class C03_ifStatements {

    public static void main(String[] args) {

        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
         */

        int sayi=-23;

        if(sayi>0) {

            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");
        }

        if (sayi%2==0){
            System.out.println("sayi pozitif");
            System.out.println("cift kalacaktir");
        }

        if (sayi%5==0){
            System.out.println("sayi 5 in tam kati");
        }

        /*
        basit if cumleleri kodun diger parcalrindan  bagimsizdir
        sadece bir sart kontrol eder,sartlar saglaniyorsa,if body calisir, yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak, tumunde if body'si
         calisabilir,kismen if bo
         */
    }
}



