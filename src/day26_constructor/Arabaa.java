package day26_constructor;

public class Arabaa {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;// bu yil neden once String yapip sonra int yaptik?SOR ONEMLİ***
    public int fiyat;

    public Arabaa(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;

    }
    public Arabaa(){

    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}
