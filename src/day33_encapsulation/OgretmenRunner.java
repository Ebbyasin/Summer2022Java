package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tulay"); //ogrenci1 in ismi set edilmis
        System.out.println(ogr1.getIsim());// burda da get edilmis.get olmasa goremezdik
        /* iki kuralimiz var encapsilution da.
        iki adimiz var;kendi variable larimizi private yapıyoruz,getter ve setter lari public yapiyoruz

        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }

}
