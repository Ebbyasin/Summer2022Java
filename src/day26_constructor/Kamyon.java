package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;
    public Kamyon(String marka, String model, int yil, int fiyat) {// kamyonrunner classında olusturdugumuz kamyon2 icin kendi parametreli consturcteramız
        //buradaki markayı yukarıdaki markaya esitleyelim
        this.marka=marka; //inctence marka değerine benim gönderdiğim marka değerini atamak istiyorum ama hepsini gri yaptı, cünkü markıy markaya niye esitliyorsun diyor o yüzden ikiside aynı oldugu icin gri
        this.model=model;//bu yüzden yanına K yazdık
        this.yil=yil;//yukarıdaki instance variable ımıza atıyoruz, yani instance variableımızda değisiyor
        this.fiyat=fiyat;//model belirtilmedi yerine burada atanan değerler oluyor (kamyon2 de girdiğimiz parametreler))
        /*
        bizim temel amacımız KamyonRunner da (obje olusturulan class ta )argument olarak girilen değerin
        Kamyon class ında instance variable a atanması.
        Ancak scope konusunda öğrendiğimiz gibi
        Kamyon constructer ı scope unda marka oldugu icin instance Marka ya gitmiyor.
        Bu karısıklığı gidermek icin instance variableları
        belirli hale getirmemiz lazım
        Java bunun icin this keywordu olusturmustur.
        basina this. koyarsak bu class ın instance ı olan marka, model yıl demis oluruz
        Genel kullanim acısından this keyword'u kodu herkesin anlamasını kolaylastırdığı icin
        tercih edilir.
         */
    }
    public Kamyon(String marka, String model) { //iki parametreli bir constructer olusturmak icin yeniden
        this.marka = marka;     //sag tus, generate ve consturcter sec daha sonra eklemek istediklerini sec (KamyonRunner class icin)
        this.model = model;
    }
    public Kamyon(){//ölen constructer yerine bunu olusturduk related problem veriyordu
    }
    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                        "\nmodel=" + model +  //asağıda yazsın istiyorsak her seferinde n yapabiliriz.
                        "\nyil=" + yil +
                        "\nfiyat=" + fiyat ;
        //toString methoduna tıklayıp hepsini yazdırırsak tek tek yazdığımız herseyi yazdırır.
        //toString methodu icin sağ tus yapıp generate diyoruz, oradan toString e gelioruz, ister hepsini ister istediklerini sec
    }
}
