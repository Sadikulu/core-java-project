package day25_constructor;

public class Car {
    /*
    bu class bizim kalıphanemiz
    bir araba oluşturmak için ihtiyacımız olan variable ve metodları
    bu classta belirleriz. sonra farklı classlarda araba oluşturmamız gerekirse
    bu classtan bir obje oluşturup burada belirlenen variable ve
    metodlara göre araba üretiriz
     */
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;



    public void benzliArac(){
        System.out.println("Bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hız yapar");
    }
}
