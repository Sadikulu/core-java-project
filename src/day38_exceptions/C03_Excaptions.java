package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Excaptions {
    public static void main(String[] args) {
        /*
        marketteki tüm ürünleri bir arrayde tuttuğumuzu varsayalım
        kullanıcıya index sorup o indexteki ürünü yazdıran bir
        program hazırlayalım
        kullanıcı ürün sayısında büyük bir index girerse exception
        vermesinin önüne geçelim
         */
        String[] urunler = {"Nutella", "Çokokrem", "Süt", "Çay", "Fındık"};
        Scanner scan = new Scanner(System.in);
        System.out.println("İstediğiniz ürünün sıra nosunu giriniz");
        int istenenSıra = 0;
        try {
            istenenSıra = scan.nextInt();
        } catch (InputMismatchException e /*deneme*/) {//burdaki "e" variable, ismi herşey olabilir
            System.out.println("Urun indexi için bir tam sayı girmeniz gerekli");

        }
        /*
        catch bloğunun önündeki parantezde exception classının
        ismi ve yanında yakalanan exception'ı atadığımız
        variable'ın ismi olur(e)

        eğer yakalanaan exception ile ilgili bilgileri
        kullanıcıya vermek isterseniz bu objeyi kullanabilirsiniz
        eğer exception ile ilgili kullanıcıya bilgi verme ihtiyacı
        yoksa catch body içinde e kullanılmasada kod çalışır
         */
        try {
            System.out.println("aradığınız ürün : " + urunler[istenenSıra - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiğiniz sıra listemizde bulunmuyor" +
                    "\nSıra numarası en fazla : " + urunler.length + " olabilir");
        }
    }
}
