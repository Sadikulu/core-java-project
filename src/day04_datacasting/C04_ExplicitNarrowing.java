package day04_datacasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=500;
        byte sayi2=(byte) sayi1;
        System.out.println("sayi2 = " + sayi2);

        /*-12 olur. çünkü dönüşmesi istenen değer byte'ın
        -128 ile +127 arasında döner durur.örneğin
        130 yazdığımızda -128e gider ve ordan geriye doğru
        sayar ve -126 yazar.*/
        
        /*geniş data türündeki değeri dar data türündeki
        variableye atamak isterseniz java sizin geniş data 
        türündeki değerin dar data türünün sınırlarına uyup uymayacağını
        çalıştırana kadar bilemez.java risk almaz ve riski sıfıra
        indirmek için sorun olursa sorumluluğu kkabul etenizi ister.
        bunun için değerin önüne parantez içerisinde istediğiniz data türünü
        yazmanızı ister.
        bu riski üstlendiğmizde 3 durum oluşabilir
        1-bizim değerimiz dar kalıp değerlerine uygun olursa hiçbir kayıp olmaz
        2-double bir sayiyi inte cast etmek gibi durumlarda data kaybı yaşanabilir
        3-geniş kalıptan değeri dar kalıba koyduğumuzda sınırları aşan durumlarda
        veri başkalaşabilir.*/

        
        
    }
}
