package day25_constructor;

public class C01 {
    /*
    java oop konsept kullandığı için oluşturulan her bir class'in
    ihityaç olduğunda obje üretebilmesine uygun dizayn etmistir.

    ama her classtan obje üretilmeyebilir
    bunun için java ihtiyaç halinde kullanılabilmesi için
    her classta default bir constructor koymuştur

    bu default constructor
    class'tan obje oluşturulduğunda otomatik olarak çalışır

    örneğin bu class'ta bir constructor görülmemesine rağmen
    C02 class'ında içinde olduğumuz C01 class'ından bir obje
    oluşturabşildik
     */
    int sayi;
    public void deneme(){
        System.out.println("C01 den deneme metod çalışır");

    }
}
