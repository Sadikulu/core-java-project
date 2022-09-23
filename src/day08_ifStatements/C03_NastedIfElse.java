package day08_ifStatements;

import java.util.Scanner;

public class C03_NastedIfElse {
    public static void main(String[] args) {
        /*emeklilik kontrolu yapan bir program yazınız cinsiyet
        olarak e(erkek) veya K(kadın) karejterlerini kabul etsin farklı
        bir harf veya sembol girerse hata mesajı versin
        emeklilik için kadınlarda yaş sınırı 60
        erkeklerde 65 olsun
        negatif veya 80 üzeri yaş girilirse hata mesajı versin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi kadın ise (K) erkek ise (E) yazınız");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli yaş giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli bir yaş giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }


        }

    }
}
