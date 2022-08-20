package day17_nestedForLoop;

public class C02_NestedForLoop {

    //verilen sayiya gore carpim tablosu olusturun
    /*
    input 3
    1 2 3
    2 4 6
    3 6 9
     */
    public static void main(String[] args) {
        int input=4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j + " ");

            }

            System.out.println("");// inır ve outır arasına bir tane hiclik yazariz.yani icerdeki f.loop bittiginde
                                   //1,2,3,2,4,6 da misal;2,4,6 kismina gelindiginde ic forloop bitmis olur,ikinci dis
                                   // for loop a gecilmis olur(4 . siradaki 2 ikinci dis for loop


        }
    }
}
