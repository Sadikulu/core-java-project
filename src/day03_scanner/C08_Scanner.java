package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp, ilk harfini büyük harf yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        /* java scanner clasında nextchar metodu yoktur.
        bunun yerine string olarak ilk kelimeyi alıp
        onunda ilk harfini alabiliriz
         */
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi="+ilkHarf);

    }
}
