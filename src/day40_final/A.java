package day40_final;

public class A {
    protected String isim="Cüneyt";
    final static String OKUL="Yıldız Koleji";
    /*
    bir variable final olarak tanımlandıysa başka classlardan
    veya içinde olduğumuz class'da bu variable'ye başka değer
    atanması mümkün değildir.
    medem ki değeri değiştirilemiyor genelde static de yaparak
    bu variable erişim kolaylaştırılabilir
    genelde static final olarak belirlenen variable isimleri
    büyük harfle yazılır
     */
    final void finalMethod(){
        System.out.println("Final metodlar overridide edilemez");
        /*
        bir metodu final olarak işretlerseniz bu metod değiştirilemez
        yani üzerine yazılamaz(override edilemez)
         */
    }
}
