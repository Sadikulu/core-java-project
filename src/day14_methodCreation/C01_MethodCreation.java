package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi
        //tersten yazdıran bir metod oluşturun

        terstenYazdır("okan");
        C04_MethodCreation.toplam(6,5);//11


    }
    public static void terstenYazdır(String input){
        String tersInput=input.substring(3)
                +input.substring(2,3)+input.substring(1,2)
                +input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazılışı: " + tersInput);;
    }
}
