package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
    veilen string i asagidaki gibi yazdiran bir programyazalim

    input= Deniz

    D
    De
    Den
    Deni
    Deniz

     */

        String input= "Deniz";

        for (int i = 1; i <=input.length() ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));//ilk harf icin substring (0,1) olmali *** onemli(j ic forloop
                                                         // ta j=1 old.icin 0 ı j-1 le buluruz

            }
            System.out.println("");

        }

    }



}
