package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tst1=new Tasit();
        tst1.setTasitTuru("Tir");
        System.out.println(tst1.getTasitTuru());// parantez icindeki kisimda getTasitTuru() 'de method call var.burdan
        // tasit class indaki getTasitTuru methoduna gidiyor,tek satirlik.normalde ben private olan tasit turu variable
        // ina baska class dan ulasamayacagim icin,gittigim public (public metodu oradaki private lara ulasabiliyor)
        // sayesinde ulasiyorum,return tasit turune ulasiyor onu ordan  alip bana donduruyor.
    }


}
