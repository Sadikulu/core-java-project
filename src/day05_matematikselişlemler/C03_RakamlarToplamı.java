package day05_matematikselişlemler;

import java.util.Scanner;

public class C03_RakamlarToplamı {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;

        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;

        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;

        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;

        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami = " + rakamlarToplamı);



    }
}
