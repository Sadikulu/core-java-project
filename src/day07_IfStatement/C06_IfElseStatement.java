package day07_IfStatement;

import java.util.Scanner;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        /*Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int sayi= scan.nextInt();
        if (sayi<65){
            System.out.println("emekli olamazsin, " + (65-sayi)+ " yil daha calismalisin");
        }else{
            System.out.println("emekli olabilirsin");
        }
    }
}
