package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        /*Kullanicidan gun ismini yazmasini isteyin.
        Girilen isim gecerli bir gun ise gun
        isminin 1.,2. ve 3.harflerini ilk harf buyuk
        diger ikisi kucuk olarak yazdirin, gun ismi
        gecerli degilse "Gecerli gun ismi giriniz" yazdirin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        }else if (gun.equals("pazr")){
            System.out.println("Paz");
        }else{
            System.out.println("gecerli bir gun ismi giriniz");
        }
    }
}
