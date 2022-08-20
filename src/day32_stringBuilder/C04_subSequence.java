package day32_stringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);//StringBuilder da substring methodu bize String dondurdugu icin SB in eski halini degistirmez

        //Bu method String dondurdugu icin StringBuilderin eski halini degistiremez
        System.out.println(sb);// Kayra

        sb.subSequence(0,3);

        System.out.println(sb);// Kayra



    }
}
