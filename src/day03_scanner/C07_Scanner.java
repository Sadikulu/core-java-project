package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir önceki soruyu tek seferde kullanıcıdan
        // tüm bilgileri alarak yapınız
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim soyisim ve yaşınızı giriniz\naralarda enter tuşuna basınız");

        String isim=scan.nextLine();
        String soyIsim=scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler="+isim+","+soyIsim+","+yas);

    }
}
