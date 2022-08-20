package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla( satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {

        // yukarıdaki satisfiyati burada declare edilmis, yukarısı ile burası aynı variable değildir.
        // iste bu farklı satis fiyatlari icin java pass by value kullanıyor.
        //java variable ı buraya gecirmez, ama variable ın değerini gecirir, biz gözlerimizle satisFiyati görürüz ama java burada 100 görür.
        //yani satisFiyatinin bir kopyasını gecirir diyebiliriz.
        //bundan sonra bu scope ta kullanacağımız değisiklikler benim main body mde yazan değerimi değil buradaki değeri kullanir.
        //buradaki satisFiyatinin adını xyz de yapabilirsin hangi isim oldugu hic bir önemi yok,
        //farkli methodlara gidis yapıyor olsak bile aynı isimleri kullanırız ki karısıklık olmasın. tek amac budur
        // ne yazarsanız yazın java sizin satisFiyati parametresi olustururken bunun değirini buraya gecirir
        //ve siz arka arkaya isterseniz 5 kere indirim yapın her seferinde indirimliFiyat 75 yazar.

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);
        return indirimliFiyat;


         /*
        java da program yaparken genelde main methodda kullandığımız variable ismi ne ise kodu rahat takip edebilmek icin
        constructor da da method da da aynı ismi kullanmayı tercih ederiz
        yani burada satisFiyati ismini kullandiysam, asağıda da satisFiyati ismini kullanmayi tercih ederiz
        ama scope diye bir konu gördük herkesin variable ı kendine dedik
        yukarıdaki satisFiyatini yeni bir variable olusturmadan asağıda kullanamayiz.
        bir tane main methodun scope u var local scope 1 diyelim
        bir tane de method scope u var local scope2 diyelim
        biz programı calıstırırken sürekli scope lar arasında hareket derezi, neden cunku main methodlar bizim robotlarımızdı
        sürekli bizim adımıza bazı islemleri yaparlardı. 100 tl ye yaptığınız indirimde birinci müsteri 90 a ikinci 80 a 3. 70 e alırsa olmaz
        benim her müsteri icin indirimli fiyatim 90 dır
        yani ilk scope taki satıs fiyati ikinci scope icin gecerli değildir.
        ayni scope ta aynı isimde iki variable olusturulamaz
        data türü farklı olsa bile aynı isimde iki variable olusturulamaz
        farklı scopelarda olusturulabilir.
         */
    }
}
