package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        int[] sayilar={5,7,1,5,4,7,9};

        //Array i Arrays classini kullanarak natural(sayilarsa kucukten buyuge,string se
        // harf sirasina gore)sirali hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [1,4,5,5,7,7,9]



    }
}
