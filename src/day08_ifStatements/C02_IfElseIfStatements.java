package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”, 50=-60 arasi “C”, 60=-80 arasi “B”,
        80=’nin uzerinde ise “A”
        gecersiz not girildiginde uyari verelim*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 0'dan 100' kadar bir not giriniz ");
        double note=scan.nextDouble();
        if (note<0 || note>100){
            System.out.println("lütfen gecerli bir not giriniz");
        } else if (note<50) {
            System.out.println("notunuz= D");
        } else if (note<60) {
            System.out.println("notunuz= C");
        } else if (note<80) {
            System.out.println("notunuz= B");
        } else {
            System.out.println("notunuz= A");
        }
    }
}
