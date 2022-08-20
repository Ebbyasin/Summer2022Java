package day17_nestedForLoop;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
        verilen inputa gore * lardan olusan asagidaki
        sekli olusturun
        input=4;
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        // artan kismi nedted for loop ile yapalim

        int input=5;  //once dikdortgen mi ucgen mi bakariz.ucgen oldugu icin dis for loop
                      // 1 den baslayip inputa kadar gider,ic for loop 1 den baslayip i ye kadar gider


        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                
            }
            System.out.println("");// inır ve outır arasına bir tane hiclik yazariz
            
        }

        for (int i = input-1; i >=1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");

        }

        




    }
}
