package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MetodCreation {
    public static void main(String[] args) {
        //verilen üç bsamaklı sayının rakamları toplamını
        //yazdıran bir metod oluşturalım
        int input=423;
        rakamlarıTopla(input);
        C01_MethodCreation.terstenYazdır("nuri");
        C04_MethodCreation.toplam(6,3);
    }
    public static void rakamlarıTopla(int input){
        int temp=input;
        int rakamlarToplamı=input%10;
        input/=10;
        rakamlarToplamı+=input%10;
        input/=10;
        rakamlarToplamı+=input%10;
        input/=10;
        System.out.println("Girilen " +temp +" sayısının rakamlar toplamı: " + rakamlarToplamı);

    }
}
