package day07_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {
        /*kullanıcıdan gün ismini alin ve haftaiçi veya haftasonu yazdirin
        örn= gun=pazar output="hafta sonu"
             gun=sali output="hafta içi"
             ***String için equals metodunu kullnın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        //kullanıcı günü büyük küçük harf girebilir
        // her halukarda pazar (küçük harf olacak
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("haftasonu");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsambar") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("hafta içi");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsambar") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("lütfen geçerli bir gun ismi giriniz");
        }
    }
}
