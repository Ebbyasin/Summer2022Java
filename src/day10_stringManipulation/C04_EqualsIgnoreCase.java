package day10_stringManipulation;

public class C04_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="ali can";
        String str3="ALİ CAN";
        String str4="ALİ Can_";

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println(str2.equals(str2.equals(str3)));
        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

    }
}
