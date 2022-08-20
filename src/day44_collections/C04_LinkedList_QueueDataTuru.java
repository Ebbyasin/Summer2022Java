package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Adem");
        queue.add("Zeynep");
        queue.add("Hpolat");
        queue.add("Kadir");

        // queue kuyruk demektir,sira onemlidir gelen sona gelir,giden bastan gider.

        System.out.println("queue = " + queue); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println("queue.remove() = " + queue.remove()); //Adem -> direk en bastakini siler

        System.out.println("queue = " + queue); // [Zeynep, Hpolat, Kadir]

        System.out.println("queue.remove(\"Hpolat\") = " + queue.remove("Hpolat")); // true Hpolat sildi.

        System.out.println("queue = " + queue); // [Zeynep, Kadir]

        System.out.println("queue.element() = " + queue.element());// Zeynep
        System.out.println("queue.peek() = " + queue.peek());// Zeynep

        Queue<String> queue2 = new LinkedList<>(); //bos

        //System.out.println("queue2.element() = " + queue2.element()); //throws exception NoSuchElementException
        System.out.println("queue2.peek() = " + queue2.peek()); // null
        // peek() ve element() silmeden ilk elementi bize dondurur.
        // aralarindaki fark bos liste olursa peek null doner,element exception firlatir.

        queue.offer("Ahmet"); // sona ekledi
        queue.offer("Sefa");
        System.out.println("queue = " + queue); // [Zeynep, Kadir, Ahmet, Sefa]

        System.out.println("queue.poll() = " + queue.poll()); // Zeynep en bastakini hem sildi hem de bize dondurdu.
        System.out.println("queue = " + queue); // [Kadir, Ahmet, Sefa]


        //System.out.println("queue2.remove() = " + queue2.remove()); // NoSuchElementException
        System.out.println("queue2.poll() = " + queue2.poll()); // null


    }
}
