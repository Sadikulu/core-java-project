package day11_stringManupulations;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
        //Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen email adresinizi yazınız");
        String email = scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi ");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
