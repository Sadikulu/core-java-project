package day07_IfStatement;

import java.util.Scanner;

public class C07_IfElseIfStatement {
    public static void main(String[] args) {
        /*bir önceki soruda kullanıcı negatif deger girerse uyaralim
          Not:birden fazla if-else if birbirine baglanmisse
          son durum önemlidir
          eger else ile bitiyorsa bütün ihitimaller kapsaniyor demektir
          ama else if ile bitiyorsa kapsanmayan ihitmaller olabilir*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int sayi= scan.nextInt();
        if (sayi<0){
            System.out.println("lütfen gecerli bir sayi giriniz");
        }else if (sayi<65){
            System.out.println("emekli olamazsin, " + (65-sayi)+ " yil daha calismalisin");
        }else {
            System.out.println("emekli olabilirsin");
        }
    }
}
