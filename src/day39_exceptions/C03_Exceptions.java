package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str= str = "123a5";
        int sayi=0;
        try {
            sayi=Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdığınız değer sadece rakam olmalı");
        }catch (Exception e) {
            System.out.println("Öngörülemeyen bir hata oluştu");
        }

        System.out.println("Sayinin karesi : "+(sayi*sayi));


        /*
        kullanıcıdan bir String değer alıyor ve bunu int'e çeviriyorsak
        NumberFormatException ile karşılaşabileceğimizi öngörürüz
        NumberFormatException aldığımızda kodun durmamasını istiyorsak
        try-catch ile çevreleyebiliriz
        eğer bilmediğim bir exception da oluşursa kod durmasın istiyorsak
        bir catch cümlesi daha ekleyip ona en geniş exception yazabiliriz
         */

    }
}
