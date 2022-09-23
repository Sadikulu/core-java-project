package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*kullanıcıdan toplanmak üzere sayılar alın sayıların toplamı
        500'ü geçince satıların toplamını ve kaç sayı toplandığını yazdırın
        13 sayı girdiniz toplamları 567
         */
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int sayi = 0;
        int sayac=0;
        while (toplam<500) {
            System.out.println("lütfen toplamak için sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac+" sayı girdiniz ve toplamları : "+toplam);
    }
}
