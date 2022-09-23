package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Excaptions {
    public static void main(String[] args) {
        //ödev: bu işlemi while loop içinde istenen sonuç
        // verene kadar tekrar etsin
        String[] urunler = {"Nutella", "Çokokrem", "Süt", "Çay", "Fındık"};
        Scanner scan;
        int istenenSıra = 0;
        while (true) {
            scan=new Scanner(System.in);
            System.out.println("İstediğiniz ürünün sıra nosunu giriniz");
            try {
                istenenSıra=scan.nextInt();
                System.out.println("aradığınız ürün : " + urunler[istenenSıra - 1]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Urun indexi için bir tam sayı girmeniz gerekli");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiğiniz sıra listemizde bulunmuyor" +
                        "\nSıra numarası en fazla : " + urunler.length + " olabilir");
            }
        }
    }
}
