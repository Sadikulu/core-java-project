package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*kullanıcıdan ismini soyismini ve yaşını alıp
        girilen bilgiler= seyfi çapar 34 şeklinde yazdırın*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        /*string verileri scanner ile alırken
        next(); ilk boşluğa kadar olan kısımı alır
        nextline(); satırın sonuna kadar ne yazarsak alır
        Not:eğer ardarda birden fazla strin değer alacaksak
         nextline() alırız
         */
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");

        String soyIsim=scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");

        int yas=scan.nextInt();

        System.out.println("girilen bilgiler="+isim+" "+soyIsim+" "+yas);

    }
}
