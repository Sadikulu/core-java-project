package day04_datacasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf+1);//kod budurumda önce sağdaki işlemi yapar
                             //char yeniHarf=97+1=98
                             // char 98 olamayacağı için java hata verir
        System.out.println("yeniHarf = " + yeniHarf);

        /*bazen bir variableye oluşturduğu data türü dışında bir
        değer atanabilir.bunlardan bazısını java kabul eder.

        java eğer bu değer atamasında sorun oluşacağını;
        data kaybı olcağı veya datanın başkalaşabileceğini görürse
        bu durumda otomatik olarak kabul etmez
        sizden eğer bu atamayı istiyorsanız sotumluluğu almanızı ister.
         */

        int sayi1=(int)7.3;
        System.out.println("sayi1 = " + sayi1);//7
        double sayi2=10;
        System.out.println("sayi2 = " + sayi2);//10.0
        int sayi3='c';
        System.out.println("sayi3 = " + sayi3);//99
        char harf2=98;
        System.out.println("harf2 = " + harf2);//b



    }
}
