package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=15;
        char harf='a';
        String str="banan";
        System.out.println(harf + sayi);//15a olmadı 112 oldu
        System.out.println(str+harf);//banana yazdı
        System.out.println(harf+2);//99 yazdı
        System.out.println(str+sayi+harf);//banan15a yazdı
        /*  1-char data türü işleme girdiği değişkenin türüne göre
        farklı davranabilir.eğer matematiksel işleme girdiği
        variable sayısal bir değerse sayı gibi daranır.
        char yeniHarf=harf+2 java önce sağdaki işlemi yapar
        sağda int+char görünce ascii değerini alır.sonra
        atama işlemi yapmaya çalışır.
        char yeniHarf=99; bu atama java açısından kabul edilmez
        2- str+harf);String variable çok güçlüdür, hangi data türü
        ile işleme girerse girsin onu kendine benzetir.
         */
        // peki konsolda 15a görmek istersek nasıl yazdırabiliriz
        System.out.println(""+sayi+harf);//15a yazar
        char deger='1';
        System.out.println(deger+harf);// 1=49 ve a=97 bu nedenle 146 yazar

    }
}
