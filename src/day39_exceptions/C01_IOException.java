package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Javada bilgisayarımızdaki bir dosyaya erişmek istiyorsak
        FileInputStream classından yardım alırız
        Aynı şekilde javadan bilgisayarımızdaki bir dosyaya ekleme
        veya update yapmak istersek FileOutputStream classından
        yardım alırız
         */
        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Görüldüğü gibi compile time'da altını kırmızı çizen her
        durum CTE değildir
        Javada bazı exception'larda compile time exception'dır
        özellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dır

        Compile time exception oluştuğunda java çözüm için iki ihtimal önerir
        1-try-catch ile çevrelemek
        2-metod signature'ına throws keywords ile beklenen exception
        türünü yazmak

        throws exception, sadece olayın farkında olduğumuzun deklarasyonudur
        exception handle edilmesinde hiçbir rolu yoktur
        Yani try-catch ile kontrol altına aldığımız exception'larda
        kod çalışmaya devam ediyordu
        Ancak throws exception yazdığımızda java bir exception ile
        karşılaşırsa hiçbir şey yapmamışız gibi hata mesajı yayınlayıp
        çalışmayı durdurur

         */
    }
}
