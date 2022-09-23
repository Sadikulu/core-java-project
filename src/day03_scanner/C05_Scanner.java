package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // kullanıcıda iki sayı alıp bu sayıların çarpımını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("çarpım="+sayi1*sayi2);


    }
}
