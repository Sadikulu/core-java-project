package day08_ifStatements;

import java.util.Scanner;

public class C04_NastedIfElse {
    public static void main(String[] args) {
        /*Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayı 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir tamsayı giriniz");
        int sayi=scan.nextInt();
        // sayının 5'e bölünüp bölünmemesi
        // sayını son basamagının 0 olup olmaması
        if (sayi<1000 || sayi>9999){
            System.out.println("lütfen 4 basamaklı sayı giriniz");
        } else if (sayi%5==0) {
            if (sayi%10==0){
                System.out.println("5'e bölünen çift sayıdır");
            }else{
                System.out.println("5'e bölünen tek sayıdır'");
            }

        }else{
            System.out.println("tekrar deneyiniz");
        }
    }
}
