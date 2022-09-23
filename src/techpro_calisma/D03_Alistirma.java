package techpro_calisma;

import java.util.Scanner;

public class D03_Alistirma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
        sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp
        ekrana bastırılan programı yazın.*/
        /*System.out.println("lütfen ders notlarını her nottan sonra entere basarak giriniz");
        double mat= scan.nextDouble();
        double fiz= scan.nextDouble();
        double kim= scan.nextDouble();
        double tür= scan.nextDouble();
        double tar= scan.nextDouble();
        double müz= scan.nextDouble();
        System.out.println("ortalama= "+(mat+fiz+kim+tür+tar+müz)/6);*/


               /* Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın. */



        /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        KDV tutarını hesaplayı ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;*/
        /*System.out.println("lütfen kullanicidan alinan para değerini giriniz");
        double alinanTutar= scan.nextDouble();
        double kdv=0.18;
        double kdvliFiyat=alinanTutar+(alinanTutar*kdv);
        System.out.println("ürünün kdv'li fiyati= "+kdvliFiyat);*/

        /*Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
        hesaplayan programı yazınız.*/



        /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve
        hipotenüsü hesaplayan programı yazın.*/
        /*System.out.println("lütfen üçgenin dik kenarlarını giriniz");
        double kenarUzunlugu= scan.nextDouble();
        double kenarUzunlugu2= scan.nextDouble();
        double hipotenüs=(kenarUzunlugu*kenarUzunlugu)+(kenarUzunlugu2*kenarUzunlugu2);
        hipotenüs=Math.sqrt(hipotenüs);
        System.out.println("hipotenüs= "+hipotenüs);*/

        /*Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını
        hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                𝑢 = (a+b+c) / 2
        Alan Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/



        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
        /*System.out.println("lütfen gidilen yol km'sini giriniz");
        double gidilenYol= scan.nextDouble();
        double kmBasinaTutar=2.20;
        double tutar=(gidilenYol*kmBasinaTutar)+10;
        System.out.println("tutar= "+tutar);*/

    }
}
