package day25_constructor;

public class Carrunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka :"+car1.marka+"\n"+"model : "+car1.model
                +"\n"+"Yıl : "+car1.yil+"\n"+"Fiyat : "+car1.fiyat);
        System.out.println("");
        Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka :"+car2.marka+"\n"+"model : "+car2.model
                +"\n"+"Yıl : "+car2.yil+"\n"+"Fiyat : "+car2.fiyat);
    /*
    herhangi bir obje üzerinden bir variable oluşturmaya çalıştığımızda
    java değeri şu sıralama ile arar
    1- o obje oluşturulduktan sonra bir değer atandı mı
    2- objenin oluşturulduğu classta variableye bir değer atanmış mı
    3- o zaman data türüne göre java default değeri atar

     */
    }
}
