package day26_constructor;

public class Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
    this.marka = marka;
    this.model = model;
    this.yil = yil;
    this.fiyat = fiyat;
    /*
    bizim temel amacımız KamyonRunnerda argüment olarak
    girilen değerin Kamyon clasında instance variable atanması
    ancak scope konusunda öğrendiğimiz gibi Kamyon constructor
    scopunda marka olduğu için instance markaya gitmiyor

    bu karşıklığı gidermek için instance variableleri belirli hale
    getirmemiz lazım java bunun için this keywordu oluşturmuştur.

     genel kullanım açısından this keywordu kodu herkesin
     anlamasını kolaylaştırdığı için tercih edilir
     */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\n marka = " + marka +
                "\n model = " + model +
                "\n yil = " + yil +
                "\n fiyat = " + fiyat ;
    }
}
