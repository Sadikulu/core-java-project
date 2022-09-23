package day26_constructor;

public class Araba {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
    marka=markaR;
    model=modelR;
    yil=yilR;
    fiyat=fiyatR;
    }

    public Araba(){

    }
        /*
       biz herhangi bir constructor oluşturduğumuzda  java default
       constructorı siler eğer biz projede bir sorun yaşanmasını
       istemiyorsak mutlaka default konstructor yerine parametresiz
       bir constructor oluşturmalıyız
        */

    public void benzliArac() {
        System.out.println("Bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " km hız yapar");
    }

}
