package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {

    public static void main(String[] args) {
       // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin

        //sort kullanmazsanız nested loop kullanmak gerek, o yüzden sort daha kolay .

        int [] arr={2,3,5,6,3,5,4,1,9,6,3}; //bir array olusturduk

        int[]unigueArray=UnigueArrayOlustur(arr);//array de method olusturuyoruz //return olması icin int variable olusturup methodu olusutruyoruz
        System.out.println(Arrays.toString(unigueArray));



    }

    public static int[] UnigueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]

        //array i olusturmak icin önce sayıyı bilmemiz gerek,
        // kac tane unique var bilmiyoruz o yüzden suanda array i olusturamayı o yüzden önce List olusturmalıyız

        List<Integer> benzersizList = new ArrayList<>();
        //yanındaki elente esit olmayanlari listeye ekliyor.
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i]!=arr[i+1]){
                benzersizList.add(arr[i]);//esitdeğil ise arr i yi ekleyeceğiz yani benzersiz olanları ekleyeceğiz

                //bizden array istiyor o yüzden


            }
            //son elementi kontrol edip yoksa listeye ekliyoruz burada
            if(!benzersizList.contains(arr[arr.length-1])){
                benzersizList.add(arr[arr.length-1]);
            }

        }

        //benzersiz list==> 1,2,3,4,5,6,9
        //benzersiz listenin size bilgisini kullanarak bir array olusturduk

        int[] tekrarsizArr=new int[benzersizList.size()];

        //benzersiz listedeki tum elemanlari, yeni array'e atadik
        for (int i = 0; i <tekrarsizArr.length; i++) {
            tekrarsizArr[i]=benzersizList.get(i);

        }
        //olusturdugumuz yeni array'i main method a dondurduk.
        return tekrarsizArr;




    }
}
